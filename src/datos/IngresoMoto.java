
package datos;

import java.util.Date;
import java.util.Timer;

/**
 *
 * @author NATALYVARGAS
 */
public class IngresoMoto {
    private String placa;
    private Date fecha;
    private Timer hora;
    private String identificacion;

 

    public IngresoMoto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public String obtenerPlaca() {
        return placa;
    }

    public void modificarPlaca(String placa) {
        this.placa = placa;
    }

    public Date obtenerFecha() {
        return fecha;
    }

    public void modificarFecha(Date fecha) {
       this.fecha = fecha;
    }

    public Timer obtenerHora() {
        return hora;
    }

    public void modificarHora(Timer hora) {
        this.hora = hora;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void modificarIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
   public static int restarCupo(){
      int c= 30-1;
       return c;
   }
}
