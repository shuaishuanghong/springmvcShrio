package com.atguigu.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {
	/**
	 * 理论上来说要冲从数据库了取数据,这里暂时写死了
	 * 
	 * */
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map=new LinkedHashMap<>();
		map.put("/login.jsp", "anon");
		map.put("/shiro/login", "anon");
		map.put("/shiro/logout", "logout");
		map.put("/user.jsp", "roles[user]");
		map.put("/admin.jsp", "authc,roles[admin]");
		map.put("/list.jsp", "user");
		
		map.put("/**", "authc");
		return map;	
	}
}
