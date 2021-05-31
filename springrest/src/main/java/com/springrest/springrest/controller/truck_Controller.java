package com.springrest.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Services.loadservice;
import com.springrest.springrest.controller.entities.load;

@RestController
public class truck_Controller {
	
	@Autowired
	private loadservice ldservice;
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	//list of loads with shiperid
	@GetMapping("/load")
	public List<load> getloads()
	{
		return this.ldservice.getloads();
	}
	
	@GetMapping("/load/{loadId}")
	public load getloadval(@PathVariable String loadId)
	{
		return this.ldservice.getLoad(Long.parseLong(loadId));
	}
	
	@GetMapping("/load/{ShipperId}")
	public List<load> getshipss(@PathVariable String ShipperId)
	{
		return this.ldservice.getships(Long.parseLong(ShipperId));
	}
	
	@PostMapping("/load")
	public load addentry(@RequestBody load led)
	{
		return this.ldservice.postload(led);
	}
	
	@PutMapping("/load")
	public load putload(@RequestBody load led)
	{
		return this.ldservice.updateload(led);
	}
	public ResponseEntity<HttpStatus>deleteCourse(@PathVariable String loadId)
	{
		try {
			this.ldservice.deleteload(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
