/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lista.exercicio04;

/* Implemente em Java uma classe chamada Rio contendo as variáveis nome(String),
nível (float) e poluído (boolean). Essa classe deve possuir os dois métodos 
construtores, com e sem parâmetros, e ainda os métodos:
•chover(float): que aumenta o nível atual do rio;
•ensolarar(float): que diminui o nível atual do rio;
•limpar(): que limpa o rio;
•sujar(): que polui o rio;
•mostra(): que mostra todas as informações do rio. */
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    
    public Rio(){
        
    }
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void chover(float aumentaQtde){
        if(aumentaQtde > 0){
            nivel += aumentaQtde;
            System.out.println("Chuva de " + aumentaQtde + " metros cúbicos"
                    + "aumentou o nível do rio para "
            + nivel + " metros");
        }else{
            System.out.println("A quantidade de chuva deve ser positiva.");
        }
    }
    public void ensolarar(float diminuiQtde){
        if(diminuiQtde < 0){
            nivel -= diminuiQtde;
            System.out.println("O ni´vel do rio dimuiu para " +
                    " após a seca.");
        } else{
            System.out.println("A qtde de chuva deve ser insuficiente.");
        }
    } 
     public void limpar(){
        poluido = false;
        System.out.println("O rio " + nome + " foi limpo.");
    }
    public void sujar(){
        poluido =  true;
        System.out.println("O rio " + nome + " foi poluído.");
    }
    public void mostrar(){
        System.out.println("Nome: " + this.nome + ", Nível: " + this.nivel +
                ", Poluído: " + this.poluido);
    }
}
