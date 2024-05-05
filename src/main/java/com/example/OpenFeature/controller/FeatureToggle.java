package com.example.OpenFeature.controller;

import dev.openfeature.sdk.Client;
import dev.openfeature.sdk.OpenFeatureAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureToggle {

    private final OpenFeatureAPI openFeatureAPI;

    @Autowired
    public FeatureToggle(OpenFeatureAPI OFApi) {
        this.openFeatureAPI = OFApi;
    }
    @GetMapping("/feature-toggle")
    public String getFeatureToggle(){
        return "in progress";
    }



    @GetMapping("/hello")
    public String getHello() {
        final Client client = openFeatureAPI.getClient();

        // Evaluate welcome-message feature flag
        System.out.println("string key1:"+ client.getStringValue("myStringFlag", "val2"));
        System.out.println("string key1:"+ client.getBooleanValue("myBoolFlag", false));


        return "Hello!";
    }
}
