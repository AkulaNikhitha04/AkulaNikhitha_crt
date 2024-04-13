package com.spec.estate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spec.estate.entity.BHK;
import com.spec.estate.service.BHKService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/spec")
public class BHKController {
	
	@Autowired
	BHKService bhkService;
	@PostMapping("/bhk/add")
	public List<BHK>  addNewBHK(@RequestBody List<BHK> bhk) {
		return bhkService.addBHKToDB(bhk);	
	}
	
}
