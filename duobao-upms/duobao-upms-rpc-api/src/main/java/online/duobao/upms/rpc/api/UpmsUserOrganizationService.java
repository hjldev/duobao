package online.duobao.upms.rpc.api;

import online.duobao.common.base.BaseService;
import online.duobao.upms.dao.model.UpmsUserOrganization;
import online.duobao.upms.dao.model.UpmsUserOrganizationExample;

/**
* UpmsUserOrganizationService接口
* Created by shuzheng on 2017/3/20.
*/
public interface UpmsUserOrganizationService extends BaseService<UpmsUserOrganization, UpmsUserOrganizationExample> {

    /**
     * 用户组织
     * @param organizationIds 组织ids
     * @param id 用户id
     * @return
     */
    int organization(String[] organizationIds, int id);

}