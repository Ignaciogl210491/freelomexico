package com.mx.acquisitions.ms.ax.acquisitions.api.service;

import com.mx.acquisitions.ms.ax.acquisitions.api.dto.AcquisitionsDTO;

public interface SellerService{
	
	void processMessage(AcquisitionsDTO acquisitionsDTO);
}
