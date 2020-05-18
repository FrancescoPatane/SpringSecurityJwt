package it.pcc.usrauthmgmt.auth.jwt.rest.output;

import java.io.Serializable;
import java.util.Collection;

public class JwtResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3659329321606072627L;
	
	
	private String token;
	
	private String type = "Bearer";
	
	private String userId;
	
	private String username;
	
	private String email;
	
	private Collection<String> roles;

	public JwtResponse(String accessToken, String userId, String username, String email, Collection<String> roles) {
		this.token = accessToken;
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public String getUserId() {
		return userId;
	}

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public Collection<String> getRoles() {
		return roles;
	}

}
