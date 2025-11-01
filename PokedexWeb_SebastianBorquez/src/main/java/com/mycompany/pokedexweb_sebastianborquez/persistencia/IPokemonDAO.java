/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pokedexweb_sebastianborquez.persistencia;

import com.mycompany.pokedexweb_sebastianborquez.dominio.PokemonDTO;
import java.util.List;

/**
 *
 * @author sonic
 */
public interface IPokemonDAO {
    public List<PokemonDTO> obtenerNuevosPokemones();
    
}
