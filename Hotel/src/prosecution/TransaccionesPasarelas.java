package prosecution;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class TransaccionesPasarelas {
	
    public void Transaccion(String pasarela, int monto, int Numero_tarjeta) {
        String nombreArchivo = obtenerNombreArchivo(pasarela);
        String horaTransaccion = LocalDateTime.now().toString();
        String resultado = "aprovada";

        try (PrintWriter escritor = new PrintWriter(new FileWriter(nombreArchivo, true))) {
            escritor.println("Hora: " + horaTransaccion +"/"+Numero_tarjeta+"/"+"Monto: " + monto+"/"+"Estado: " + resultado);
            escritor.println();
            System.out.println("Transacción registrada con éxito en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }

    private String obtenerNombreArchivo(String pasarela) {
        String nombreArchivo;

        switch (pasarela.toLowerCase()) {
            case "payu":
                nombreArchivo = "src/Memory/transacciones_payu.txt";
                break;
            case "paypal":
                nombreArchivo = "src/Memory/transacciones_paypal.txt";
                break;
            case "sire":
                nombreArchivo = "src/Memory/transacciones_sire.txt";
                break;
            default:
                nombreArchivo = "src/Memory/transacciones_desconocida.txt";
                break;
        }

        return nombreArchivo;
    }
}
