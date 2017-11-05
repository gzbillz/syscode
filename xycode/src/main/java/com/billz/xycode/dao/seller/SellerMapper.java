package com.billz.xycode.dao.seller;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.seller.Seller;

/**
 * @class SellerMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface SellerMapper {

	int findPageCount(Psb<Seller> seller);
	
	List<Seller> findPageList(Psb<Seller> seller);
	
	Seller findBySellerid(@Param("sellerid") Long sellerid);
	
	int delBySellerid(@Param("sellerid") Long sellerid);

	int updateBySellerid(Seller seller);
	
	int insert(Seller seller);
}

