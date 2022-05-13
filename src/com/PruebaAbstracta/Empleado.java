package com.PruebaAbstracta;

public abstract class Empleado {
    private String nombre;
    private String direccion;
    private int numero;

    public Empleado(String nombre, String direccion, int numero) {
        System.out.println("construyendo un empleado");
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
    }
    public double pagoComputado(){
        System.out.println("dentro el pago computado al empleado");
        return 0.0;
    }
    public void chequeCorreo(){
        System.out.println("enviando queche por correo a "
        + this.nombre+""+this.direccion);
    }
    public String toString(){
        return nombre + ""+direccion+""+numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumero() {
        return numero;
    }
    public void setDireccion(String nueva){
        direccion=nueva;
    }

}
