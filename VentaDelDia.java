import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
/**
 * Representa las ventas de boletos de un museo en un día específico.
 * Almacena la fecha de la venta, la lista de boletos vendidos
 * y permite calcular el total recaudado en ese día.
 * @author (Michelle Reyes Flores) 
 * @version (1.0)
 */
public class VentaDelDia {
    private String fechaDeLaVenta;
    private List<BoletoMuseo> boletosVendidos;
    
    /**
     * Inicializa la fecha de la venta con la fecha actual
     * y crea la lista vacía de boletos vendidos
     */
    public VentaDelDia() {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }
    
    /**
     * Registra la venta de un boleto en la lista de boletos vendidos
     * @parametro boleto el boleto que se agrega a la venta
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }
    
    /**
     * Calcula el monto total de la venta del día,
     * sumando el precio de todos los boletos vendidos
     */
    public double calcularTotalVentaDelDia() {
        double total = 0.0;
        for(BoletoMuseo b : boletosVendidos) {
            total += b.getPrecio();
        }
        return total;
    } 
    
    /**
     * Establece la fecha de la venta usando la fecha actual del sistema.
     * 
     * @return una cadena con la fecha en formato "yyyy-MM-dd"
     */
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    
    /**
     * Retorna una representación en cadena de la venta del día,
     * incluyendo la fecha, la cantidad de boletos vendidos,
     * el detalle de cada boleto y el total recaudado.
     * 
     * @return una cadena con la información de la venta
     */
    public String toString() {
        String msg = "VentaDelDia\n";
        msg += " Fecha: " + fechaDeLaVenta + "\n";
        msg += " Cantidad de boletos: " + boletosVendidos.size() + "\n";
        msg += " Detalle:\n";
        for (BoletoMuseo b : boletosVendidos) {
            msg += " - Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
        }
        msg += " Total: " + calcularTotalVentaDelDia();
        return msg;
    }
}