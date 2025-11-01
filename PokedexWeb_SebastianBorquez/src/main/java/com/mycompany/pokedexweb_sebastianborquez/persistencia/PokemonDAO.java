/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexweb_sebastianborquez.persistencia;

import com.mycompany.pokedexweb_sebastianborquez.dominio.PokemonDTO;
import com.mycompany.pokedexweb_sebastianborquez.dominio.Tipo;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sonic
 */
public class PokemonDAO implements IPokemonDAO{

    @Override
    public List<PokemonDTO> obtenerNuevosPokemones() {
        List<PokemonDTO> pokemonNuevos = Arrays.asList(
            new PokemonDTO("Chimchar", 105, Tipo.FUEGO, "img/chimchar.png"),
            new PokemonDTO("Squirtle", 65, Tipo.AGUA, "img/squirtle.png"),
            new PokemonDTO("Charizard", 15, Tipo.FUEGO, "img/charizard"),
            new PokemonDTO("Wooloo", 195, Tipo.NORMAL, "img/wooloo")
        );
        return pokemonNuevos;
    }
}
