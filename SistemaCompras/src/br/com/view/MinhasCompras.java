/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.view;

import br.com.controle.Compra;
import javax.swing.JOptionPane;

/**
 *
 * @author anaclara.lelis
 */
public class MinhasCompras {
    
    public static void main(String[]args){
        Compra compra = new Compra();
        //pegar o valor e a quantidade de parcelas
        compra.setValor(Double.valueOf(JOptionPane.showInputDialog("Digite o valor da compra")));
        compra.setQuantidadeParcelas(Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade de parcelas")));
        
        //saida dos valores
        JOptionPane.showMessageDialog(null,"Saida: "+compra.getValor());
        JOptionPane.showMessageDialog(null,"Quantidade de parcelas:"+compra.getQuantidadeParcelas());
        
       
        JOptionPane.showMessageDialog(null,"Valor com 5% de Desconto"+compra.desconto());
        JOptionPane.showMessageDialog(null,"Valor com 10% de Juros"+compra.desconto());
    }
}
