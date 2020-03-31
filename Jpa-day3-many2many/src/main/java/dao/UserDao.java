package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pojo.User;

public interface UserDao extends JpaRepository<User,Long>,
        JpaSpecificationExecutor<User> {
}
