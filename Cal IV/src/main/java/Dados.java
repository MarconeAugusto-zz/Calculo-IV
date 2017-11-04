public class Dados {

    public static double intervaloInferior = 0.10;
    public static double intervaloSuperior = 0.80;
    public static double tolerancia = 0.0000000001;
    public static int interacoes = 0;


    public static double calculaFuncao(double d) {
        return (Math.pow(d, 5.0)) - ((10.0 / 9.0) * Math.pow(d, 3.0)) + ((5.0 / 21.0) * d);

    }

    public static double calculaDerivadaFuncao(double d) {
        return (5.0 * Math.pow(d, 4.0)) - ((10.0 / 3.0) * Math.pow(d, 2.0)) + (5.0 / 21.0);
    }
}
