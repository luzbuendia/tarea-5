package clase2;

public class Main
{  
 public static void main(String[] args)
  {
            
     Promedio promedio = new Promedio(15.00, 12.00, 14.00, 14.00, 11.00,12.00);     
           
     System.out.println("Nota de la tarea 1: "+promedio.getTarea1());
     System.out.println("Nota de la tarea 2: "+promedio.getTarea2());
     System.out.println("nota de la tarea 3: "+promedio.getTarea3());
     System.out.println("nota de la tarea 4: "+promedio.getTarea4());
     System.out.println("nota del examen de medio: "+promedio.getMedioCurso());
     System.out.println("nota del examnen final: "+promedio.getExaFinal());
     promedio.calcularPromedio();        
  }
    

    
}
