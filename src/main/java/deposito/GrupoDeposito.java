//aaron estrada
package deposito;
public class GrupoDeposito{
private Deposito deposito1; 
 private Deposito deposito2; 
 private Deposito deposito3; 
 private String idGrupo; 
 private int numeroDepositosGrupo;

 public GrupoDeposito (int numeroDeDepositosGrupo, String valor_idGrupo) { 
 idGrupo = valor_idGrupo; 
 switch (numeroDeDepositosGrupo) { 
 case 1: System.out.println ("Un grupo ha de tener más de un depósito"); break; 
 
 case 2: 
 deposito1 = new Deposito(); /*Al crear el objeto automáticamente se llama al constructor del mismo, en este 
caso sin parámetros. ESTO ES EJEMPLO DE SINTAXIS DE CREACIÓN DE UN OBJETO, EN ESTE CASO DENTRO DE OTRO */ 
 deposito2 = new Deposito(); 
 numeroDepositosGrupo = 2; 
 break; 
 case 3: deposito1 = new Deposito(); deposito2 = new Deposito(); deposito3 = new Deposito(); 
 numeroDepositosGrupo = 3; 
 break; 
 default: System.out.println ("No se admiten más de tres depósitos"); 
 //Esto no evita que se cree el objeto.
 break; 
 } //Cierre del switch
 } //Cierre del constructor
 public int getNumeroDepositosGrupo () { return numeroDepositosGrupo; } 
 public String getIdGrupo () { return idGrupo; } 
 public float capacidadDelGrupo () { //Este método usa objetos de otra clase e invoca métodos de otra clase
 if (numeroDepositosGrupo == 2) { return (deposito1.valorCapacidad() + deposito2.valorCapacidad() ); 
 } else { return (deposito1.valorCapacidad() + deposito2.valorCapacidad()+ deposito3.valorCapacidad() ); } 
 //Si el grupo se ha creado con un número de depósitos distinto de 2 o 3 saltará un error en tiempo de ejecución
 }
} //Cierre del método
