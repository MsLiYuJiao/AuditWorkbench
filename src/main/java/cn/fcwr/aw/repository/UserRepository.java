package cn.fcwr.aw.repository;


import cn.fcwr.aw.bean.Roles;
import cn.fcwr.aw.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    public List<User> findByName(String name);

}
