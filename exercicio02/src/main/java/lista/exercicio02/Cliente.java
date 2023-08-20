/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lista.exercicio02;

/**
 *
 * @author thays
 */

/* Crie uma classe em Java chamada Cliente contendo as variáveis de instância numeroConta (int), 
numeroAgencia (int), nome (String) e saldo (float), 
Crie os construtores 
Crie os métodos public  realizarDeposito() e realizarSaque() que, realizam depósito e saque, respectivamente, 
na conta do cliente. 
Crie um outro método public que retorna o numero da conta, nome do cliente e saldo atual. 
 */
public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;
    
    //CONSTRUTORES
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void realizarDeposito(float valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else{
            System.out.println("Valor inválido para depósito.");
        }
    }
    public void realizarSaque(float valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }else{
            System.out.println("Saque inválido. Verifique o saldo disponível.");
        }
    }
    public void dadosCliente(){
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Saldo: " + saldo);
    }
}

