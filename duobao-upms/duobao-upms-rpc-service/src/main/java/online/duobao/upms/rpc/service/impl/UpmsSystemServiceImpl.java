package online.duobao.upms.rpc.service.impl;

import online.duobao.common.annotation.BaseService;
import online.duobao.common.base.BaseServiceImpl;
import online.duobao.upms.dao.mapper.UpmsSystemMapper;
import online.duobao.upms.dao.model.UpmsSystem;
import online.duobao.upms.dao.model.UpmsSystemExample;
import online.duobao.upms.rpc.api.UpmsSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsSystemService实现
* Created by shuzheng on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsSystemServiceImpl extends BaseServiceImpl<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

    private static Logger _log = LoggerFactory.getLogger(UpmsSystemServiceImpl.class);

    @Autowired
    UpmsSystemMapper upmsSystemMapper;

}