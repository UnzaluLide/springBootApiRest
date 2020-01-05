package com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.controllers;

import com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @RequestMapping: Mapea todos los métodos del apiREST para generar el endpoint/URL
 * @GetMapping: Cada método tiene su propio endpoint
 */

@RestController
@RequestMapping("/api")
public class ClienteApiController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> findAll(){
        return (List<Cliente>) clienteService.findAll();
    }
}
