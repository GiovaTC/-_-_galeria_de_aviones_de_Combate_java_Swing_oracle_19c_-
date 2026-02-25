package model;

import java.awt.Image;

public class Avion {

    private String nombre;
    private String pais;
    private String tipo;
    private String velocidad;
    private Image imagen;

    public Avion(String nombre, String pais,
                 String tipo, String velocidad, Image imagen) {
        this.nombre = nombre;
        this.pais = pais;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.imagen = imagen;
    }

    public String getNombre() { return nombre; }
    public String getPais() { return pais; }
    public String getTipo() { return tipo; }
    public String getVelocidad() { return velocidad; }
    public Image getImagen() { return imagen; }
}
