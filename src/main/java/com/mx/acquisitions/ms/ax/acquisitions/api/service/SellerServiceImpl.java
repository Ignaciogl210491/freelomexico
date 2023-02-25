package com.mx.acquisitions.ms.ax.acquisitions.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mx.acquisitions.ms.ax.acquisitions.api.dto.AcquisitionsDTO;
import com.mx.acquisitions.ms.ax.acquisitions.api.entity.ServiceTblActApiamexProp;
import com.mx.acquisitions.ms.ax.acquisitions.api.repositories.OrderNotificationRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SellerServiceImpl implements SellerService{
	
	@Autowired
	private final OrderNotificationRepository orderNotificationRepository;
	
	@Override
    public void processMessage(AcquisitionsDTO acquisitionsDTO) {
		
		try {		
		
			ServiceTblActApiamexProp serviceTblActApiamexProp = this.fromDTO(acquisitionsDTO);
			this.orderNotificationRepository.save(serviceTblActApiamexProp);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private ServiceTblActApiamexProp fromDTO(AcquisitionsDTO acquisitionsDTO) {
		ServiceTblActApiamexProp serviceTblActApiamexProp;
		serviceTblActApiamexProp.setSellerId(acquisitionsDTO.getClass().);
				
				
				
	}
}
