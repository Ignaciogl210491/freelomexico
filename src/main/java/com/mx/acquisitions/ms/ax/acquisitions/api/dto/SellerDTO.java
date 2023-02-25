package com.mx.acquisitions.ms.ax.acquisitions.api.dto;

import lombok.Data;

@Data
public class SellerDTO{

    private String sellerId;
    private String sellerUrl;
    private String sellerStatus;
    private String sellerMcc;
    private String sellerLegalName;
    private String sellerDbaName;
    private String sellerBusinessRegistrationNumber;
    private String sellerBusinessPhoneNumber;
    private String sellerEmailAddress;
    private String sellerCurrencyCode;
    private String sellerStartDate;
    private String sellerTermDate;
    private String sellerChargeVolume;
    private String sellerTransactionCount;
    private String sellerChargebackCount;
    private String sellerChargebackAmount;
    private StreetAddressDTO sellerStreetAddress;
}