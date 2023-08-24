/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controlador;

import com.mysql.cj.xdevapi.Result;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;


@RestController
 
public class pokemonControlador {
    
    @Autowired
    private pokemonService pokemonService;

    @GetMapping("pokemon/ditto")
    public ResponseEntity<?> getPokemonInfo(@PathVariable String ditto) {
        Optional<Result> optionalResult = pokemonService.getInfoPokemon(ditto);
        if (optionalResult.isPresent()) {
            return ResponseEntity.ok(optionalResult.get());
        }
        return ResponseEntity.notFound().build();
    }
    
}
