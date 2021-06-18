package com.hackerrank.sample.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hackerrank.sample.entity.exjson;

@RestController
@RequestMapping(value = "/endpoint", produces = MediaType.APPLICATION_JSON_VALUE)
public class SampleController {

	@PostMapping("/insert")
    public ResponseEntity<exjson> insert(@Valid @RequestBody exjson ijson) {
		
	
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(ijson.getId())
                .toUri();
    	
        return ResponseEntity.ok(ijson);
	}
	
    @GetMapping("/select")
    public ResponseEntity<exjson> select() {
    	exjson ijson = new exjson();  
    	return ResponseEntity.ok(ijson);
    }
    
    @GetMapping("/select/{id}")
    public ResponseEntity<exjson> selectId(@PathVariable("id") int id) {
    	exjson ijson = new exjson();  
    	return ResponseEntity.ok(ijson);
    }    
    
    @PostMapping("/delete/{id}")
    public ResponseEntity<exjson> deleteProduct(@PathVariable("id") int id) {
    	exjson ijson = new exjson();  
    	return ResponseEntity.ok(ijson);    	
    }
    
	
}
