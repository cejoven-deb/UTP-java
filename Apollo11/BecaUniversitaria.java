package Apollo11;

public class BecaUniversitaria {

    //
    // Atributos
    //
    // ...
    private int Tiempo;
    private double Monto;
    private double Interes;

    //
    // Constructores
    //
    // ...
    public BecaUniversitaria() {
        Tiempo = 0;
        Monto = 0;
        Interes = 0;
    }

    public BecaUniversitaria(int tiempo, double capital, double interes) {
        Tiempo = tiempo;
        Monto = capital;
        Interes = interes;
    }

    //
    // Métodos
    //
    public double calcularInteresSimple() {
        return Math.round(Monto * (Interes / 100) * Tiempo);
    }

    // ...
    public double calcularInteresCompuesto() {
        return Math.round(Monto * (Math.pow(1 + Interes / 100, Tiempo) - 1));
    }

    // ...
    public String compararInversion(int pTiempo, double pMonto, double pInteres) {
        Tiempo = pTiempo;
        Monto = pMonto;
        Interes = pInteres;

       return (compararInversion());
    }

    // ...
    public String compararInversion() {
        double diferencia = 0;
        diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        if (diferencia != 0)
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        else
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }

    // public static void main(String[] args) {
    //     BecaUniversitaria becaUniversitaria = new BecaUniversitaria();

    //     System.out.println(becaUniversitaria.compararInversion(48, 10000, 2.0));
    //     System.out.println(becaUniversitaria.calcularInteresSimple());
    //     System.out.println(becaUniversitaria.calcularInteresCompuesto());
    // }

}
