package com.example.dummysecuredapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dummysecuredapi.model.dto.DummyResponse;

@RestController
@RequestMapping("/")
public class DefaultController 
{
	@GetMapping("")
	public ResponseEntity<DummyResponse> dummy()
	{
		DummyResponse dummy = new DummyResponse();
		dummy.setError("");
		dummy.setStatus("ok");
		dummy.setResponse("dummy app is running");
		return new ResponseEntity<>(dummy, HttpStatus.OK);
	}
}
