public class BecaUniversitaria {
    //
    // Atributos
    private int Tiempo;
    private double Monto;
    private double Interes;

    //
    // ...
    //
    // Constructores
    public BecaUniversitaria() {
        Tiempo = 0;
        Monto = 0;
        Interes = 0;
    }

    public BecaUniversitaria(int tiempo, double monto, double interes) {
        Tiempo = tiempo;
        Monto = monto;
        Interes = interes;
    }

    //
    // ...
    //
    // Métodos
    //
    public double calcularInteresSimple() {
        double resultado = Monto * (Interes / 100) * Tiempo;
        return Math.round(resultado);
    }

    // ...
    public double calcularInteresCompuesto() {
        double resultado = Monto * (Math.pow(1 + (Interes / 100), Tiempo) - 1);
        return Math.round(resultado);
    }

    // ...

    // ...
    public String compararInversion() {
        // ...
        double diferencia = 0;
        diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        if (diferencia != 0)
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        else
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";

    }

    public String compararInversion(int pTiempo, double pMonto, double pInteres) {
        this.Tiempo = pTiempo;
        this.Monto = pMonto;
        this.Interes = pInteres;

        return compararInversion();
    }

    // public static void main(String[] args) {
    //     BecaUniversitaria becaUniversitaria = new BecaUniversitaria(48,10000,2);

    //     System.out.println(becaUniversitaria.compararInversion());
    //     System.out.println(becaUniversitaria.calcularInteresSimple());
    //     System.out.println(becaUniversitaria.calcularInteresCompuesto());
    // }
}
// public class Prueba{
// BecaUniversitaria beca= new BecaUniversitaria(5, 7, 7);
// }