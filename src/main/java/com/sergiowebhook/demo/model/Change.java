package com.sergiowebhook.demo.model;

import lombok.Data;

@Data
public class Change {
    private Value value;
    private String field;
}
