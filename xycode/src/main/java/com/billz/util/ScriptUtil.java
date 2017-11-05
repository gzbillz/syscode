package com.billz.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * JS脚本引擎
 * 
 * @class ScriptUtil.java
 * @author billz
 * @date 2017年10月9日
 */
public class ScriptUtil {

	private static ScriptEngineManager manager = new ScriptEngineManager();

	/**
	 * 执行字符串计算
	 * 
	 * @param express js语句
	 * @param params 参数
	 * @return
	 * @throws ScriptException
	 */
	@SuppressWarnings("unchecked")
	public static <T, E> E eval(String express, Map<String, T> params){
		try {
			ScriptEngine engine = manager.getEngineByName("js");
			if (params == null) {
				params = new HashMap<String, T>();
			}
			Iterator<Map.Entry<String, T>> iter = params.entrySet().iterator();
			Map.Entry<String, T> entry = null;
			while (iter.hasNext()) {
				entry = iter.next();
				engine.put(entry.getKey(), entry.getValue());
			}
			return (E) engine.eval(express);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 执行脚本函数
	 * @param express js脚本
	 * @param fname 函数名称
	 * @param obj 参数[按照顺序]
	 * @return
	 */
	public static double eval(String express, String fname, Object... obj){
		try {			
			ScriptEngine engine = manager.getEngineByName("js");  
			engine.eval(express);  
			if (engine instanceof Invocable) {//判断脚本引擎是否支持编译操作  
				Object rt = ((Invocable)engine).invokeFunction(fname, obj);// 调用脚本中定义的顶层程序和函数  
				return Double.valueOf(rt.toString());
			}  
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0.0;
	}
}
