/**
 * Clase principal que contiene el método main para ejecutar
 * el sistema de gestión de boletos de museo.
 * Finalmente, se muestran los detalles de cada persona,
 * el contador global de boletos emitidos y el resumen de la
 * venta del día.
 * 
 * @author (Michelle Reyes Flores) 
 * @version 1.0
 */
public class PrincipalMuseo {
    
    /**
     * Método principal de la aplicación.
     * Permite ejecutar una simulación donde se crean personas,
     * boletos de museo y se registran ventas del día.
     * 
     * @parametro args argumentos de la línea de comandos (no se usan en este programa)
     */
    public static void main(String[] args) {
        Persona a, b, c;
        a = new Persona("Nicolás Maduro", "666-6");
        b = new Persona("Donald Trump", "333-3");
        c = new Persona("Claudia Sheinbaum", "777-7");

        BoletoMuseo b1, b2, b3;
        b1 = new BoletoMuseo(4500.0);
        b2 = new BoletoMuseo(6000.0);
        b3 = new BoletoMuseo(5800.0);

        VentaDelDia vd;
        vd = new VentaDelDia();

        a.asignarBoleto(b1);
        System.out.println("Detalle del primer objeto Persona: " + a.toString());
        vd.registrarVentaBoleto(b1);

        b.asignarBoleto(b2);
        System.out.println("Detalle del segundo objeto Persona: " + b.toString());
        vd.registrarVentaBoleto(b2);

        c.asignarBoleto(b3);
        System.out.println("Detalle del tercer objeto Persona: " + c.toString());
        vd.registrarVentaBoleto(b3);

        System.out.println("Contador global de boletos creados: " + BoletoMuseo.getContador());
        System.out.println("Detalle de la Venta Del Día: " + vd.toString());
    }
}
