package br.com.dio.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    List<Cliente> clientes = new ArrayList<Cliente>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarClientes() {
        System.out.println(clientes);
    }
}
