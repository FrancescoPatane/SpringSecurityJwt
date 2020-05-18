package it.pcc.usrauthmgmt.usr.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.pcc.usrauthmgmt.usr.persistence.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
