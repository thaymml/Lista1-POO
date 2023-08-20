/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Lista1;

/**
 *
 * @author thays
 */

/* Crie uma classe em Java chamada Aluno contendo as variáveis de instância 
numeroAluno (int), nome (String), idade (int), p1 (float) e p2 (float), 
Crie os construtores 
Crie os métodos notaFinal() - que calcula e retorna a média final do aluno - , 
e dadosAluno() - que retorna os valores de numeroAluno, nome e idade. 
Criar uma classe TestaAluno com o método main() para instanciação da classe 
Aluno (atribuição das variáveis de instância com quaisquer valores e chamada 
dos métodos notaFinal() e dadosAluno()).  
Adicionar o método passou() à classe Aluno a fim de verificar se o aluno 
passou. Chame o método passou() na classe TestaAluno a fim de testa-lo.*/
public class Aluno {
    //VARIAVEIS DE INSTÂNCIA
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;
    
    //CONSTRUTORES
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    public float notaFinal(){
        return (p1 + p2)/2;
    }
    public void dadosAluno(){
        System.out.println("Número do Aluno: " + numeroAluno);
        System.out.println("Nome " + nome);
        System.out.println("Idade: " + idade);
    }
    public boolean passou(){
        return notaFinal()>= 6.0;
    }
}
