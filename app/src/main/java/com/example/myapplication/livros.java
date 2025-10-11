package com.example.myapplication;

public class livros {

    String tituloAt;
    String subtituloAt;

    public livros(){

    }

    public livros(String t, String st){
        this.tituloAt = t;
        this.subtituloAt = st;
    }

    public void setTituloAt(String ttl){
        this.tituloAt = ttl;
    }
    public void setSubtituloAt(String stl){
        this.subtituloAt = stl;
    }

    public String getTituloAt(){
        return subtituloAt;
    }
    public  String getSubtituloAt(){
        return  tituloAt;
    }








}
