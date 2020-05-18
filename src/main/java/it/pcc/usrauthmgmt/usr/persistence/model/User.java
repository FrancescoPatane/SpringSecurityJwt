package it.pcc.usrauthmgmt.usr.persistence.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USR_USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID", nullable = false)
	private Long userId;

	@Column(name = "USER_NAME", unique = true, length = 50)
	private String username;

	@Column(name = "EMAIL", unique = true, length = 50)
	private String email;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "LOCALE", length = 5)
	private String locale;

	@ManyToMany
	@JoinTable( 
			name = "USR_USER_ROLE", 
			joinColumns = @JoinColumn(
					name = "USER_ID", referencedColumnName = "USER_ID"), 
			inverseJoinColumns = @JoinColumn(
					name = "ROLE_ID", referencedColumnName = "ROLE_ID")) 
	private Set<Role> roles;
	
	

	public User() {
		super();
		this.roles = new HashSet<>();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
//	   @Id
//	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    private Long id;
//	 
//	    @Column(unique=true)
//	    private String email;
//	    private String password;
//	    private boolean enabled;
//	    private String securityQuestion;
//	    private String securityAnswer;
//	    private String locale;
//	    
//	    @ManyToMany
//	    @JoinTable( 
//	        name = "user_role", 
//	        joinColumns = @JoinColumn(
//	          name = "user_id", referencedColumnName = "id"), 
//	        inverseJoinColumns = @JoinColumn(
//	          name = "role_id", referencedColumnName = "id")) 
//	    private Set<Role> roles;
//	    
//	    
//
//		public User() {
//			super();
//		}
//
//
//		public Long getId() {
//			return id;
//		}
//
//		public void setId(Long id) {
//			this.id = id;
//		}
//
//
//		public String getEmail() {
//			return email;
//		}
//
//		public void setEmail(String email) {
//			this.email = email;
//		}
//
//		public String getPassword() {
//			return password;
//		}
//
//		public void setPassword(String password) {
//			this.password = password;
//		}
//
//		public boolean isEnabled() {
//			return enabled;
//		}
//
//		public void setEnabled(boolean enabled) {
//			this.enabled = enabled;
//		}
//
//
//		public Collection<Role> getRoles() {
//			return roles;
//		}
//
//		public void setRoles(Set<Role> roles) {
//			this.roles = roles;
//		}
//	    
//
//
//		public String getSecurityQuestion() {
//			return securityQuestion;
//		}
//
//		public void setSecurityQuestion(String securityQuestion) {
//			this.securityQuestion = securityQuestion;
//		}
//
//		public String getSecurityAnswer() {
//			return securityAnswer;
//		}
//
//		public void setSecurityAnswer(String securityAnswer) {
//			this.securityAnswer = securityAnswer;
//		}
//
//		public String getLocale() {
//			return locale;
//		}
//
//		public void setLocale(String locale) {
//			this.locale = locale;
//		}

	
	



}
