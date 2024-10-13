public class Quadrato extends FormaGeometriche {
    private int lato;
    public Quadrato(int lato){
        this.lato = lato;
    }
    @Override
    public  void calcolaArea(){
        int result = lato*lato;
        System.out.println("area del quadrato"+result);
    }
}
