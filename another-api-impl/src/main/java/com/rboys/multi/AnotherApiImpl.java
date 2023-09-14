package com.rboys.multi;

import org.springframework.stereotype.Service;

@Service
public class AnotherApiImpl implements com.rboys.multi.api.Service {

	@Override
	public String serve(String message) {
		return "Character sequence " + message + " served from AnotherApiImpl class";
	}
}
