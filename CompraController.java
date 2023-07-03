package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraRepository compraRepository;

    @GetMapping
    public List<Compra> listarCompras() {
        return compraRepository.findAll();
    }

    @PostMapping
    public Compra adicionarCompra(@RequestBody Compra compra) {
        return compraRepository.save(compra);
    }

    @DeleteMapping("/{id}")
    public void removerCompra(@PathVariable Long id) {
        compraRepository.deleteById(id);
    }

}
