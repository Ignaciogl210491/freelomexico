package com.mx.acquisitions.ms.ax.acquisitions.api.dto;

import lombok.Data;

@Data
public class AuthorizedSignerDTO extends OwnerDTO{
	
	private String firstName;
    private String lastName;
    private String identificationNumber;
    private String dateOfBirth;
    private String title; 
	private StreetAddressSignerDTO streetAddress;

}
