package com.sergiowebhook.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sergiowebhook.demo.model.TemplateUpdate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class WebhookController {

    @GetMapping(value = "get")
    public String getValue(){
        return "holi";
    }

    @PostMapping("/webhook")
    public @ResponseBody String receveUpdate(@RequestBody String payload)throws Exception {
        log.info("received on Webhook Controller: {}",payload);
        ObjectMapper mapper = new ObjectMapper();
        TemplateUpdate templateUpdate = mapper.readValue(payload, TemplateUpdate.class);
        log.info("TemplateUpdate Object Received {}", templateUpdate);
        return "Se ha recibido con éxito el objeto";
    }
}
