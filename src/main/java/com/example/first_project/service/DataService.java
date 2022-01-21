package com.example.first_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first_project.model.Data;
import com.example.first_project.repository.DataRepository;

@Service
public class DataService {
	@Autowired
	   private DataRepository dataRepository;
	
	//전체보기(페이지)
	   public List<Data> findAll(){
	      return dataRepository.findAll();
	   }
	   
	//전체보기(카테고리)
//	   public List<Data> findresult(String category){
//	      return dataRepository.findResult(category);
//	   }

}