package cn.fcwr.aw.repository;

import cn.fcwr.aw.bean.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RolesRepository extends JpaRepository<Roles,Integer> {
    public List<Roles> findByName(String name);
}
