package com.zmc.service;

import com.zmc.common.entity.Resource;

import java.util.List;

/**
 * Created by zhongmc on 2017/6/29.
 */
public interface ResourceService {
    void addResource(Resource resource)throws Exception;
    List<Resource> findAllResouces()throws Exception;
    Boolean deleteResourceById(Long id);
}
