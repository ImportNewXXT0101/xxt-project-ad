package com.project.ad.service;

import com.project.ad.exception.AdException;
import com.project.ad.vo.CreateUserRequest;
import com.project.ad.vo.CreateUserResponse;

/**
 * @Description: 用户service
 * @Author: ChengChuanQiang
 * @Date: 2019/5/4 10:14
 */
public interface IUserService {

    /**
     * 创建用户
     * @param request 创建用户信息
     * @return 用户信息
     * @throws AdException 异常
     */
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
