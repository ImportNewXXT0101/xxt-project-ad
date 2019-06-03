package com.project.ad.service;

import com.project.ad.exception.AdException;
import com.project.ad.vo.CreativeRequest;
import com.project.ad.vo.CreativeResponse;

/**
 * @Description:
 * @Author: ChengChuanQiang
 * @Date: 2019/5/4 14:20
 */
public interface ICreativeService {

    /**
     * 创建创意
     * @param request 请求
     * @return 创意
     * @throws AdException 异常
     */
    CreativeResponse createCreative(CreativeRequest request) throws AdException;
}
