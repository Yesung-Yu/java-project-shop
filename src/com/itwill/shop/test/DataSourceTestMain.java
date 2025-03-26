package com.itwill.shop.test;

import java.sql.Connection;

import com.itwill.shop.common.DataSource;

public class DataSourceTestMain {

	public static void main(String[] args) throws Exception {
		DataSource ds = new DataSource();
		Connection con = ds.getConnection();
		System.out.println(con);
		ds.close(con);
	}
}
