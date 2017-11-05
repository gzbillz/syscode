package com.billz.util;

/**
 * 分页查询条件
 * @class Psb.java
 * @author billz
 * @date 2017年7月1日
 * @param <T>
 */
public class Psb<T> {

	private int start;
	private int end;
	private T bean;
	
	public Psb(int start, int end, T bean) {
		this.start = start;
		this.end = end;
		this.bean = bean;
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public T getBean() {
		return bean;
	}
	public void setBean(T bean) {
		this.bean = bean;
	}
}
