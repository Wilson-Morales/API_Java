/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class pokemon {
    
    
    private List<GameIndices> game_indices;
    private List<Forms> forms;
    private List<Types> types;
    private List<FlavorTextEntries> flavor_text;
    private List<pokemon.HalfDamageTo> half_damage_to;
    private int BaseHappiness;
    private int CaptureRate;

   
    
    
    
    @Builder
    @Getter
    public static class GameIndices {
        private int height;
        
    }
    
    @Builder
    @Getter
    public static class Forms {
        private String name;
        
    }
    
    @Builder
    @Getter
    public static class Types {
        private int weight;
        private String name;
        
    }
    
    @Builder
    @Getter
    public static class FlavorTextEntries {
        private String flavor_text;
        
    }
    
    @Builder
    @Getter
    public static class HalfDamageTo {
        private String name;
        
    }
    
}
