public class Secante extends Dados {

    public static void calculaSecante() {
        long inicio = System.nanoTime(), fim = 0;
        System.out.println("\n SECANTE \n");
        //System.out.println("Tolerância: " +tolerancia);
        double x;
        if (Math.abs(calculaFuncao(intervaloInferior)) < tolerancia) {
            x = intervaloInferior;
            System.out.println("A raiz do intervalo é o proprio intervalo inferior: " + x);
            fim = System.nanoTime();
            System.out.println("Tempo: " + (fim - inicio) + " ns");
        }
        if (Math.abs(calculaFuncao(intervaloSuperior)) < tolerancia || Math.abs(intervaloSuperior - intervaloInferior) < tolerancia) {
            x = intervaloSuperior;
            System.out.println("A raiz do intervalo é o proprio intervalo superior: " + x);
            fim = System.nanoTime();
            System.out.println("Tempo: " + (fim - inicio) + " ns");
        } else {
            while (tolerancia < 500) {
                interacoes++;
                double aux = calculaFuncao(intervaloSuperior) / (calculaFuncao(intervaloSuperior) - calculaFuncao(intervaloInferior));
                x = intervaloSuperior - (aux * (intervaloSuperior - intervaloInferior));
                if (Math.abs(calculaFuncao(x)) < tolerancia || Math.abs(x - intervaloSuperior) < tolerancia) {
                    System.out.println("A raiz aproximada da função é:" + x + " e foi encontrada com: " + interacoes + " interações");
                    fim = System.nanoTime();
                    System.out.println("Tempo: " + (fim - inicio) + " ns");
                    break;
                } else {
                    intervaloInferior = intervaloSuperior;
                    intervaloSuperior = x;
                    //System.out.println("Intervalo: [" + intervaloInferior + "," + intervaloSuperior + "].");
                }
            }
        }

    }

}
