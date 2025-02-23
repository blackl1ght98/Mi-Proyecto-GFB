
package libreria;

public class Main {
  
    public static void main(String[] args) {
        FuentesBuenosvinosGuillermo2425T4 FuentesBuenosvinosGuillermo2425T4;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        FuentesBuenosvinosGuillermo2425T4 = new FuentesBuenosvinosGuillermo2425T4("Don Quijote de la Mancha", 10, 45, 120);

        try 
        {
            compraQuijoteXXX(FuentesBuenosvinosGuillermo2425T4);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
        
        saldoActual = FuentesBuenosvinosGuillermo2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = FuentesBuenosvinosGuillermo2425T4.obtenerNombre();
        stock = FuentesBuenosvinosGuillermo2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
        
        try
        {
            añadeIngresoXXX(FuentesBuenosvinosGuillermo2425T4, "Libro vendido");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
   /**
    Metodo que agrega un ingreso, este metodo cuenta con 2 parametros
    * @param FuentesBuenosvinosGuillermo2425T4 que es el nombre de la clase permite acceder a sus metodos
    * @param concepto con valor por defecto "Libro leido"
    */
    private static void añadeIngresoXXX(FuentesBuenosvinosGuillermo2425T4 FuentesBuenosvinosGuillermo2425T4, String concepto) throws Exception {
        double ingreso;
        double saldoActual;
        ingreso = 30.5;
        FuentesBuenosvinosGuillermo2425T4.aumentarSaldo(ingreso);
        saldoActual = FuentesBuenosvinosGuillermo2425T4.obtenerSaldo();
        System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
    }
/**
    Metodo que se utiliza para comprar un libro
    * @param FuentesBuenosvinosGuillermo2425T4 que es el nombre de la clase permite acceder a sus metodos
    
    */
    private static void compraQuijoteXXX(FuentesBuenosvinosGuillermo2425T4 FuentesBuenosvinosGuillermo2425T4) throws Exception {
        String x;
        int num;
        double dinero;
        double saldoActual;
        x = "Don Quijote de la Mancha";
        num = 2;    //Número de ejemplares a comprar
        dinero = FuentesBuenosvinosGuillermo2425T4.obtenerPrecio();
        saldoActual = FuentesBuenosvinosGuillermo2425T4.obtenerSaldo();
        System.out.println("El libro "+x+" vale "+dinero+"€");
        System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
        FuentesBuenosvinosGuillermo2425T4.comprarLibro(num);
    }

   
}
