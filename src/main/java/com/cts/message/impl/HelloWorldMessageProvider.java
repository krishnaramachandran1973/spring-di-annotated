package com.cts.message.impl;

import org.springframework.stereotype.Component;

import com.cts.message.MessageProvider;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		return "Hello World";
	}

}
