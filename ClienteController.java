package UNIESP.api.controller;

import UNIESP.api.model.Cliente;
import UNIESP.api.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {
    @Autowired
    ClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente){
        Cliente clienteCreated = service.create(cliente);
        return ResponseEntity.status(201).body(clienteCreated);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findAll(){
        return service.findAll();}

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findByNameCliente(@PathVariable String name){
         return findByNameCliente(name);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable("id") Long id){
        service.deleteCliente(id);
    }


}


