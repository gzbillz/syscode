package com.billz.xycode.service.seller;

import com.billz.util.Prb;
import com.billz.util.Psb;
import com.billz.xycode.model.seller.SellerPosKey;

/**
 * @class SellerPosKeyService.java
 * @author billz
 * @date 2017-10-25
 */
public interface SellerPosKeyService {

	Prb<SellerPosKey> findPageList(Psb<SellerPosKey> psb);

	int updateByKid(SellerPosKey sellerPosKey);

	int insert(SellerPosKey sellerPosKey);

	int delByKid(Long kid);

	SellerPosKey findByKid(Long kid);

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
	String findKeyByPosid(String posid, Long sellerid, Long pid, Integer cateid, Integer subcateid);
	
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
	String findDjKeyByPosid(String posid, Long sellerid, Long pid, Integer cateid, Integer subcateid);
}