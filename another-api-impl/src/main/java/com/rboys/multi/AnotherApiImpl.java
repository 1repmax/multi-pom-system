package com.rboys.multi;

import org.springframework.stereotype.Service;

@Service
public class AnotherApiImpl implements com.rboys.multi.api.Service {

	@Override
	public void serve(String message) {
		System.out.println("Serving from AnotherApiImpl class");
	}
}
