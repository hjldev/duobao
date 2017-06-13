package online.duobao.upms.rpc.api;

import online.duobao.common.base.BaseService;
import online.duobao.upms.dao.model.UpmsUserRole;
import online.duobao.upms.dao.model.UpmsUserRoleExample;

/**
* UpmsUserRoleService接口
* Created by shuzheng on 2017/3/20.
*/
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {

    /**
     * 用户角色
     * @param roleIds 角色ids
     * @param id 用户id
     * @return
     */
    int role(String[] roleIds, int id);

}