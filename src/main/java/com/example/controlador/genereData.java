/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controlador;

import com.example.cliente.pokemonClienteApi;
import com.example.model.pokemon;
import com.mysql.cj.xdevapi.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class genereData {

    private pokemon pokemon;
    private pokemonClienteApi pokemonClienteApi;
    
    public genereData (pokemon pokemon, pokemonClienteApi pokemonClienteApi){
    
        this.pokemon = pokemon;
        this.pokemonClienteApi = pokemonClienteApi;
    
    }
    
    
    public Optional<Result> getImformacion(){
    
        if (pokemon != null){
        
            Result.ResultBuilder resultBuilder = Result.builder();
            
            resultBuilder.BaseHappiness(pokemon.getbaseHappiness());
            resulBuilder.CaptureRate(pokemongetCaptureRate());
            
            List<int> game_indices = pokemon.getGameIndices().stream()
                    .map(pokemon.GameIndices::getGameIndices).collect(Collectors.toList());
            resultBuilder.game_indices(game_indices);

            List<int> forms = pokemon.getForms().stream()
                    .map(pokemon.Forms::getForms).collect(Collectors.toList());
            resultBuilder.forms(forms);
            
            
            List<String> types = pokemon.getTypes().stream()
                    .map(pokemon.Types::getTypes).collect(Collectors.toList());
            resultBuilder.types(types);
            
             List<String> half_damage_to = pokemon.getHalfDamageTo().stream()
                    .map(pokemon.HalfDamageTo::getHalfDamageTo).collect(Collectors.toList());
            resultBuilder.half_damage_to(half_damage_to);
            
            String flavor_text = pokemon.getFlavorTextEntreies().stream()
                    .filter(flavor_text -> "en_of".equals(flavor_text.getLanguage()))
                    .findFirst().orElse(pokemon.FlavorTextEntries.builder().flavor_text("Descripcion no encontrada").build())
                    .getFlavor_text();
            resultBuilder.flavor_text(flavor_text);
            
                     
            
  
        
        }
    
    }
    



}
