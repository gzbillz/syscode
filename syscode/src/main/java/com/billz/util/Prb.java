package com.billz.util;

import java.util.List;

/**
 * 分页查询返回结果
 * @class Prb.java
 * @author billz
 * @date 2017年7月1日
 * @param <T>
 */
public class Prb<T> {

	private List<T> data;
	private int count;

	public Prb(List<T> data, int count) {
		this.data = data;
		this.count = count;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
