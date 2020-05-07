package com.example.demo.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.db.dto.TestCity;

@Service
@Transactional
public class TestService {
	@Autowired
	TestMapper cityMapper;

	public TestCity getCityById(Long id) throws Exception {
		return cityMapper.selectCityById(id);
	}

	public List<TestCity> getAllCity() throws Exception {
		return cityMapper.selectAllCity();
	}

	public void addCity(TestCity city) throws Exception {
		cityMapper.insertCity(city);
	}
}