/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.exercicio02;
/* Criar uma classe TestaCliente para instanciação da classe Cliente como Fulano.
Chamar os métodos realizarDeposito() 
e realizarSaque() nessa classe para que o saldo seja modificado  
Criar, também na classe TestaCliente, um outro cliente (Beltrano) e realizar as
mesmas atividades do Fulano.  */
public class TestaCliente {
    public static void main(String[] args){
        Cliente fulano = new Cliente(2323, 13500,
                "João", 1.35000f);
        
        System.out.println("Dados do cliente: ");
        fulano.dadosCliente();
        System.out.println("Realizar depósito: ");
        fulano.realizarDeposito(350);
        System.out.println("Realizar Saque");
        fulano.realizarSaque(50);
        fulano.dadosCliente();
        
        Cliente beltrano = new Cliente (2424, 14790, 
                "Maria", 275.5f);
        
        System.out.println("Dados do cliente: ");
        beltrano.dadosCliente();
        System.out.println("Realizar depósito: ");
        beltrano.realizarDeposito(120);
        System.out.println("Realizar Saque");
        beltrano.realizarSaque(20);
        beltrano.dadosCliente();
    }
}
