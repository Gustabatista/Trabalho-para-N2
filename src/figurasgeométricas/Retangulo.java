package figurasgeométricas;


public  class Retangulo extends FiguraGeométrica {
    private double  Altura;
    private double Largura;

    @Override
    public double CalculoArea() {
        super.setArea(Altura*Largura);
        return super.getArea();
    }

    @Override
    public double CalculoPerimetro() {
        super.setPerimetro(Altura+Altura+Largura+Largura);
        return super.getPerimetro();
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getLargura() {
        return Largura;
    }

    public void setLargura(double Largura) {
        this.Largura = Largura;
    }
    
    
    
    
    
}
