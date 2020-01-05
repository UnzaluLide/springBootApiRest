package com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.dao;

import com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 * CrudRepository:Interfaz de spring que ya trae todos los métodos para un CRUD
 * <Cliente, Long>:Cliente-->Clase Entity asociada al Dao
 *                 Long-->Tipo de dato del Id
 */
public interface ClienteDao extends CrudRepository<Cliente, Long> {
}
