package com.carproject.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.carproject.repository.carRepositroy;

@Service
public class carServiceImpl implements carService {

	@Resource
	private carRepositroy car;
	
	@Override
	public String getCarbyId(int id) {
		// TODO Auto-generated method stub
		return car.findOne(id).getName();
	}

}
