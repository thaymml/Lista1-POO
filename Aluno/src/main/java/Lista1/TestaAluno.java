/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1;

/**
 *
 * @author thays
 */
public class TestaAluno {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(1, "João", 20, 7.5f,
                8.0f); 
        Aluno aluno2 = new Aluno(2, "Maria", 22,6.0f, 
                5.5f);
        
        System.out.println("Dados do Aluno 1: ");
        aluno1.dadosAluno();
        System.out.println("Média Final: " + aluno1.notaFinal());
        System.out.println("Situação: " + (aluno1.passou() ? "Aprovado" : 
                "Reprovado"));
        
        
        System.out.println("\nDados do Aluno 2: ");
        aluno2.dadosAluno();
        System.out.println("Média Final: " + aluno2.notaFinal());
        System.out.println("Situação: " + (aluno2.passou() ? "Aprovado" : 
                "Reprovado"));
    }
}