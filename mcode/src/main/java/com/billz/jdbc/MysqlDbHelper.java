package com.billz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.billz.db.DbHelper;
import com.billz.model.ColBean;
import com.mysql.jdbc.StringUtils;

/**
 * @class MysqlDbHelper.java
 * @author billz
 * @date 2017年9月14日
 */
public class MysqlDbHelper extends DbHelper {

	private static String DBName = "pos"; // 数据库名称
	private static String user = "root"; // 账号
	private static String pwd = "root"; // 密码
	
	private static String JDBC_URL = "jdbc:mysql://localhost:3306/%s?"
				+ "user=%s&password=%s&useUnicode=true&characterEncoding=UTF8";

	/**
	 * 创建Connection对象
	 * @return
	 */
	protected Connection getConn(){ 
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(String.format(JDBC_URL, DBName, user, pwd));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 关闭连接
	 * @param rs
	 * @param pst
	 * @param conn
	 */
	protected void closeAll(ResultSet rs, PreparedStatement pst, Connection conn){
		try {
			if(rs != null){
				rs.close();
			}
			if(pst != null){
				pst.close();
			}
			if(conn != null && !conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
 			e.printStackTrace();
		}
	}
 
	/**
	 * 关闭Connection对象
	 * @param conn
	 */
	protected void closeConn(Connection conn){
		try {
			if(conn != null && !conn.isClosed()){
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取表备注信息
	 * @param conn
	 * @param tbName
	 * @return
	 */
	public String findTbComment(Connection conn, String tbName){
		StringBuffer sql = new StringBuffer("select table_name,table_comment from information_schema.tables ");
		sql.append("where table_schema = '"+DBName+"' and table_name ='"+tbName+"' ");
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = conn.prepareStatement(sql.toString());
			rs = pst.executeQuery();
			while(rs.next()){
				String comment = rs.getString("table_comment");
				return !StringUtils.isNullOrEmpty(comment) ? comment.split(";")[0] : "";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pst, null);
		}
		return "";
	}
	
	/**
	 * 查询表的主键列
	 * @param conn
	 * @param tbname
	 * @return
	 */
	public ColBean findPkId(Connection conn, String tbname){
		StringBuffer sql = new StringBuffer();
		sql.append("select column_name,data_type,column_key,column_comment ");
		sql.append("from information_schema.columns where table_schema ='" + DBName + "' ");
		sql.append("and table_name = '"+tbname+"' and column_key='PRI' ");
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = conn.prepareStatement(sql.toString());
			rs = pst.executeQuery();
			while(rs.next()){
				ColBean bean = new ColBean();
				bean.setColName(rs.getString("column_name"));
				bean.setColType(rs.getString("data_type"));
				bean.setComment(rs.getString("column_comment"));
				return bean;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pst, null);
		}
		return null;
	}
	
	/**
	 * 获取表对应的所有字段信息[不包含主键]
	 * @param conn
	 * @param tbname
	 * @return 
	 */
	public List<ColBean> findTbColumns(Connection conn, String tbname){
		List<ColBean> list = new ArrayList<ColBean>();
		StringBuffer sql = new StringBuffer("");
		sql.append("select column_name,data_type,column_key,column_comment ");
		sql.append("from information_schema.columns where table_schema ='" + DBName + "' ");
		sql.append("and table_name = '"+tbname+"' and column_key !='PRI' ");
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = conn.prepareStatement(sql.toString());
			rs = pst.executeQuery();
			ColBean bean = null;
			while(rs.next()){
				bean = new ColBean();
				bean.setColName(rs.getString("column_name"));
				bean.setColType(rs.getString("data_type"));
				bean.setComment(rs.getString("column_comment"));
				list.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pst, null);
		}
		return list;
	}
	
	public static void main(String[] args) throws Exception {
		MysqlDbHelper dbHelper = new MysqlDbHelper();
		String tbName= "tb_pos";
		Connection conn = dbHelper.getConn();
		String tbComment = dbHelper.findTbComment(conn, tbName);
		System.out.println("表备注：" + tbComment);
		
		// 表主键列
		ColBean pkBean = dbHelper.findPkId(conn, tbName);
		System.out.println("主键，字段名称：" + pkBean.getColName());
		// 表所有字段
		List<ColBean> colList = dbHelper.findTbColumns(conn, tbName);
		System.out.println("所有字段信息：" + colList.size());
		dbHelper.closeConn(conn);
		System.out.println(String.format("a%sbc", "123"));
		System.out.println("执行完毕!");
	}

}
