package com.BarberShop.Api.controller;

import org.apache.catalina.connector.Response;
import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class teste 
{

    @GetMapping
    public ResponseEntity getteste()
    {
        return ResponseEntity.ok("Teste");
    }
}
