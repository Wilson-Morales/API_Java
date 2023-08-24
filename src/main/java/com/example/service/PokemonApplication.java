package com.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cliente.pokemonClienteApi;
import com.example.controlador.genereData;
import com.example.model.pokemon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

@EnableDiscoveryClient
@EnableFeignClients

public class PokemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);

        @Bean
        public CommandLineRunner run
        (pokemonClientApi pokemonClienteApi) {
        return args -> {
                pokemon pokemonInfo = pokemonClienteApi.getPokemonInfo("Blaziken");
                GenerateData data = new GenerateData(pokemonInfo, pokemonClienteApi);
                data.getInformation();

            };
        }

    }

}
