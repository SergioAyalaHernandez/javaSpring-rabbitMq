package com.sergiowebhook.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class TemplateUpdate {
    private String object;
    private List<Entry> entry;
}
