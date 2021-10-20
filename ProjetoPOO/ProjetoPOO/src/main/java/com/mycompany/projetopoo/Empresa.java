package com.mycompany.projetopoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    String nome;
    Endereco endereco = new Endereco();
    Contato contato;
    static int idFilial=0;
    static ArrayList<Filial> novaFilial = new ArrayList();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Empresa empresa = new Empresa();
        Filial j = new Filial();
        
        System.out.println("********Nova empresa********");
        System.out.println("Digite o nome da empresa: ");
        empresa.nome = scan.nextLine();
        Endereco.cadastrar(empresa);
        Contato.cadastrar(empresa);
        int op;
        do{
            op = tela1(scan);
            switch(op){
                case 1 -> infoFilial(scan, novaFilial, j);
                default -> System.out.println("");
            }
        }while(op != 0);
    }
    
    static int tela1(Scanner scan){
        int i;
        System.out.println("(1) - Filial");
        //System.out.println("(2) - Funcionário");
        System.out.println("(0) - Sair");
        i = scan.nextInt();
        return i;
    }
    
    static void infoFilial(Scanner scan, ArrayList<Filial> novaFilial, Filial j){
        switch(j.tela()){
            case 1 :
                    Filial.cadastroFilial(novaFilial, idFilial);
                    break;
            case 2:
                if(!Filial.informacaoFilial(novaFilial)) {
                    System.out.println("Erro ao encontrar Filial");
                }
                break;
            case 3 :
                if(Filial.atualizaFilial(novaFilial)) {
                    System.out.println("Filial Atualizada com sucesso!");
                } else {
                    System.out.println("Erro ao atualizar Filial");
                }
                break;
            case 4: 
                Filial.excluiFilial(novaFilial);
                break;
            case 0:
                return;
        }
    }
    
}
