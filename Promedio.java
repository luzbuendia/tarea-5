package clase2;

public class Promedio
 {
    
    public double tarea1;
    public double tarea2;
    public double tarea3;
    public double tarea4;
    public double sumatoria;
    public double promSumatoria;
    public double medioCurso;
    public double suma;
    public double exaFinal;
    public double prom;

    Promedio(double nota1, double nota2, double nota3, double nota4, Double emc, double efc)
    {
      setTarea1(nota1);
      setTarea2(nota2);
      setTarea3(nota3);
      setTarea4(nota4);
      setMedioCurso(emc);
      setExaFinal(efc);
    }
    
     void setTarea1(double nota1)
    {
      tarea1=nota1;
    }
    double getTarea1()
    {
       return tarea1;
    }
     void setTarea2(double nota2)
    {
        tarea2=nota2;
    }
     double getTarea2()
    {
         return tarea2;
    }
     void setTarea3(double nota3)
    {
        tarea3=nota3;
    }
     double getTarea3()
    {
         return tarea3;
    }
     void setTarea4(double nota4)
    {
        tarea4=nota4;
    }
     double getTarea4()
    {
        return tarea4;
    }
    double getSumatoriaDeNotas()
    {
       return sumatoria = (getTarea1()+getTarea2()+getTarea3()+getTarea4());
    }

    double getPromSumatoria()
    {
        return promSumatoria= getSumatoriaDeNotas()/4;
    }

    void setMedioCurso(double emc)
    {
        medioCurso = emc; 
    }

     double getMedioCurso()
    {
       return medioCurso;
    }

    void setExaFinal(double efc)
    {
        exaFinal = efc; 
    }

     double getExaFinal()
    {
       return exaFinal;
    }

    double getSuma()
    {
     return suma= getPromSumatoria()+getExaFinal()+getMedioCurso();
     
    }

    void calcularPromedio()
    {
      prom = getSuma()/3;
      System.out.println("su promedio es: "+prom);
    }

}
    

