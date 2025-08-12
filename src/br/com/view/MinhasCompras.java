
package br.com.view;

import br.com.controle.Compras; //estamos importando o packote para dentro da class
import javax.swing.JOptionPane;

/**
 *
 * @author anaclara.lelis
 */
public class MinhasCompras { // visibiliade - tipo - nome
   public static void main(String[] args){
       Compras c = new Compras(); //estamos fazendo a instancia do objeto
       
       c.setValor(Double.valueOf(JOptionPane.showInputDialog("Querido Usuario Digite o valor"))); 
       /* Aqui estamos entrando com o valor a partir de uma interface
       todo valor entra como string e estamos fazendo a conversão com a class DOUBLE.VALUEOF
       E apos isso estao armazenando dentro do metodo set que armazena o valor */ 
    
       
       //mostrar o valor em forma de interface
       JOptionPane.showMessageDialog(null,"Valor com Desconto: "+c.desconto());
       
//       System.out.println("Valor de entrada: "+c.getValor());
       
//       System.out.print("Valor com Desconto: "+c.desconto());//mostrando na tela              
       
   } 
}
