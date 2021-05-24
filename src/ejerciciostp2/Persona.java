package ejerciciostp2;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private int edad;
    private int peso;
    private int altura;
    private String nombre;
    private String apellido;
    private LocalDate fechanacimiento;
    private int DNI;
    private String sexo;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Persona(int DNI){
        this.DNI=DNI;
        this.altura=1;
        this.peso=1;
        this.sexo="femenino";
        this.nombre="N";
        this.apellido="N";
        this.fechanacimiento=LocalDate.of(2000,1,1);
    }
    public Persona(int DNI,String nombre,String apellido){
        this.DNI=DNI;
        this.altura=1;
        this.peso=1;
        this.sexo="femenino";
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechanacimiento=LocalDate.of(2000,1,1);
    }
    public Persona(int DNI,String nombre,String apellido, LocalDate fechanacimiento, String sexo, int peso, int altura){
        this.DNI=DNI;
        this.altura=altura;
        this.peso=peso;
        this.sexo=sexo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechanacimiento=fechanacimiento;
        this.edad=Period.between(fechanacimiento,LocalDate.now()).getYears();
    }

    public int getPeso()
    {
        return peso;
    }
    public int getAltura()
    {
        return altura;
    }
    public int masacorporal()
    {
        double peso=getPeso();
        double altura=getAltura();
        return (int) (peso/Math.pow(altura,2));
    }
    public boolean enforma()
    {
        int masa= getPeso()/getAltura();
        if ((masa>18.5) && (masa<=25))
            return  true;
        else
            return false;
    }
    public boolean mayor()
    {
        return getEdad()>18;
    }
    public boolean votante()
    {
        return getEdad()>16;
    }
    public boolean coherencia()
    {
        LocalDate añoactual= LocalDate.now();
        Period supuestaedad= Period.between(fechanacimiento,añoactual);
        return (getEdad()>= supuestaedad.getYears());

    }
    public String toString()
    {
        return ("El nombre es: "+ getNombre()+" El apellido es: "+
                getApellido()+(" La edad es: "+
                getEdad()+" El sexo es: "+
                getSexo()+
                " Su altura es: "
                + getAltura()+
                " Su peso es: "+
                getPeso()+
                " Puede votar: "+ votante()+
                " Fecha de nacimiento: "+ getFechanacimiento()));
    }
    public static void main (String args[])
    {
        String A="aac";
        String B="aab";
        System.out.println(A.compareTo(B));
    }
}
