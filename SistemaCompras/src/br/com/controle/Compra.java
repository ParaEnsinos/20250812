/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author anaclara.lelis
 */
public class Compra {
    private double valor;
    private int quantidadeParcelas;
    
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setQuantidadeParcelas(int quantidadeParcelas){
        this.quantidadeParcelas = quantidadeParcelas;
    }
    
    public int getQuantidadeParcelas(){
        return this.quantidadeParcelas;
    }
    
    //aqui estamos aplicando o desconto caso não tenha parcela
    public double desconto(){
        if(this.quantidadeParcelas == 0 ){
            return this.valor = this.valor - (this.valor * 0.05);
        }else {
            return this.valor = this.valor + (this.valor * 0.1);
      
    }
    }
}
