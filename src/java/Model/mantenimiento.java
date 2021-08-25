
package Model;

/**
 *
 * @author Melani
 */
public class mantenimiento {
    public String nombreServicio;
    public String fechaServicio;
    public String horaServicio;
    public String kilometrajeVehiculo;


    public mantenimiento(String nombreServicio, String fechaServicio, String horaServicio, String kilometrajeVehiculo) {
        this.nombreServicio = nombreServicio;
        this.fechaServicio = fechaServicio;
        this.horaServicio = horaServicio;
        this.kilometrajeVehiculo = kilometrajeVehiculo;

    }

   public mantenimiento(){
       
   }
}
