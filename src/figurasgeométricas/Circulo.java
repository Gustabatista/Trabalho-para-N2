package figurasgeométricas;

public final  class Circulo extends FiguraGeométrica {
  private double raio;
  private double  pi=3.14;
  
    @Override
    public double CalculoArea() {
        super.setArea(2*raio*pi);
        return super.getArea();
       
    }
  @Override
    public double CalculoPerimetro() {
        super.setPerimetro((2*pi)*raio);
        return super.getPerimetro();
  
}

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    
       
}
