package pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sys_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_age")
    private Integer userAge;

    @JoinTable(
            name = "sys_user_role",
            joinColumns = {@JoinColumn(name = "sys_user_id",
                    referencedColumnName = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "sys_role_id",
                    referencedColumnName = "role_id")}
    )
    @ManyToMany(targetEntity = Role.class)
    private Set<Role> users = new HashSet<>();

    public Set<Role> getUsers() {
        return users;
    }

    public void setUsers(Set<Role> users) {
        this.users = users;
//        adw
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
