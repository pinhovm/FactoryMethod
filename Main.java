package Montadora;

import javax.swing.*;

public class Main {
    static Montadora montadora_de_carros = new Montadora();

    public static void main(String args[]){


        int sair = 1;
        while(sair!=0){
            int escolha=Integer.parseInt(JOptionPane.showInputDialog("0 = Sair \n1 =  adicionar Modelo: \n 2 = Verificar Modelo "));
            switch(escolha){
                case 0:
                    sair = 0;
                    break;
                case 1:
                    montadora_de_carros.setMontadora(addModelo());
                    break;
                case 2:
                    String modelo = JOptionPane.showInputDialog("Modelo Carro: ");
                    montadora_de_carros.verificacaoModelo(verificarModelo(modelo));
                    break;
            }
        }



    }


    private static Montadora addModelo(){
        Montadora m = new Montadora();
        m.setModeloCarro(JOptionPane.showInputDialog("Modelo Carro: "));
        m.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano do Modelo: ")));
        m.setNomeMontadora(JOptionPane.showInputDialog("Montadora do Carro: "));
        return m;
    }

    private static String verificarModelo(String modelo){
        montadora_de_carros.verificacaoModelo(modelo);
        return null;
    }

}
