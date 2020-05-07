package com.example.demo.db;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.db.TestService;
import com.example.demo.db.dto.TestCity;

@Controller
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("/test/all")
    public @ResponseBody List<TestCity> query() throws Exception{
        return testService.getAllCity();
    }
	
	@RequestMapping("/test/{cityId}")
    public @ResponseBody TestCity query2(@PathVariable Long cityId) throws Exception{
        return testService.getCityById(cityId);
    }
	
	@RequestMapping("/test/")
	@PostMapping
    public @ResponseBody TestCity query3(@RequestParam String name, @RequestParam String country, @RequestParam Long population) throws Exception{
		TestCity city = new TestCity(name, country, population);
        testService.addCity(city);
        return city;
    }
	
	
 
}