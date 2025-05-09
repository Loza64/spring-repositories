package com.pnc.loza.labo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Rest {

    @GetMapping("/labo")
    public ResponseEntity<?> getVentas(){
        return ResponseEntity.ok("Carlos Roberto Loza Castillo");
    }

}
