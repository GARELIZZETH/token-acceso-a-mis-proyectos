
package model;

public class Conserje extends Trabajador {
    
    public Conserje(){}

    public Conserje(int idTrabajador, String nombre, String apellido, int antiguedad, int hT) {
        super(idTrabajador, nombre, apellido, antiguedad, hT);
    }
    
    private double sueldo;
    
    public double sueldo(){
        this.sueldo = this.getHorasTrabajadas() * 10;
        return this.sueldo;
    }
}
