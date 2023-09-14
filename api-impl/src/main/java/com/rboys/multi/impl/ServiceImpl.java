package com.rboys.multi.impl;


import org.springframework.stereotype.Service;


@Service
public class ServiceImpl implements com.rboys.multi.api.Service {

	@Override
	public void serve(String message) {
		System.out.println("Serving from ServiceImpl class");
	}
}
