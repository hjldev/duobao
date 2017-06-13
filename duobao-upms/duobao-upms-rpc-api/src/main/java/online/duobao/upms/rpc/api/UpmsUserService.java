package online.duobao.upms.rpc.api;

import online.duobao.common.base.BaseService;
import online.duobao.upms.dao.model.UpmsUser;
import online.duobao.upms.dao.model.UpmsUserExample;

/**
* UpmsUserService接口
* Created by shuzheng on 2017/3/20.
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {

    UpmsUser createUser(UpmsUser upmsUser);

}