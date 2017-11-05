package com.billz.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * @class FreemarkerUtils.java
 * @author billz
 * @date 2017年9月14日
 */
public class FreemarkerUtils {
	
	/**
	 * 打印到控制台(测试用)
	 *  @param ftlName
	 */
	public static void print(String ftlName, Map<String,Object> root, String ftlPath) throws Exception{
		try {
			Template temp = getTemplate(ftlName, ftlPath);		//通过Template可以将模板文件输出到相应的流
			temp.process(root, new PrintWriter(System.out));
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 根据模板生成文件
	 * @param ftlName   ftl文件名
	 * @param params 参数
	 * @param outFile	输出后的文件全部路径
	 * @param filePath	输出前的文件上部路径
	 */
	public static void genFile(String ftlName, Map<String,Object> params, String outFile, String filePath, String ftlPath) throws Exception{
		try {
			File file = new File(PathUtils.getClasspath() + filePath + outFile);
			if(!file.getParentFile().exists()){				//判断有没有父路径，就是判断文件整个路径是否存在
				file.getParentFile().mkdirs();				//不存在就全部创建
			}
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			Template template = getTemplate(ftlName, ftlPath);
			template.process(params, out);					//模版输出
			out.flush();
			out.close();
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过文件名加载模板
	 * @param ftlName 模板名称
	 * @param ftlPath 模板地址
	 */ 
	public static Template getTemplate(String ftlName, String ftlPath) throws Exception{
		try {
			Configuration cfg = new Configuration(); // 通过Freemaker的Configuration读取相应的ftl
			cfg.setEncoding(Locale.CHINA, "utf-8");
			
			// 设定去哪里读取相应的ftl模板文件
			cfg.setDirectoryForTemplateLoading(new File(PathUtils.getClassResources()+"/ftl/"+ftlPath)); 
			return cfg.getTemplate(ftlName); // 在模板文件目录中找到名称为name的文件
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
