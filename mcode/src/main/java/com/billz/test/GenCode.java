package com.billz.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.billz.model.ColBean;
import com.billz.util.FreemarkerUtils;

/**
 * @class GenCode.java
 * @author billz
 * @date 2017年9月14日
 */
public class GenCode {

	private static String filePath = "admin/ftl/code/"; // 存放路径
	private static String ftlPath = ""; // ftl路径
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) {
		gen();
		System.out.println("执行结束!");
	}

	// 执行
	private static void gen() {
		String modelName = "consume"; // 模块名称
		String clsName = "ConsumeScan"; // 类名

		// start.列信息
		String pkIdName = "did"; // 属性名称
		String pkIdColName = "did"; // 主键列名
		String pkIdUname = "Did"; // 属性名称(首字母大写)
		String pkIdJtype = "BIGINT"; // 主键jdbc类型
		String pkIdType = "Long";
		
 		List<ColBean> fieldList = new ArrayList<ColBean>(); // 字段信息
		ColBean colbean = new ColBean();
	  
		colbean = new ColBean(); 
		colbean.setPk(false);
		colbean.setColName("qrcode");
		colbean.setColType("String");
		colbean.setJdbcType("VARCHAR");
		colbean.setName("qrcode");
		colbean.setUname("Qrcode");
		colbean.setTitle("二维码");
		fieldList.add(colbean);
		
		colbean = new ColBean(); 
		colbean.setPk(false);
		colbean.setColName("status");
		colbean.setColType("Boolean");
		colbean.setJdbcType("BOOLEAN");
		colbean.setName("status");
		colbean.setUname("Status");
		colbean.setTitle("状态");
		fieldList.add(colbean);
		
		colbean = new ColBean(); 
		colbean.setPk(false);
		colbean.setColName("remark");
		colbean.setColType("String");
		colbean.setJdbcType("VARCHAR");
		colbean.setName("remark");
		colbean.setUname("Remark");
		colbean.setTitle("备注");
		fieldList.add(colbean);
		
		colbean = new ColBean(); 
		colbean.setPk(false);
		colbean.setColName("createtime");
		colbean.setColType("Date");
		colbean.setJdbcType("TIMESTAMP");
		colbean.setName("createtime");
		colbean.setUname("Createtime");
		colbean.setTitle("创建时间");
		fieldList.add(colbean);
		// end.列信息

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("fieldList", fieldList);
		params.put("packageName", "com.billz"); // 包名
		params.put("proName", "xycode"); // 项目名称
		params.put("objectName", clsName); // 类名
		params.put("objectNameFirstCharLower", "consumeScan");
		params.put("objectNameLower", "ConsumeScan");
		params.put("tableName", "tb_consume_scan"); // 表名
		params.put("modelName", modelName);
		params.put("pkIdName", pkIdName);
		params.put("pkIdUname", pkIdUname);
		params.put("pkIdColName", pkIdColName);
		params.put("pkIdJtype", pkIdJtype);
		params.put("pkIdType", pkIdType);
		params.put("nowDate", sdf.format(new Date())); // 当前日期

		try {
			FreemarkerUtils.genFile("controllerTemplate.ftl", params, "controller/" + modelName + "/" + clsName + "Controller.java",
					filePath, ftlPath);
			
			FreemarkerUtils.genFile("serviceImplTemplate.ftl", params, "service/" + modelName + "/impl/" + clsName + "ServiceImpl.java",
					filePath, ftlPath);
			
			FreemarkerUtils.genFile("serviceTemplate.ftl", params, "service/" + modelName + "/" + clsName + "Service.java",
					filePath, ftlPath);
			
			FreemarkerUtils.genFile("mapperTemplate.ftl", params, "dao/" + modelName + "/" + clsName + "Mapper.java",
					filePath, ftlPath);
			
			FreemarkerUtils.genFile("pojoTemplate.ftl", params, "entity/" + modelName + "/" + clsName + ".java",
			filePath, ftlPath);
			
			// 生成mybatis xml
			FreemarkerUtils.genFile("mapperMysqlTemplate.ftl", params,
					"mybatis/" + modelName + "/" + clsName + "Mapper.xml", filePath, ftlPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
