package com.hexa.serverapi.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.hexa.serverapi.dto.ClientDto;

@FeignClient(value="ClientAPI")
@Component
public interface ClientInterfaceAPI {

	@GetMapping("/client/api/{id}")
	public ClientDto getClientInfo(@PathVariable Long id);
	
	@PostMapping("/client/api")
	public ClientDto addClient(@RequestBody ClientDto clientDto);
}
