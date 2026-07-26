package tiendaparking.vista;

import java.io.FileWriter;
import java.io.IOException;

import tiendaparking.modelo.Carro_modelo;
import tiendaparking.modelo.Motor_modelo;
import tiendaparking.modelo.Chofer_modelo;
import tiendaparking.modelo.PasajeroModelo;

/**
 * Vista encargada de generar un archivo HTML (con CSS embebido)
 * que muestra la ficha de viaje registrada.
 */
public class VistaReporteHTML {

    public boolean generarReporte(Carro_modelo carro, Motor_modelo motor,
                                   Chofer_modelo chofer, PasajeroModelo pasajero,
                                   String nombreArchivo) {

        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n<html lang=\"es\">\n<head>\n");
        html.append("<meta charset=\"UTF-8\">\n<title>Ficha de Viaje</title>\n");
        html.append("<style>\n").append(estilos()).append("\n</style>\n");
        html.append("</head>\n<body>\n<div class=\"ficha\">\n");
        html.append("<h1>Ficha de Viaje</h1>\n");

        html.append("<div class=\"seccion\">\n<h2>Datos del Carro</h2>\n");
        html.append("<p><strong>Placa:</strong> ").append(carro.getPlaca_carro()).append("</p>\n");
        html.append("<p><strong>Marca:</strong> ").append(carro.getMarca_carro()).append("</p>\n");
        html.append("<p><strong>Color/Modelo:</strong> ").append(carro.getColor_carro()).append("</p>\n");
        html.append("</div>\n");

        html.append("<div class=\"seccion\">\n<h2>Datos del Motor</h2>\n");
        html.append("<p><strong>Numero de serie:</strong> ").append(motor.getNumero_serie()).append("</p>\n");
        html.append("<p><strong>Tipo:</strong> ").append(motor.getTipo()).append("</p>\n");
        html.append("</div>\n");

        html.append("<div class=\"seccion\">\n<h2>Datos del Chofer</h2>\n");
        html.append("<p><strong>Cedula:</strong> ").append(chofer.getCedula_chofer()).append("</p>\n");
        html.append("<p><strong>Nombre:</strong> ")
            .append(chofer.getNombre_chofer()).append(" ").append(chofer.getApellido_chofer())
            .append("</p>\n");
        html.append("<p><strong>Licencia:</strong> ").append(chofer.getLicencia()).append("</p>\n");
        html.append("</div>\n");

        html.append("<div class=\"seccion\">\n<h2>Datos del Pasajero</h2>\n");
        html.append("<p><strong>Cedula:</strong> ").append(pasajero.getCedula()).append("</p>\n");
        html.append("<p><strong>Nombre completo:</strong> ").append(pasajero.getNombreCompleto()).append("</p>\n");
        html.append("</div>\n");

        html.append("</div>\n</body>\n</html>");

        try (FileWriter fw = new FileWriter(nombreArchivo)) {
            fw.write(html.toString());
            return true;
        } catch (IOException e) {
            System.out.println("Error al generar el reporte HTML: " + e.getMessage());
            return false;
        }
    }

    private String estilos() {
        return "body{font-family:Arial, sans-serif; background:#f4f4f4; margin:0; padding:30px;}\n"
             + ".ficha{max-width:600px; margin:auto; background:#ffffff; border-radius:10px; padding:25px; box-shadow:0 0 10px rgba(0,0,0,0.15);}\n"
             + "h1{color:#2c3e50; text-align:center; border-bottom:2px solid #2c3e50; padding-bottom:10px;}\n"
             + ".seccion{margin-bottom:20px; padding:15px; background:#ecf0f1; border-left:5px solid #2980b9; border-radius:5px;}\n"
             + "h2{margin-top:0; color:#2980b9; font-size:18px;}\n"
             + "p{margin:5px 0; color:#333333;}";
    }
}
