package com.mycompany.projetopoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Filial extends Endereco {
    private String nome;
    private Contato contato;
    private long id=0;
    
    public Filial(){
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
//    public void verificacao(ArrayList<Filial> novaFilial, Filial j, Scanner scan){;
//        int u=0, k;
//        if(!novaFilial.isEmpty()){
//            for(Filial filial: novaFilial){
//                System.out.println("ID = (" + u + ")" + j.getNome());
//                u++;
//            }
//        }else{
//            System.out.println("É necessário ter uma filial cadastrada.");
//        }
//    }

    @Override
    public void imprimir(){
        System.out.println("********Informações da Filial********");
        System.out.println("Nome da filial: " + this.getNome());
        super.imprimir();
         
    }
    
    public int tela(){
        Scanner scan = new Scanner(System.in);
        int i;
        System.out.println("(1) - Cadastrar nova filial");
        System.out.println("(2) - Informação sobre a filial");
        System.out.println("(3) - Atualizar filial");
        System.out.println("(4) - Excluir filial");
        System.out.println("(0) - Voltar");
        i = scan.nextInt();
        return i;
    }
    
    public static void cadastroFilial(ArrayList<Filial> novaFilial, int idFilial){
        Filial filial = new Filial();
        Scanner scan = new Scanner(System.in);
        
        filial = Endereco.cadastrarFilial();

        System.out.println("Digite o nome da filial: ");
        filial.setNome(scan.nextLine());
        
        
        filial .setId(idFilial);
        
        System.out.println(filial.getId());
        
        novaFilial.add(filial);
        
        idFilial++;
        
    }
    
    public static boolean informacaoFilial(ArrayList<Filial> novaFilial){
        
         Scanner scan = new Scanner(System.in);
          for(Filial filial: novaFilial){
              System.out.println("ID: " + filial.getId());
              System.out.println("Nome: " + filial.getNome());
          }
          
            System.out.println("\n\nEntre com o id a ser pesquisado: ");
            int id = scan.nextInt();
   
            for(Filial filial: novaFilial){
                if(filial.getId()==id){
                    filial.imprimir();
                    return true;
                } 
            }
            return false;
            
    }
    
    public static boolean atualizaFilial(ArrayList<Filial> novaFilial){
        Scanner scan = new Scanner(System.in);
         for(Filial filial: novaFilial){
              System.out.println("ID: " + filial.getId());
              System.out.println("Nome: " + filial.getNome());
          }
        
        System.out.println("\n\nEntre com o id a ser atualizado: ");
        int id = scan.nextInt();
        scan.nextLine();
            for(Filial filial: novaFilial){
                if(filial.getId()==id){
                    System.out.println("Digite o novo nome da filial: ");
                    filial.setNome(scan.nextLine());
                    return true;
                }
            }
            return false;
    }
    
    public static void excluiFilial(ArrayList<Filial> novaFilial){
         Scanner scan = new Scanner(System.in);
         for(Filial filial: novaFilial){
              System.out.println("ID: " + filial.getId());
              System.out.println("Nome: " + filial.getNome());
          }
            System.out.println("\n\nEntre com o id a ser pesquisado: ");
            int id = scan.nextInt();
      
            for(Filial filial: novaFilial){
                if(filial.getId() == id){
                   novaFilial.remove(filial);
                   return;
                }
           
        }
    }




}