package com.example.dummysecuredapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dummysecuredapi.model.dto.DummyDto;
import com.example.dummysecuredapi.model.dto.DummyResponse;

@RestController
@RequestMapping("/api/")
public class DummyRestController 
{
	
	@GetMapping("/dummy")
	public ResponseEntity<DummyResponse> dummy()
	{
		DummyResponse dummy = new DummyResponse();
		DummyDto dto = new DummyDto();
		dto.setDummy("dummy dummy");
		dummy.setError("");
		dummy.setStatus("00");
		dummy.setResponse(dto);
		
		return new ResponseEntity<>(dummy, HttpStatus.OK);
	}
}

