package br.com.dio.banco;

import java.util.*;

public class Cliente {
    public Banco nomeBanco;
    private String nome;


    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.nomeBanco = banco;
        this.nomeBanco.clientes.add(this);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Cliente(String nome) {
        this.nome = nome;
    }


    public void setBanco(Banco banco) {
        this.nomeBanco = banco;
        this.nomeBanco.clientes.add(this);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nomeBanco, getNome());
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        return Objects.equals(nomeBanco, other.nomeBanco) && Objects.equals(nome, other.nome);
    }

    @Override
    public String toString() {
        return "Cliente {banco=" + nomeBanco.getNome() + ", nome=" + nome + "}";
    }
}


