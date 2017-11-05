package com.billz.xycode.dao.seller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.seller.SellerWithdraw;

/**
 * @class SellerWithdrawMapper.java
 * @author billz
 * @date 2017-10-23
 */
@Repository
public interface SellerWithdrawMapper {

	int findPageCount(Psb<SellerWithdraw> sellerWithdraw);

	List<SellerWithdraw> findPageList(Psb<SellerWithdraw> sellerWithdraw);

	int findPageCountBySellerid(Psb<Map<String, Object>> psb);

	List<SellerWithdraw> findPageListBySellerid(Psb<Map<String, Object>> psb);

	SellerWithdraw findBySwid(@Param("swid") Long swid);

	int delBySwid(@Param("swid") Long swid);

	int updateBySwid(SellerWithdraw sellerWithdraw);

	int insert(SellerWithdraw sellerWithdraw);
}
