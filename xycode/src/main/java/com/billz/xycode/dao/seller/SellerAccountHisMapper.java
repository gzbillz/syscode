package com.billz.xycode.dao.seller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.seller.SellerAccountHis;

/**
 * @class SellerAccountHisMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface SellerAccountHisMapper {

	int findPageCount(Psb<SellerAccountHis> sellerAccountHis);
	
	List<SellerAccountHis> findPageList(Psb<SellerAccountHis> sellerAccountHis);
	
	int findPageCountBySaid(Psb<Map<String, Object>> psb);
	
	List<SellerAccountHis> findPageListBySaid(Psb<Map<String, Object>> psb);
	
	SellerAccountHis findBySahid(@Param("sahid") Long sahid);
	
	int delBySahid(@Param("sahid") Long sahid);

	int updateBySahid(SellerAccountHis sellerAccountHis);
	
	int insert(SellerAccountHis sellerAccountHis);
}

