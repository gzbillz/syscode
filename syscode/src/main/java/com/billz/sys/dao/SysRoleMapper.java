package com.billz.sys.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.sys.model.SysRole;

/**
 * @class SysRoleMapper.java
 * @author billz
 * @date 2017-09-25
 */
@Repository
public interface SysRoleMapper {

	int findPageCount(Psb<SysRole> sysRole);

	List<SysRole> findPageList(Psb<SysRole> sysRole);

	SysRole findByRoleid(@Param("roleid") Long roleid);

	int delByRoleid(@Param("roleid") Long roleid);

	int updateByRoleid(SysRole sysRole);

	int insert(SysRole sysRole);
}
