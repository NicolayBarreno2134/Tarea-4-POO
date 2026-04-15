package Principal;

import Modulos.Paciente;

public class Main2 {
    static void main() {
        Paciente paciente1=new Paciente("Carlos Pérez","0102030405","Premium", 45,25.50,3,4);
        paciente1.mostrarReporteMedico();
    }
}
