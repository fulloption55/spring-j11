package com.theerut.springj11.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequest {

    @JsonProperty("target")
    private String target;

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("template_id")
    private Integer templateId;

    @JsonProperty("replacement_content")
    private Map<String, String> replacementContent;

}
