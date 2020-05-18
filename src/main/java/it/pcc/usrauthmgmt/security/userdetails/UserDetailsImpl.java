package it.pcc.usrauthmgmt.security.userdetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import it.pcc.usrauthmgmt.usr.persistence.model.User;

public class UserDetailsImpl implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1160914839344337982L;
	
	private Long userId;

	private String username;

	private String email;

	private String password;

	private Boolean active;

	private String locale;
	
	private Collection<? extends GrantedAuthority> authorities;
	
	public static UserDetailsImpl build(User user) {
		List<GrantedAuthority> authorities = user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getName()))
				.collect(Collectors.toList());
		

		return new UserDetailsImpl(
				user.getUserId(), 
				user.getUsername(), 
				user.getEmail(),
				user.getPassword(), 
				user.getActive(),
				user.getLocale(),
				authorities);
	}
	

	public UserDetailsImpl(Long userId, String username, String email, String password, Boolean active, String locale,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.password = password;
		this.active = active;
		this.locale = locale;
		this.authorities = authorities;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.active;
	}

	public Long getUserId() {
		return userId;
	}

	public String getEmail() {
		return email;
	}

	public String getLocale() {
		return locale;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		UserDetailsImpl other = (UserDetailsImpl) obj;
		return Objects.equals(userId, other.userId);
	}
	
	

}
