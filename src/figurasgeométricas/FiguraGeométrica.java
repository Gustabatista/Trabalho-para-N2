package figurasgeométricas;

public abstract class FiguraGeométrica {
    
    private double Perimetro;
    private double Area;
    
   public abstract double CalculoPerimetro();        
   public abstract double CalculoArea();
   
   public double getPerimetro(){
       return Perimetro;
   }
    public void setPerimetro(double Perimetro) {
        this.Perimetro = Perimetro;
    }
    public double getArea(){
        return Area;
    }   

    public void setArea(double Area) {
        this.Area = Area;
    }
    
        
    }
    

