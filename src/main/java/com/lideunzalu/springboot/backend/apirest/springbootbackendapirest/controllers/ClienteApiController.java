package com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.controllers;

import com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @RequestMapping: Mapea todos los métodos del apiREST para generar el endpoint/URL
 * @GetMapping: Cada método tiene su propio endpoint
 * @CrossOrigin: Para conectar el back con el front en angular
 */

@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteApiController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> findAll(){
        return (List<Cliente>) clienteService.findAll();
    }
    @GetMapping("/clientes/{id}")
    public Cliente findById(@PathVariable Long id){
        return clienteService.findById(id);
    }
    /**
     * @param cliente @RequestBody: viene en formato JSON dentro del cuerpo de la petición
     *                HttpStatus.CREATED: Devuelve un 201.
     *                Por defecto si va bien ResponseStatus devuelve un 200.
     * @return
     */
    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id){
        //clienteActual de la bbdd
        Cliente clienteActual=clienteService.findById(id);
        //cliente que nos están enviando
        clienteActual.setNombre(cliente.getNombre());
        clienteActual.setApellido(cliente.getApellido());
        clienteActual.setEmail(cliente.getEmail());
        clienteActual.setFecha(cliente.getFecha());

        return clienteService.save(clienteActual);
    }

    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)//204
    public void delete(@PathVariable Long id){
        clienteService.delete(id);
    }
}
