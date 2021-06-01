package com.devsuperior.bds01.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.dto.services.DepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentResources {
	
	@Autowired
	private DepartmentService service;
	
	@GetMapping
	public ResponseEntity<List<DepartmentDTO>> findAll(){
		List<DepartmentDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}