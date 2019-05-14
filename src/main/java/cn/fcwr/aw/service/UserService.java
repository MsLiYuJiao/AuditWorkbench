package cn.fcwr.aw.service;

import cn.fcwr.aw.bean.User;
import cn.fcwr.aw.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    UserRepository userRepository;

    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }

}
