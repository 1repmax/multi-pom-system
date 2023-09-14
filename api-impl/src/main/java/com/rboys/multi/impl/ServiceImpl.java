package com.rboys.multi.impl;


import org.springframework.stereotype.Service;


@Service
public class ServiceImpl implements com.rboys.multi.api.Service {

	@Override
	public String serve(String message) {
		return "Character sequence " + message + " served from ServiceImpl class";
	}
}
