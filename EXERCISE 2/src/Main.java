public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.PonerPuertas();
        System.out.println(miCoche.Puertas);
    }
}
class Coche{
    public int Puertas = 0;

    public void PonerPuertas(){
        this.Puertas++;
    }

}