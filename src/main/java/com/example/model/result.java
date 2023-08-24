/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

import java.util.List;
import lombok.Builder;
import lombok.Getter;


public class result {

    private List<pokemon.GameIndices> game_indices;
    private List<pokemon.Forms> forms;
    private List<pokemon.Types> types;
    private List<pokemon.FlavorTextEntries> flavor_text;
    private List<pokemon.HalfDamageTo> half_damage_to;
    private int BaseHappiness;
    private int CaptureRate;

    public static class ResultBuilder {

        @Override
        public String toString() {
            return "Pokemon Information \n"
                    + "Name:  " + forms
                    + "\nHeight: " + game_indices
                    + "\nWeight: " + types
                    + "\nDescription: " + flavor_text
                    + "\nType: " + half_damage_to
                    
                    + "\tBase Point: %d %d" + BaseHappiness + CaptureRate;
        }
    }

    
}
