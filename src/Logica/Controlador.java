package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controlador {
    
    ControladoraPersistencia controlPersistencia= new ControladoraPersistencia();

    public void guardar(String nombre, String raza, String color, String observaciones, String nombreDuenio, String cel, String alergico, String atencion) {
        
        Duenio unDuenio = new Duenio();
        
        unDuenio.setCelDuenio(cel);
        unDuenio.setNombre(nombreDuenio);
        
        Mascota unaMascota = new Mascota();
        
        unaMascota.setNombre(nombre);
        unaMascota.setRaza(raza);
        unaMascota.setColor(color);
        unaMascota.setObservaciones(observaciones);
        unaMascota.setAlergico(alergico);
        unaMascota.setAtencionEspecial(atencion);
        unaMascota.setUnDuenio(unDuenio);
        
        controlPersistencia.guardar(unDuenio,unaMascota);
        
    }
    public List<Mascota> traerDatos(){
            
          return controlPersistencia.traerDatos();
    }

    public void borrarMascota(int num_cliente) {
        
        controlPersistencia.borrarRegistro(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersistencia.traerMascota(num_cliente);
    }

    public void editarRegistro(Mascota mascotaEditar, String nombre, String raza, String color, String observaciones, String nombreDuenio, String cel, String alergico, String atencion) {
        mascotaEditar.setNombre(nombre);
        mascotaEditar.setRaza(raza);
        mascotaEditar.setColor(color);
        mascotaEditar.setObservaciones(observaciones);
        mascotaEditar.getUnDuenio().setCelDuenio(cel);
        mascotaEditar.getUnDuenio().setNombre(nombreDuenio);
        mascotaEditar.setAlergico(alergico);
        mascotaEditar.setAtencionEspecial(atencion);
        try {
            controlPersistencia.editarRegistro(mascotaEditar);
        } catch (Exception ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   /* public Duenio traerDuenio(int idDuenio){
    
    return controlPersistencia.traerDuenio(idDuenio);
    
    }*/
    
    
    
    }
