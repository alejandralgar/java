package tiendaparking.controller;

import tiendaparking.api_modelo;
import tiendaparking.modelo.Carro_modelo;
import tiendaparking.modelo.Motor_modelo;
import tiendaparking.modelo.Chofer_modelo;
import tiendaparking.modelo.PasajeroModelo;
import tiendaparking.modelo.RegistroViaje;
import tiendaparking.vista.VistaRegistro;
import tiendaparking.vista.VistaReporteHTML;

/**
 * Controlador de la HU-01: Registro de Ficha de Viaje.
 * Conecta la Vista (Scanner + reporte HTML) con los Modelos,
 * arma la estructura de datos externa (RegistroViaje) y valida
 * antes de "guardar" en la base de datos.
 */
public class ControladorRegistro {

    private VistaRegistro vista;
    private VistaReporteHTML vistaHtml;
    private api_modelo conexion;

    private Carro_modelo carro;
    private Motor_modelo motor;
    private Chofer_modelo chofer;
    private PasajeroModelo pasajero;
    private RegistroViaje registro;

    public ControladorRegistro() {
        this.vista = new VistaRegistro();
        this.vistaHtml = new VistaReporteHTML();
        this.conexion = new api_modelo("root", "123456789", "localhost", "3306", "tiendaparking");
    }

    public void iniciarRegistro() {
        vista.mostrarBienvenida();

        // 1. Datos del carro (criterio 1)
        String[] datosCarro = vista.capturarCarro();
        carro = new Carro_modelo(datosCarro[0], datosCarro[1], datosCarro[2], 0.0);

        // 2. Datos del motor (criterio 2)
        String[] datosMotor = vista.capturarMotor();
        motor = new Motor_modelo(datosMotor[0], datosMotor[1]);

        // 3. Datos del chofer (criterio 3)
        String[] datosChofer = vista.capturarChofer();
        chofer = new Chofer_modelo(datosChofer[1], datosChofer[2], datosChofer[0], datosChofer[3]);

        // 4. Datos del pasajero (criterio 4)
        String[] datosPasajero = vista.capturarPasajero();
        pasajero = new PasajeroModelo(datosPasajero[1], datosPasajero[0]);

        // 5. Estructura de datos externa temporal (criterio 5)
        registro = new RegistroViaje(
            chofer.getNombre_chofer() + " " + chofer.getApellido_chofer() + " - CC:" + chofer.getCedula_chofer(),
            pasajero.getNombreCompleto() + " - CC:" + pasajero.getCedula(),
            carro.getPlaca_carro() + " " + carro.getMarca_carro() + " " + carro.getColor_carro(),
            motor.getNumero_serie() + " (" + motor.getTipo() + ")"
        );

        // 6. Validar que los 4 conjuntos de datos esten completos (criterio 6)
        if (!registro.validarDatos()) {
            vista.mostrarMensaje("\n[ERROR] Faltan datos obligatorios. No se guarda el registro.");
            return;
        }

        // Validar conexion antes de intentar guardar
        if (!conexion.validar_conexion()) {
            vista.mostrarMensaje("\n[ERROR] No fue posible conectar a la base de datos.");
            return;
        }

        guardarRegistro();
        vista.mostrarMensaje("\n[OK] Ficha de viaje registrada correctamente.");

        boolean generado = vistaHtml.generarReporte(carro, motor, chofer, pasajero, "ficha_viaje.html");
        if (generado) {
            vista.mostrarMensaje("Reporte HTML generado: ficha_viaje.html");
        }

        conexion.desconexion();
        vista.cerrar();
    }

    private void guardarRegistro() {
        // Aqui se conectaria con el INSERT real usando 'conexion'
        System.out.println("\nGuardando ficha de viaje en la base de datos...");
        System.out.println("Chofer   : " + registro.getChofer());
        System.out.println("Pasajero : " + registro.getPasajero());
        System.out.println("Carro    : " + registro.getCarro());
        System.out.println("Motor    : " + registro.getMotor());
    }
}
