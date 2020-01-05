package com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.services;

import com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;

import java.util.List;

public interface ClienteService {

    public List<Cliente> findAll ();
}
