
package br.com.controle;

public class Compras {
    private double valor;
    
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    
    public double desconto(){ //aqui estão atribuindo o desconto no valor;

        return this.valor - (this.valor * 0.1);
    }
    
    
}
