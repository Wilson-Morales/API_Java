/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cliente;

import com.example.model.pokemon;
import com.example.model.pokemonField;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "digimonApi", url="https://pokeapi.co/api/v2/")
public class pokemonClienteApi {
    
    @GetMapping("pokemon/{blaziken}")
    pokemon getPokemonInfo(@PathVariable String pokemon);


}
