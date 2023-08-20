/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.exercicio03;

/* Implemente em Java uma classe chamada Produto contendo as variáveis id (int), 
descrição (String), qtde (int) e preco (float). Essa classe deve possuir os 
dois métodos construtores, com e sem parâmetros, e ainda os métodos:
•comprar(int x): que compra um produto aumentando em x a quantidade em estoque;
•vender(int x): que vende um produto diminuindo em x a quantidade em estoque;
•subir(float x): que aumenta o preço do produto em x unidades;
•descer(float x): que diminui o preço do produto em x unidades;
•mostra(): que mostra todas as informações do produto */
public class Produto {
    public int id;
    public String descricao;
    public int qtde;
    public float preco;
    
    public Produto(){
        
    }
    public Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    //MÉTODOS
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    public void vender(int x){
        if((x <= this.qtde)){
            this.qtde = this.qtde - x;
        } else{
            System.out.println("Estoque insuficiente!");
        }
    }
    public void subir(float x){
        this.preco = this.preco + x;
    }
    public void descer (float x){
        if(x <= this.preco){
            this.preco -= x;
        }else{
            System.out.println("Não é possível abaixar o preço");
        }
    }
    public void mostrar(){
        System.out.println("Id: " + this.id + ", Descrição: " + this.descricao
            + ", Quantidade: " + this.qtde + ", Preço: " + this.preco);
    }
}
