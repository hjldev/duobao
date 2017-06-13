package online.duobao.upms.rpc.api;

import online.duobao.common.base.BaseServiceMock;
import online.duobao.upms.dao.mapper.UpmsLogMapper;
import online.duobao.upms.dao.model.UpmsLog;
import online.duobao.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by shuzheng on 2017/3/20.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
