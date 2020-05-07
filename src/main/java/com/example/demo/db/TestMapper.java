package com.example.demo.db;


import java.util.List;
import com.example.demo.db.dto.TestCity;

public interface TestMapper {
	TestCity selectCityById(Long id) throws Exception;
    List<TestCity> selectAllCity() throws Exception;
    void insertCity(TestCity city) throws Exception;
}