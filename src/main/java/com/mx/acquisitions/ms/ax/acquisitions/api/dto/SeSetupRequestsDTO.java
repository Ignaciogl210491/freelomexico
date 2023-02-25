package com.mx.acquisitions.ms.ax.acquisitions.api.dto;

import lombok.Data;

@Data
public class SeSetupRequestsDTO{

    private String recordNumber;
    private String participantSe;
    private String submitterId;
    private String seDetailStatusCode;
    private String seStatusCodeChangeDate;
    private String languagePreferenceCode;
    private String japanCreditBureauIndicator;
    private String marketingIndicator;
    private String ownershipTypeIndicator;
    private String sellerTransactingIndicator;
    private String clientDefinedCode;
    private SellerDTO seller;
    private SignificantOwnersDTO significantOwners;
        

}