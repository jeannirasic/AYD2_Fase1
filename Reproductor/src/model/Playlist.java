/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.util.LinkedList;

/**
 *
 * @author jeann
 */
public class Playlist {
    private int id;
    private File portada;
    private String nombre;
    private String genero;
    private String descripcion;
    private String autor;
    private LinkedList<Song> canciones;

    public Playlist(int id, File portada, String nombre, String genero, String descripcion, String autor) {
        this.id = id;
        this.portada = portada;
        this.nombre = nombre;
        this.genero = genero;
        this.descripcion = descripcion;
        this.autor = autor;
        this.canciones = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public LinkedList<Song> getCanciones() {
        return canciones;
    }

    public void setCanciones(LinkedList<Song> canciones) {
        this.canciones = canciones;
    }

    public File getPortada() {
        return portada;
    }

    public void setPortada(File portada) {
        this.portada = portada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
}
