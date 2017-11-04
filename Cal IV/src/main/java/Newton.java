public class Newton extends Dados {

    public static void calculaNewton() {
        long inicio = System.nanoTime(), fim = 0;
        System.out.println("\n NEWTON \n");
        double aproxInicial = Math.abs((intervaloSuperior + intervaloInferior) / 2), x;
        if (Math.abs(calculaFuncao(aproxInicial)) < tolerancia) {
            x = aproxInicial;
            fim = System.nanoTime();
            System.out.println("A raiz aproximada da função é: " + x);
            System.out.println("Tempo: " + (fim - inicio) + " ns");
            return;
        }
        interacoes = 1;
        x = aproxInicial - (calculaFuncao(aproxInicial) / calculaDerivadaFuncao(aproxInicial));
        while (Math.abs(calculaFuncao(x)) > tolerancia) {
            x = aproxInicial - (calculaFuncao(aproxInicial) / calculaDerivadaFuncao(aproxInicial));
            if (Math.abs(calculaFuncao(x)) < tolerancia || Math.abs(x - aproxInicial) < tolerancia) {
                fim = System.nanoTime();
                System.out.println("A raiz aproximada da função é: " + x + " e foi encontrada com: " + interacoes + " interações");
                System.out.println("Tempo: " + (fim - inicio) + " ns");
                break;
            } else {
                aproxInicial = x;
                interacoes++;
                if (interacoes == 500) {
                    fim = System.nanoTime();
                    System.out.println("A raiz aproximada da função é: " + x + " e foi encontrada com: " + interacoes + " interações");
                    System.out.println("Tempo: " + (fim - inicio) + " ns");
                    break;
                }
            }
        }

    }
}
