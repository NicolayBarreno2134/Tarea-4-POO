package Modulos;

public class Vendedor {
    public String nombreVendedor;
    public String areaTrabajo;
    private double montoVendido;
    private double comision;
    private int cumplimientoMeta;
    public Vendedor(String nombreVendedor, String areaTrabajo, double montoVendido, double comision, int cumplimientoMeta) {
        this.nombreVendedor = nombreVendedor;
        this.areaTrabajo = areaTrabajo;
        setMontoVendido(montoVendido);
        setComision(comision);
        setCumplimientoMeta(cumplimientoMeta);

    }
    public double getMontoVendido(){
        return montoVendido;
    }
    public void setMontoVendido(double montoVendido){
        if (montoVendido>0){
            this.montoVendido = montoVendido;
        }
    }
    public double getComision()
    {
        return comision;
    }
    public void setComision(double comision)
    {
        if (comision>=0){
            this.comision=comision;
        }
    }
    public int getCumplimientoMeta(){
        return cumplimientoMeta;

    }
    public void setCumplimientoMeta(int cumplimientoMeta){
        if (cumplimientoMeta>=0 && cumplimientoMeta<=100){
            this.cumplimientoMeta=cumplimientoMeta;
        }
    }
    public double calcularComision(){
        return montoVendido*(comision/100);
    }
    public double calcularIngresoTotal(){
        return montoVendido+comision;
    }
    public String evaluarCumplimiento(){
        if (cumplimientoMeta>=90){
            return "Exelente";
        }
        else if (cumplimientoMeta>=70){
            return "Aceptable";
        }
        else{
            return "Bajo";
        }
    }
    public String mensajeFinal(){
        switch(evaluarCumplimiento()){
            case "Exelente":return "Vendedor con desempeño sobresaliente";
            case "Aceptable":return "Vendedor con desemeño aceptable";
            default:return "Se requiere seguimiento comercial";

        }
    }
    public void mostrarResultados(){
        System.out.println("Vendedor: "+nombreVendedor);
        System.out.println("Area de trabajo: "+areaTrabajo);
        System.out.println("Monto de vendido: "+montoVendido);
        System.out.println("Comision: "+comision);
        System.out.println("Ingreso Total: "+calcularIngresoTotal());
        System.out.println("Cumplimiento: "+cumplimientoMeta);
        System.out.println("Mensaje final: "+mensajeFinal());
    }
}
