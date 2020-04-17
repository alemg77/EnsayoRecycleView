package com.example.ensayorecycleview;

public class Personaje {
    private String nombre;
    private String editora;
    private String superpoder;
    private Integer imagen;

    public Personaje(String nombre, String editora, String superpoder, Integer imagen) {
        this.nombre = nombre;
        this.editora = editora;
        this.superpoder = superpoder;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEditora() {
        return editora;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }
}
