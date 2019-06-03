package com.project.ad.service.impl;

import com.project.ad.dao.CreativeRepository;
import com.project.ad.entity.Creative;
import com.project.ad.exception.AdException;
import com.project.ad.service.ICreativeService;
import com.project.ad.vo.CreativeRequest;
import com.project.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description:
 * @Author: ChengChuanQiang
 * @Date: 2019/5/4 14:23
 */
@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public CreativeResponse createCreative(CreativeRequest request) throws AdException {
        // #todo 校验完善

        Creative creative = creativeRepository.save(request.convertToEntity());
        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
