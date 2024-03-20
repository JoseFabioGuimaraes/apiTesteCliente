package UNIESP.api.services;

import UNIESP.api.model.Cliente;
import UNIESP.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository repository;

    public Cliente create(Cliente cliente){
        return repository.save(cliente);
    }

    public List<Cliente> findByNameCliente(String nome){
        return repository.findByName(nome);
    }

    public List<Cliente> findAll(){
        return repository.findAll();
    }

    public void deleteCliente(Long id){
        repository.deleteById(id);
    }
}
