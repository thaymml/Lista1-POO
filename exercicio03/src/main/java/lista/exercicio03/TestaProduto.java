/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lista.exercicio03;

/* Cria uma classe TestaProduto, que cria dois Produtos (cada um deve utilizar 
um construtor diferente) e teste os métodos criados.*/
public class TestaProduto {

    public static void main(String[] args) {
        Produto tipo1 = new Produto();
        
        tipo1.mostrar();
        System.out.println("Comprar: ");
        tipo1.comprar(3);
        tipo1.mostrar();
        System.out.println("Vender: ");
        tipo1.vender(7);
        tipo1.mostrar();
        System.out.println("Comprar: ");
        tipo1.comprar(15);
        tipo1.mostrar();
        System.out.println("Subir Preço: ");
        tipo1.subir(10);
        tipo1.mostrar();
        System.out.println("Diminuir Preço: ");
        tipo1.descer(3);
        tipo1.mostrar();
        
        Produto tipo2 =  new Produto(10, "Detergente", 7,
                2.10f);
        
        tipo2.mostrar();
        System.out.println("Comprar: ");
        tipo2.comprar(5);
        tipo2.mostrar();
        System.out.println("Vender: ");
        tipo2.vender(4);
        tipo2.mostrar();
        System.out.println("Comprar: ");
        tipo2.comprar(11);
        tipo2.mostrar();
        System.out.println("Subir Preço: ");
        tipo2.subir(12);
        tipo2.mostrar();
        System.out.println("Diminuir Preço: ");
        tipo2.descer(5);
        tipo2.mostrar();
    }
}
