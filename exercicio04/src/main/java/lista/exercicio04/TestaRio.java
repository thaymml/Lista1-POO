/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.exercicio04;

/* Cria uma classe TestaRio, que cria dois Rios (cada um deve utilizar um 
construtor diferente) e teste os métodos criados. */
public class TestaRio {
    public static void main(String[] args){
        Rio rioSapucai = new Rio();
        
        rioSapucai.mostrar();
        System.out.println("O nível do rio aumentou: ");
        rioSapucai.chover(5.5f);
        rioSapucai.mostrar();
        System.out.println("O nível do rio diminuiu: ");
        rioSapucai.ensolarar(3.0f);
        rioSapucai.mostrar();
        rioSapucai.limpar();
        rioSapucai.mostrar();
        rioSapucai.sujar();
        rioSapucai.mostrar();
        
        
        Rio rioGrande = new Rio("Rio Grande" , 3.45f, true);
        
        rioGrande.mostrar();
        System.out.println("O nível do rio aumentou: ");
        rioGrande.chover(5.5f);
        rioGrande.mostrar();
        System.out.println("O nível do rio diminuiu: ");
        rioGrande.ensolarar(3.0f);
        rioGrande.mostrar();
        rioGrande.limpar();
        rioGrande.mostrar();
        rioGrande.sujar();
        rioGrande.mostrar();
    }
}
