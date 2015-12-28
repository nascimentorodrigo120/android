package com.example.irom.exemplocardview2;

import java.io.Serializable;

/**
 * Created by irom on 20/12/2015.
 */
public class Carros implements Serializable {

    private String nome;
    private String marca;
    private String tipo;
    private int icone;

    public Carros(String nome, String marca, String tipo, int icone) {
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.icone = icone;
    }

    public Carros() {
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIcone() {
        return icone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIcone(int icone) {
        this.icone = icone;
    }

    @Override
    public String toString() {
        return nome;
    }
}
