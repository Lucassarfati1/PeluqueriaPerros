package Persistencia;

import Logica.Duenio;
import Logica.Mascota;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
        
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio unDuenio, Mascota unaMascota) {
        
        duenioJpa.create(unDuenio);
        
        mascotaJpa.create(unaMascota);
    }
    public List<Mascota> traerDatos(){
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarRegistro(int num_cliente) {
        try { //Se le aplica un try catch por si hay un error al eliminar en la base de datos
            mascotaJpa.destroy(num_cliente);
            
        } catch (NonexistentEntityException ex) { //Retornamos un mensaje de error
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
        return mascotaJpa.findMascota(num_cliente);
    }

    public Duenio traerDuenio(int idDuenio) {
        
       return duenioJpa.findDuenio(idDuenio);
    }

    public void editarRegistro(Mascota mascotaEditar) throws Exception {
      mascotaJpa.edit(mascotaEditar);
      duenioJpa.edit(mascotaEditar.getUnDuenio());
    }
}
