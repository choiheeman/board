package com.sample.controller;

import org.springframework.stereotype.Service;

@Service
public interface ControllerService {
	void insert();
	void select();
	void selectAll();
	void delete();
	void modify();
}
