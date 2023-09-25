package com.armton.study.service;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class HelloWorld {

	@PostConstruct
	public void init() {
		System.out.println("Hello~~~ World~~~~");
	}
}
