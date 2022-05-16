package br.com.dio.banco;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);


    void imprimirExtrato();

    void transferir(double valor, IConta contaDestino);


}
