package online.duobao.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import online.duobao.common.base.BaseService;
import online.duobao.upms.dao.model.UpmsPermission;
import online.duobao.upms.dao.model.UpmsPermissionExample;

/**
* UpmsPermissionService接口
* Created by shuzheng on 2017/3/20.
*/
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {

    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);

}