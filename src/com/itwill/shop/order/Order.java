package com.itwill.shop.order;

import java.util.Date;
import java.util.List;

import com.itwill.shop.user.User;

/*
이름      널?       유형            
------- -------- ------------- 
O_NO    NOT NULL NUMBER(10)    
O_DESC           VARCHAR2(100) 
O_DATE           DATE          
O_PRICE          NUMBER(10)    
USERID           VARCHAR2(100)
*/
public class Order {
	private int o_no;
	private String o_desc;
	private Date date;
	private int o_price;
	/****** FK ******/
	private String userid;
	// private User user;

	private List<OrderItem> orderItemList;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int o_no, String o_desc, Date date, int o_price, String userid, List<OrderItem> orderItemList) {
		super();
		this.o_no = o_no;
		this.o_desc = o_desc;
		this.date = date;
		this.o_price = o_price;
		this.userid = userid;
		this.orderItemList = orderItemList;
	}

	public int getO_no() {
		return o_no;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	public String getO_desc() {
		return o_desc;
	}

	public void setO_desc(String o_desc) {
		this.o_desc = o_desc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getO_price() {
		return o_price;
	}

	public void setO_price(int o_price) {
		this.o_price = o_price;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	@Override
	public String toString() {
		return "Order [o_no=" + o_no + ", o_desc=" + o_desc + ", date=" + date + ", o_price=" + o_price + ", userid="
				+ userid + ", orderItemList=" + orderItemList + "]";
	}

}
