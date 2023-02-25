package com.mx.acquisitions.ms.ax.acquisitions.api.dto;

import lombok.Data;

@Data
public class StreetAddressSignerDTO {

	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String addressLine4;
	private String addressLine5;
	private String cityName;
	private String regionCode;
	private String postalCode;
	private String countryCode;
	private String channelIndicatorCode;
	private String channelName;
	private String representId;
	private String isoRegisterNumber;

}