package dk.tdc.template.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @GetMapping(path="/")
    public ResponseEntity<Map<String, String>> getHelloWorld(){
        Map<String, String> output = new HashMap<>();
        output.put("Hello", "World!");
        return ResponseEntity.ok(output);
    }
}
