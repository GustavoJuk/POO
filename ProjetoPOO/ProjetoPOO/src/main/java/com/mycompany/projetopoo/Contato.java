package com.mycompany.projetopoo;

import java.util.Scanner;

public class Contato {
    private int ddd;
    private Double telefone;
    private String email;

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public Double getTelefone() {
        return telefone;
    }

    public void setTelefone(Double telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void imprimir(){
        System.out.println("********Contato********");
        System.out.println("DDD - " + this.getDdd());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Email: " + this.email);
    }
    
    public static void cadastrar(Empresa empresa){
        Scanner scan = new Scanner(System.in);
        Contato contato = new Contato();
        
        System.out.println("********Digite informações de contato********");
        System.out.println("DDD: ");
        contato.ddd = scan.nextInt();
        System.out.println("Telefone: ");
        contato.telefone = scan.nextDouble();
        System.out.println("Email: ");
        scan.nextLine();
        contato.email = scan.nextLine();
    }
}
