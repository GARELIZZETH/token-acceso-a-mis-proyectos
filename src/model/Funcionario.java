package model;

public class Funcionario extends Trabajador {
    
    public Funcionario(){}

    public Funcionario(int idTrabajador, String nombre, String apellido, int antiguedad, int hT) {
        super(idTrabajador, nombre, apellido, antiguedad, hT);
    }
    
    private double sueldo;
    
    public double sueldo() {
        this.sueldo = this.getHorasTrabajadas() *10;
        return this.sueldo;
    
    
    }
    
    
}
