package com.example.deploy.controller;

import com.example.deploy.dto.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployTestController {

    @GetMapping("/")
    public ResponseEntity<ResponseDto> home() {
        return ResponseEntity.ok(new ResponseDto("OK"));
    }
}
