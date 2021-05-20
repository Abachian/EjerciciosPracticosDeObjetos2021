package ejerciciostp5.PuertoDeCereales.ClasesPrincipales;

public class Transporte {
   private int capacidad;
   private String nombre;

   public int getCapacidad() {
      return capacidad;
   }

   public void setCapacidad(int capacidad) {
      this.capacidad = capacidad;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Transporte(int capacidad, String nombre) {
      this.capacidad = capacidad;
      this.nombre = nombre;
   }

   @Override
   public String toString() {
      return "Transporte{" +
              "capacidad=" + capacidad +
              ", nombre='" + nombre + '\'' +
              '}';
   }
}
