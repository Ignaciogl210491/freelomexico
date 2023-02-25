package com.mx.acquisitions.ms.ax.acquisitions.api.dto;


import lombok.Data;

import java.util.List;

@Data
public class AcquisitionsDTO {

    private Integer seSetupRequestCount;
    private String messageId;
    private List<SeSetupRequestsDTO> seSetupRequests;

}
