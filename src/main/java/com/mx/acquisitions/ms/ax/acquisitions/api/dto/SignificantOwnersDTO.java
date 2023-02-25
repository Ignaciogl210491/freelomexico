package com.mx.acquisitions.ms.ax.acquisitions.api.dto;

import lombok.Data;

@Data
public class SignificantOwnersDTO {

    private OwnerDTO firstOwner;
    private OwnerDTO secondOwner;
    private OwnerDTO thirdOwner;
    private OwnerDTO fourthOwner;
    private AuthorizedSignerDTO authorizedSigner;

}