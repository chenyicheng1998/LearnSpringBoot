package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.pojo.dto.UserDto;
import org.springframework.stereotype.Service;

@Service     // spring的bean
public interface IUserService {
    /*
    * 插入用户
    * @param user
    * @return
    * */
    User add(UserDto user);

    /*
     * 查询用户
     * @param userId 用户id
     * @return
     * */
    User getUser(Integer userId);

    /*
     * 修改用户
     * @param user 修改的用户对象
     * @return
     * */
    User edit(UserDto user);

    /*
     * 修改用户
     * @param userId 用户id
     * @return
     * */
    void delete(Integer userId);
}
