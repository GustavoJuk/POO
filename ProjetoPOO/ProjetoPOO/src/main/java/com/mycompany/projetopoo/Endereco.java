package com.mycompany.projetopoo;

import java.util.Scanner;

public class Endereco {
    private String pais;
    private String uf;
    private String cidade;
    private String bairro;
    private String rua;
    private String complemento;
    private String numero;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void imprimir(){
        System.out.println("********Endereço********");
        System.out.println("Pais: " + this.getPais());
        System.out.println("UF: " + this.getUf());
        System.out.println("Cidade: " + this.getCidade());
        System.out.println("Bairro: " + this.getBairro());
        System.out.println("Rua: " + this.getRua());
        System.out.println("Número: " + this.getNumero());
        System.out.println("Complemento: " + this.getComplemento());
    }
    
    public static void cadastrar(Empresa empresa){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("********Digite o endereço da sede********");
        System.out.println("País: ");
        empresa.endereco.pais = scan.nextLine();
        System.out.println("UF: ");
        empresa.endereco.uf = scan.nextLine();
        System.out.println("Cidade: ");
        empresa.endereco.cidade = scan.nextLine();
        System.out.println("Bairro: ");
        empresa.endereco.bairro = scan.nextLine();
        System.out.println("Rua: ");
        empresa.endereco.rua = scan.nextLine();
        System.out.println("Número: ");
        empresa.endereco.numero = scan.nextLine();
        System.out.println("Complemento: ");
        empresa.endereco.complemento = scan.nextLine();
    }
    
    public static Filial cadastrarFilial(){
        Scanner scan = new Scanner(System.in);
        Filial filial = new Filial();
        
        System.out.println("********Digite o endereço da sede********");
        System.out.println("País: ");
        filial.setPais(scan.nextLine());
        System.out.println("UF: ");
        filial.setUf(scan.nextLine());
        System.out.println("Cidade: ");
        filial.setCidade(scan.nextLine());
        System.out.println("Bairro: ");
        filial.setBairro(scan.nextLine());
        System.out.println("Rua: ");
        filial.setRua(scan.nextLine());
        System.out.println("Número: ");
        filial.setNumero(scan.nextLine());
        System.out.println("Complemento: ");
        filial.setComplemento(scan.nextLine());
        
        return filial;
    }
}
