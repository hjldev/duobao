package online.duobao.upms.rpc.service.impl;

import online.duobao.common.annotation.BaseService;
import online.duobao.common.base.BaseServiceImpl;
import online.duobao.upms.dao.mapper.UpmsRoleMapper;
import online.duobao.upms.dao.model.UpmsRole;
import online.duobao.upms.dao.model.UpmsRoleExample;
import online.duobao.upms.rpc.api.UpmsRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsRoleService实现
* Created by shuzheng on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsRoleServiceImpl extends BaseServiceImpl<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

    private static Logger _log = LoggerFactory.getLogger(UpmsRoleServiceImpl.class);

    @Autowired
    UpmsRoleMapper upmsRoleMapper;

}