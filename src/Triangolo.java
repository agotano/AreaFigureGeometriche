public class Triangolo extends FormaGeometriche {
    private double base;
    private double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override

    public void calcolaArea(){
        double result = (base*altezza)/2;
        System.out.println("area del triamgolo"+result);
    }
}
