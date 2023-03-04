
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoFernandezRuizEstefania2223 miVehiculoFernandezRuizEstefania2223;
        int stockActual;
        
        miVehiculoFernandezRuizEstefania2223 = new VehiculoFernandezRuizEstefania2223("Seat",18000,100);
        
        operativaVehiculosFernandezRuizEstefania2223(miVehiculoFernandezRuizEstefania2223, 50); 
    }

    private static void operativaVehiculosFernandezRuizEstefania2223(VehiculoFernandezRuizEstefania2223 miVehiculoFernandezRuizEstefania2223, java.lang.Integer cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoFernandezRuizEstefania2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoFernandezRuizEstefania2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoFernandezRuizEstefania2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
