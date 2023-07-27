package net.ddns.crisapp.listacomprathymeleaf.repository;

import net.ddns.crisapp.listacomprathymeleaf.model.Compra;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CompraMockRepository {

    private List<Compra> lista = new ArrayList<>();

    public List<Compra> findAll(){
        return lista;
    }

    public void add(Compra compra){
        lista.add(compra);
    }
}
