package com.tnsif.exception;

public class Throws {
static void Login(String username,String password)throws Exception{
	if(username.equals("admin")) {
		throw new Exception("Invalid username");
	}
	if(!password.equals("1234")) {
		throw new Exception("invalid password");
	}
	System.out.println("login successfully");
}
public static void main(String[] args) {
	try {
		Login("admin","111");
	}
	catch(Exception s) {
		System.out.println(s.getMessage());
	}
	System.out.println("Login process completed");
}
}