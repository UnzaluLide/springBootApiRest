package com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.services;

import com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.dao.ClienteDao;
import com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Transactional(readOnly = true), es un SELECT, una consulta, por eso readOnly=true
 */

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
    /**
     *
     * @param id
     * @return findById -->método de CrudRepository devuelve un Optional.
     * Si no encuentra el objeto de tipo Cliente retorna un null.
     */
    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteDao.deleteById(id);
    }
}
