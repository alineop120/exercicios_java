/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceMatematica;

/**
 *
 * @author 364975
 */
public class Quadrado extends FiguraGeometrica implements ObjetoGeometrico {
    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
    public Quadrado(String nome, Double lado) {
        super(nome);
        this.lado = lado;
    }
    
    @Override
    public Double calculaArea() {
        return (lado * lado);
    }
    
    @Override
    public Double calculaPerimetro() {
        return (4 * lado);
    }
    
    @Override
    public String toString() {
        return "-- Dados da Figura Geométrica: Quadrado --"+
                "\nNome: "+getNome()+
                "\nLado: "+getLado()+
                "\nArea: "+calculaArea()+
                "\nPerimetro: "+calculaPerimetro();
    }
}
