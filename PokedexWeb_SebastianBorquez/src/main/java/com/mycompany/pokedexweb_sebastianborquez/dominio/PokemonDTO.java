/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexweb_sebastianborquez.dominio;

/**
 *
 * @author sonic
 */
public class PokemonDTO {
    private String nombre;
    private int numero;
    private String tipo;
    private String imagen;

    public PokemonDTO(String nombre, int numero, String tipo, String imagen) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getImagen() {
        return imagen;
    }
    
    
    
    
}
