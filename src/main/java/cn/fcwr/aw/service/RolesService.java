package cn.fcwr.aw.service;

import cn.fcwr.aw.bean.Roles;
import cn.fcwr.aw.repository.RolesRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RolesService {

    @Resource
    RolesRepository rolesRepository;

    public List<Roles> findByName(String name){

        return rolesRepository.findByName(name);
    }
}
