package online.duobao.upms.dao.mapper;

import online.duobao.upms.dao.model.UpmsOrganization;
import online.duobao.upms.dao.model.UpmsOrganizationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UpmsOrganizationMapper {
    long countByExample(UpmsOrganizationExample example);

    int deleteByExample(UpmsOrganizationExample example);

    int deleteByPrimaryKey(Integer organizationId);

    int insert(UpmsOrganization record);

    int insertSelective(UpmsOrganization record);

    List<UpmsOrganization> selectByExample(UpmsOrganizationExample example);

    UpmsOrganization selectByPrimaryKey(Integer organizationId);

    int updateByExampleSelective(@Param("record") UpmsOrganization record, @Param("example") UpmsOrganizationExample example);

    int updateByExample(@Param("record") UpmsOrganization record, @Param("example") UpmsOrganizationExample example);

    int updateByPrimaryKeySelective(UpmsOrganization record);

    int updateByPrimaryKey(UpmsOrganization record);
}