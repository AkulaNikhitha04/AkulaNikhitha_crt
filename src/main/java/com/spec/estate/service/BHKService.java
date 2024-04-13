package com.spec.estate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.estate.entity.BHK;
import com.spec.estate.repo.BHKRepo;

@Service
public class BHKService {
@Autowired
BHKRepo bhkRepo;

public List<BHK> addBHKToDB(List<BHK> bhk) {
	// TODO Auto-generated method stub
	return bhkRepo.saveAll(bhk);
}
}
