package com.sample.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sample.model.BoardDao;

@Controller
public class BoardController implements ControllerService{
	
	@Autowired
	BoardDao boardDao;
	
	@RequestMapping("/")
	public ModelAndView home(ModelAndView mav) {
		System.out.println("home");
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping("/main")
	public ModelAndView main(ModelAndView mav) {
		System.out.println("main");
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/signUp")
	public ModelAndView signUp(ModelAndView mav) {
		System.out.println("signUp");
		
		mav.setViewName("signUp");
		return mav;
	}
	
	@RequestMapping("/list")
	public ModelAndView list(ModelAndView mav) {
		System.out.println("list");
		mav.addObject("boardList", boardDao.boardList());
		mav.setViewName("list");
		return mav;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		
	}
}
