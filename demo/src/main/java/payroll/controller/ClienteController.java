package payroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import payroll.model.Cliente;
import payroll.repository.ClienteRepository;

import java.util.List;

// Uma classe que vai receber requisicoes para cria as requisicoes Rest
@RestController
@RequestMapping ("/clientes")
public class ClienteController {

    //Metodos

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }
    @PatchMapping
    public Cliente adicionar (@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);//Retorna o cliente salvo
    }
}
