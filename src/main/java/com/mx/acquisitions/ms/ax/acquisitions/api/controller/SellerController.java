package com.mx.acquisitions.ms.ax.acquisitions.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.acquisitions.ms.ax.acquisitions.api.dto.AcquisitionsDTO;
import com.mx.acquisitions.ms.ax.acquisitions.api.service.SellerService;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class SellerController {
	
	SellerService service;
	
	@PostMapping(value="sellers")
    public String methodsellers(AcquisitionsDTO acquisitionsDTO){
		
		service.processMessage(acquisitionsDTO);
		
    	return "hola";
    }
}
