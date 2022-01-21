package com.example.first_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.first_project.model.Data;

public interface DataRepository extends JpaRepository <Data, String> {


//	@Query(value="select sc.* from result1 sc where month=?1",nativeQuery = true)
//	public List<Data> findResult(Long month);
	

}
