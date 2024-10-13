public class Cerchio extends FormaGeometriche{

private int raggio;

    public Cerchio(int raggio) {
        this.raggio = raggio;
    }

    @Override
    public void calcolaArea(){
        double result = (raggio*raggio)*PI_GRECO;
        System.out.println("area del cerchio"+result);
    }



}
