package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    private String nombre;
    private String raza;
    private String observaciones;
    private String color;
    private String atencionEspecial;
    private String alergico;
    @OneToOne
    private Duenio unDuenio;

    public Mascota(int num_cliente, String nombre, String raza, String observaciones, String color, String atencionEspecial, String alergico, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.observaciones = observaciones;
        this.color = color;
        this.atencionEspecial = atencionEspecial;
        this.alergico = alergico;
        this.unDuenio = unDuenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }

   

    public Mascota() {
    }

    @Override
    public String toString() {
        return "Mascota{" + "num_cliente=" + num_cliente + ", nombre=" + nombre + ", raza=" + raza + ", observaciones=" + observaciones + ", color=" + color + ", atencionEspecial=" + atencionEspecial + ", alergico=" + alergico + ", unDuenio=" + unDuenio + '}';
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }
    
    
}
