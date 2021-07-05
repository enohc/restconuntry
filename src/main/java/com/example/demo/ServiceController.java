/**
 * 
 */
package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author enohc
 *
 */

@RestController
public class ServiceController {

	@Autowired RestTemplate restTemplate; 
	
	@GetMapping("consulta")
	public List<Object> consulta(){
		Root[] respueta = restTemplate.getForObject("https://restcountries.eu/rest/v2/all", Root[].class ); 
		return Arrays.asList(respueta);
	}
	
	
	@PutMapping("consulta")
	public String consultaPut(){ 
		return "ConsultaPut";
	}
	
	
	@PostMapping("consulta")
	public String consultaPost(){ 
		return "ConsutlaPost";
	}
	
}
