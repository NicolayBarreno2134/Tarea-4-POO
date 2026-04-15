package Modulos;

public class Paciente {
    public String nombre;
    public String id;
    public String seguro;
    private int edad;
    private double costoConsultas;
    private int numeroConsultas;
    private int prioridad;
    public Paciente(String nombre,String id,String seguro,int edad,double costoConsultas,int numeroConsultas,int prioridad) {
        this.nombre = nombre;
        this.id = id;
        this.seguro = seguro;
        setEdad(edad);
        setCostoConsultas(costoConsultas);
        setNumeroConsultas(numeroConsultas);
        setPrioridad(prioridad);
    }
    public void setEdad(int edad) {
        if (edad >0) {
            this.edad=edad;
        }
    }
    public void setCostoConsultas(double costoConsultas) {
        if (costoConsultas>0) {
            this.costoConsultas=costoConsultas;
        }
    }
    public void setNumeroConsultas(int numeroConsultas) {
        if (numeroConsultas>=0) {
            this.numeroConsultas=numeroConsultas;
        }
    }
    public void setPrioridad(int prioridad) {
        if (prioridad>=1&&prioridad<=5) {
            this.prioridad=prioridad;
        }
    }
    public double calcularCosto(){
        double totalConsulta=costoConsultas*numeroConsultas;
        if (seguro=="Basico"){
            double descuentoBasico=0.10;
            double descuento=totalConsulta*descuentoBasico;
            double totalPaciente=totalConsulta-descuento;
            return totalPaciente;
        }
        else if (seguro=="Premium"){
            double descuentoPremium=0.20;
            double descuento=totalConsulta*descuentoPremium;
            double totalPaciente=totalConsulta-descuento;
            return totalPaciente;
        }
        else{
            double totalPaciente=totalConsulta;
            return totalPaciente;
        }
    }
    public String clasificarPrioridad() {
        if (prioridad >= 4) return "Alta prioridad";
        else if (prioridad >= 2) return "Prioridad media";
        else return "Prioridad baja";
    }

    public String mensajeMedico(){
        switch (clasificarPrioridad()){
            case "Alta prioridad": return "Atencion inmediata requerida";
            case "Prioridad media": return "Seguimiento necesario";
            default: return "Control regular";
        }
    }
    public void mostrarReporteMedico(){
        System.out.println("Paciente: "+nombre);
        System.out.println("Id: "+id);
        System.out.println("Seguro: "+seguro);
        System.out.println("Edad: "+edad);
        System.out.println("Costo Total: "+calcularCosto());
        System.out.println("Clasificacion: "+clasificarPrioridad());
        System.out.println("Mensaje médico: "+ mensajeMedico());
    }
}
