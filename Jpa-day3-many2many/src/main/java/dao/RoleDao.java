package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pojo.Role;

public interface RoleDao extends JpaRepository<Role,Long>,
        JpaSpecificationExecutor<Role> {
}
