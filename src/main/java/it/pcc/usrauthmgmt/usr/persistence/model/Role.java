package it.pcc.usrauthmgmt.usr.persistence.model;

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
@Table(name = "USR_ROLE")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ROLE_ID")
	private Long roleId;

	@Column(name = "NAME", length = 20)
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@ManyToMany(mappedBy = "roles")
	private Set<User> users;
	
	@ManyToMany
	@JoinTable( 
			name = "USR_ROLE_PRIVILEGE", 
			joinColumns = @JoinColumn(
					name = "ROLE_ID", referencedColumnName = "ROLE_ID"), 
			inverseJoinColumns = @JoinColumn(
					name = "PRIVILEGE_ID", referencedColumnName = "PRIVILEGE_ID"))
	private Set<Privilege> privileges;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}
	
	

	

}
