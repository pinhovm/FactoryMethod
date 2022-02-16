package Montadora;

import Prova.Agenda;

import javax.swing.*;
import java.util.ArrayList;

public class Montadora {
    private String nomeMontadora;
    private String modeloCarro;
    private int ano;

    public ArrayList<Montadora> montadora = new ArrayList<>();

    public Montadora() {}

    public Montadora(String nomeMontadora, String modeloCarro, int ano) {
        this.nomeMontadora = nomeMontadora;
        this.modeloCarro = modeloCarro;
        this.ano = ano;

    }

    public String getNomeMontadora() {
        return nomeMontadora;
    }

    public void setNomeMontadora(String nomeMontadora) {
        this.nomeMontadora = nomeMontadora;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public ArrayList<Montadora> getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadoraC) {
        this.montadora.add(montadoraC);
    }

    public void verificacaoModelo(String modelo){
        for(Montadora m : montadora){
            if(m.getModeloCarro().equals(modelo)){
                JOptionPane.showMessageDialog(null, "\nNome montadora: " + m.getNomeMontadora() + "\nModelo do Carro: " + m.getModeloCarro() + "\nAno do modelo: " + m.getAno());
            }
        }
    }

}
