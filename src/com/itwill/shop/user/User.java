package com.itwill.shop.user;

import java.util.List;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.order.Order;

/*
VO(Value Object),DTO(Data Transfer Object)
	- userinfo 테이블 1개 row의 데이타의 값을 가지는객체
	- userinfo 테이블 1개 row의 데이타값을 이동(파라메타,리턴데이타)시키기위한객체 
	- userinfo 테이블의 컬럼과 동일한수의 멤버변수를가지는객체
*/
/*
* =================================== 
* 이름 		널? 		유형
* =================================== 
* USERID 	NOT NULL VARCHAR2(100) 
* PASSWORD	NOT NULL VARCHAR2(100) 
* NAME 		NOT NULL VARCHAR2(200) 
* EMAIL 			 VARCHAR2(300)
* ===================================
*/
public class User {
	private String userid;
	private String password;
	private String name;
	private String email;
	private List<Cart> cartList;
	private List<Order> orderList;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userid, String password, String name, String email) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.email = email;

	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Cart> getCartList() {
		return cartList;
	}

	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

}
