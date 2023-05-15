package com.sergiowebhook.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Value {
    private String event;
    @JsonProperty("message_template_id")
    private String messageTemplateId;
    @JsonProperty("message_template_name")
    private String messageTemplateName;
    @JsonProperty("message_template_language")
    private String messageTemplateLanguage;
    private String reason;
    private DisableInfo disableInfo;
    private OtherInfo otherInfo;
}
