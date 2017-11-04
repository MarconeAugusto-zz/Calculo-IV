public class PosicaoFalsa extends Dados {

    public static void calculaPosicaoFalsa() {
        long inicio = System.nanoTime(), fim;
        System.out.println("\n POSIÇÃO FALSA \n");
        double x, m;
        if ((intervaloSuperior - intervaloInferior) < tolerancia) {
            System.out.println("A raiz da função é qualquer valor contido no intervalo: [" + intervaloInferior + "," + intervaloSuperior + "].");
            fim = System.nanoTime();
            System.out.println("Tempo: " + (fim - inicio) + " ns");
            return;
        }
        if (Math.abs(calculaFuncao(intervaloInferior)) < tolerancia || Math.abs(calculaFuncao(intervaloSuperior)) < tolerancia) {
            System.out.println("A raiz da função pode ser o intervalo inferior ou o intervalo superior");
            fim = System.nanoTime();
            System.out.println("Tempo: " + (fim - inicio) + " ns");
            return;
        }
        interacoes = 1;
        x = (intervaloInferior * calculaFuncao(intervaloSuperior) - intervaloSuperior * calculaFuncao(intervaloInferior)) / (calculaFuncao(intervaloSuperior) - calculaFuncao(intervaloInferior));
        while (Math.abs(calculaFuncao(x)) > tolerancia || intervaloSuperior - intervaloInferior > tolerancia) {
            m = calculaFuncao(intervaloInferior);
            x = (intervaloInferior * calculaFuncao(intervaloSuperior) - intervaloSuperior * calculaFuncao(intervaloInferior)) / (calculaFuncao(intervaloSuperior) - calculaFuncao(intervaloInferior));
            if (Math.abs(calculaFuncao(x)) < tolerancia) {
                fim = System.nanoTime();
                System.out.println("A raiz aproximada da função é: " + x + " e foi encontrada com: " + interacoes + " interações");
                System.out.println("Tempo: " + (fim - inicio) + " ns");
                break;
            }
            if (m * calculaFuncao(x) > 0) {
                intervaloInferior = x;
            } else {
                intervaloSuperior = x;
            }
            if (intervaloSuperior - intervaloInferior < tolerancia) {
                fim = System.nanoTime();
                System.out.println("Qualquer resultado");
                System.out.println("Tempo: " + (fim - inicio) + " ns");
                break;
            }
            interacoes++;
            if (interacoes == 500) {
                System.out.println("A raiz aproximada da função é: " + x + " e foi encontrada com: " + interacoes + " interações");
                fim = System.nanoTime();
                System.out.println("Tempo: " + (fim - inicio) + " ns");
                break;
            }
        }
    }
}
