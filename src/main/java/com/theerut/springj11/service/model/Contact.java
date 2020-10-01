package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    @JsonProperty("sequence_num")
    private Long sequenceNum;

    @JsonProperty("type")
    private String type;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("last_maintenance_uid")
    private String lastMaintenanceUid;

    @JsonProperty("last_maintenance_time")
    private String lastMaintenanceTime;

}
