package eje1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class libro {
 
    private int Isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
     public libro(int isbn,String titulo, String autor, int numeroPaginas){
   this.Isbn = isbn;
   this.titulo = titulo;
   this.autor = autor;
   this.numeroPaginas = numeroPaginas;
    }

    public libro(){}
    
    //getter

    public int getIsbn() {
        return Isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
   
   //setter 

    public void setIsbn(int isbn) {
        this.Isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


}