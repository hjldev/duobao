package online.duobao.upms.rpc.api;

import online.duobao.common.base.BaseServiceMock;
import online.duobao.upms.dao.mapper.UpmsUserMapper;
import online.duobao.upms.dao.model.UpmsUser;
import online.duobao.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by shuzheng on 2017/3/20.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    @Override
    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }

}
