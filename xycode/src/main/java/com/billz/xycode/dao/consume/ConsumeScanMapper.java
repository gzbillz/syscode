package com.billz.xycode.dao.consume;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.consume.ConsumeScan;

/**
 * @class ConsumeScanMapper.java
 * @author billz
 * @date 2017-10-25
 */
@Repository
public interface ConsumeScanMapper {

	int findPageCount(Psb<ConsumeScan> consumeScan);

	List<ConsumeScan> findPageList(Psb<ConsumeScan> consumeScan);

	ConsumeScan findByDid(@Param("did") Long did);

	int delByDid(@Param("did") Long did);

	int updateByDid(ConsumeScan consumeScan);

	int insert(ConsumeScan consumeScan);
}
