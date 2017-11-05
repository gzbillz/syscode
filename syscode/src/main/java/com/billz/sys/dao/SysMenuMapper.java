package com.billz.sys.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.sys.model.SysMenu;

/**
 * @class SysMenuMapper.java
 * @author billz
 * @date 2017-09-25
 */
@Repository
public interface SysMenuMapper {

	int findPageCount(Psb<SysMenu> sysMenu);

	List<SysMenu> findPageList(Psb<SysMenu> sysMenu);

	SysMenu findByMenuid(@Param("menuid") Integer menuid);

	int delByMenuid(@Param("menuid") Integer menuid);

	int updateByMenuid(SysMenu sysMenu);

	int insert(SysMenu sysMenu);
}
