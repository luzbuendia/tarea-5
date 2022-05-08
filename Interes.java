package clase;

public class Interes
{
    public double capitalC;
    public double interesI;
    public double periodoN;
    public double m;
    
    public Interes(double capital, double interes, double perio )
    { 
        establecerCapitalC(capital);
        establecerInteresI(interes);
        establecerPeriodoN(perio);
    }
    public double obtenerCapitalC()
    {
      return capitalC;
    
    }
    public void establecerCapitalC(double capital)
   {
        capitalC=capital;
   }
    public double obtenerInteresI()
    {
        return interesI / 100;
    }
    public void establecerInteresI(double interes)
    {
       interesI=interes;
    
    }
    public double obtenerPeriodoN()
    {
            return periodoN;  
    }
     public void establecerPeriodoN(double perio)
    {
            periodoN=perio;
    
    }
    public void calcularAcumulado()
    {
        m= obtenerCapitalC() *(Math.pow(1 + obtenerInteresI(),obtenerPeriodoN()));
        System.out.println("el monto acumulado sera "+m);

             
            
    }
           
         
    
}
