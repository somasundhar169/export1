package com.hexa.clientapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.clientapi.entity.Client;
import com.hexa.clientapi.service.ClientAPIService;

@RestController
@RequestMapping("/client/api")
public class ClientController {
	
	@Autowired
	private ClientAPIService service;

	@PostMapping
	public Client addClient(@RequestBody Client client) {
		return service.saveClient(client);
	}
	
	@GetMapping("{id}")
	public Client getClient(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
}
