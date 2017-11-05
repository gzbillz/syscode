package com.billz.xycode.dao.seller;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.seller.SellerAccount;

/**
 * @class SellerAccountMapper.java
 * @author billz
 * @date 2017-09-22
 */
@Repository
public interface SellerAccountMapper {

	int findPageCount(Psb<SellerAccount> sellerAccount);

	List<SellerAccount> findPageList(Psb<SellerAccount> sellerAccount);

	SellerAccount findBySaid(@Param("said") Long said);

	int delBySaid(@Param("said") Long said);

	int updateBySaid(SellerAccount sellerAccount);

	int insert(SellerAccount sellerAccount);

	SellerAccount findBySelleridAndSatype(@Param("sellerid") Long sellerid, @Param("satype") int satype);
	
	int updateBalanceBySaid(@Param("said") Long said, @Param("balance") double balance);
	
	/**
	 * 根据商家主键，查询对应的所有账户
	 * @param sellerid 商家编号
	 * @return
	 */
	List<SellerAccount> findBySellerid(@Param("sellerid") Long sellerid);
}
