//aaron estrada martinez 
package deposito;


// aaron estrada
public class main {
    public static void main(String[] args) {
    Deposito deposito1 = new Deposito(8, 12, "001");
    System.out.println("Altura del deposito: " + deposito1.getAltura()); // Output: Altura del deposito: 12.0
    System.out.println("Diametro del deposito: " + deposito1.getDiametro()); // Output: Diametro del deposito: 8.0
    System.out.println("ID del deposito: " + deposito1.getIdDeposito()); // Output: ID del deposito: 001
       
    // Establecer nuevos valores
    deposito1.setValoresDeposito("002", 10, 15);
    System.out.println("Altura del deposito: " + deposito1.getAltura()); // Output: Altura del deposito: 15.0
    System.out.println("Diametro del deposito: " + deposito1.getDiametro()); // Output: Diametro del deposito: 10.0
    System.out.println("ID del deposito: " + deposito1.getIdDeposito()); // Output: ID del deposito: 002
    // Calcular la capacidad
    float capacidad = deposito1.valorCapacidad();
    System.out.println("Capacidad del deposito: " + capacidad); // Output: Capacidad del deposito: 1178.0978
    }
}
            