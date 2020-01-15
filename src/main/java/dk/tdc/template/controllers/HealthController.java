package dk.tdc.template.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping(path = "/health")
    public ResponseEntity<Map> getHealth(){
        Map healthMap = new HashMap<>();
        healthMap.put("Health", "OK");
        return ResponseEntity.ok(healthMap);
    }

}
