package com.armton.study.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;


@Service
public class HelloWorld {

	@PostConstruct
	public void init() {
		System.out.println("Hello~~~ World~~~~");
	}
}
