package com.hexa.clientapi.service;

import org.springframework.stereotype.Service;

import com.hexa.clientapi.entity.Client;

@Service
public class ClientAPIService {

	
	public Client saveClient(Client client) {
	     return client;	
	}

	public Client findById(Long id) {
		return new Client(1L,"Client1","Company1");
	}
	
	
}
