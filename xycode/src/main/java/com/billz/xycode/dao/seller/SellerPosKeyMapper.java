package com.billz.xycode.dao.seller;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import com.billz.xycode.model.seller.SellerPosKey;

/**
 * @class SellerPosKeyMapper.java
 * @author billz
 * @date 2017-10-25
 */
@Repository
public interface SellerPosKeyMapper {

	int findPageCount(Psb<SellerPosKey> sellerPosKey);

	List<SellerPosKey> findPageList(Psb<SellerPosKey> sellerPosKey);

	SellerPosKey findByKid(@Param("kid") Long kid);

	/**
	 * 查询可用[设备上面扫描二维码]解码秘钥
	 * 
	 * @param posid
	 *            设备编号[必选]
	 * @param sellerid
	 *            商家编号[必选]
	 * @param pid
	 *            项目编号
	 * @param cateid
	 *            设备分类编号
	 * @param subcateid
	 *            设备分类规格编号
	 * @return
	 */
	String findKeyByPosid(@Param("posid") String posid, @Param("sellerid") Long sellerid, @Param("pid") Long pid,
			@Param("cateid") Integer cateid, @Param("subcateid") Integer subcateid);
	
	/**
	 * 查询可用[生成订单二维码]加密秘钥
	 * 
	 * @param posid
	 *            设备编号[必选]
	 * @param sellerid
	 *            商家编号[必选]
	 * @param pid
	 *            项目编号
	 * @param cateid
	 *            设备分类编号
	 * @param subcateid
	 *            设备分类规格编号
	 * @return
	 */
	String findDjKeyByPosid(@Param("posid") String posid, @Param("sellerid") Long sellerid, @Param("pid") Long pid,
			@Param("cateid") Integer cateid, @Param("subcateid") Integer subcateid);

	int delByKid(@Param("kid") Long kid);

	int updateByKid(SellerPosKey sellerPosKey);

	int insert(SellerPosKey sellerPosKey);
}
