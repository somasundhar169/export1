package com.hexa.serverapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.serverapi.dto.ClientDto;
import com.hexa.serverapi.interfaces.ClientInterfaceAPI;

@RestController
@RequestMapping("/server")
public class ServerController {

	@Autowired
	private ClientInterfaceAPI client;
	
	@GetMapping("/get")
	public ClientDto performOperations() {
	
		
		System.out.println(client.addClient(new ClientDto(2L,"Client2","Company2")));
		System.out.println(client.getClientInfo(1l));
		return client.getClientInfo(1l);
	}
}
