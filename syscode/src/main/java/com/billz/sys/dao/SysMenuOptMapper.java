package com.billz.sys.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.sys.model.SysMenuOpt;

/**
 * @class SysMenuOptMapper.java
 * @author billz
 * @date 2017-09-25
 */
@Repository
public interface SysMenuOptMapper {

	int findPageCount(Psb<SysMenuOpt> sysMenuOpt);

	List<SysMenuOpt> findPageList(Psb<SysMenuOpt> sysMenuOpt);

	SysMenuOpt findByOptid(@Param("optid") Integer optid);

	int delByOptid(@Param("optid") Integer optid);

	int updateByOptid(SysMenuOpt sysMenuOpt);

	int insert(SysMenuOpt sysMenuOpt);
}
