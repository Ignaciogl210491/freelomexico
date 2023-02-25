package com.mx.acquisitions.ms.ax.acquisitions.api.dto;

import lombok.Data;

@Data
public class StreetAddressDTO {
	
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String regionCode;
	private String postalCode;
	private String countryCode;

}
