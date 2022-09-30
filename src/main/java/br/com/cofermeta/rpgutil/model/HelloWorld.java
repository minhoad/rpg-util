package br.com.cofermeta.rpgutil.model;


import lombok.Data;

@Data
public class HelloWorld {
    private int id;
    private String nome;

    public HelloWorld(int id, String nome){this.id = id; this.nome = nome;}

}
