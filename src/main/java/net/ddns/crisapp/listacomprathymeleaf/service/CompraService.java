package net.ddns.crisapp.listacomprathymeleaf.service;

import net.ddns.crisapp.listacomprathymeleaf.model.Compra;
import net.ddns.crisapp.listacomprathymeleaf.repository.CompraMockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompraService {

    @Autowired
    private CompraMockRepository repository;

    public List<Compra> lista(){
        return repository.findAll();
    }

    public void add(Compra compra){
        repository.add(compra);
    }
}
