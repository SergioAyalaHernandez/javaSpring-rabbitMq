package com.sergiowebhook.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DisableInfo {
    @JsonProperty("disable_date")
    private String disableDate;
}
