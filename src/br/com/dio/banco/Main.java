package br.com.dio.banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("GFT");


        Cliente venilton = new Cliente(" Venilton", banco);
        Conta cc = new ContaCorrente(venilton);


        Cliente amanda = new Cliente(" Amanda", banco);
        Conta cp = new ContaPoupanca(amanda);

        cc.depositar(150);

        banco.mostrarClientes();

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();




    }
}
