public class Bisseccao extends Dados {

    public static void calculaBisseccao() {
        long inicio = System.nanoTime(), fim;
        System.out.println("\n BISSECÇÃO \n");
        double x, m;
        if ((intervaloSuperior - intervaloInferior) < tolerancia) {
            System.out.println("A raiz da função é qualquer valor contido no intervalo: [" + intervaloInferior + "," + intervaloSuperior + "].");
            fim = System.nanoTime();
            System.out.println("Tempo: " + (fim - inicio) + " ns");
            return;
        }
        interacoes = 1;
        while ((intervaloSuperior - intervaloInferior) > tolerancia) {
            m = calculaFuncao(intervaloInferior);
            x = (intervaloInferior + intervaloSuperior) / 2;
            if (m * calculaFuncao(x) > 0) {
                intervaloInferior = x;
            } else {
                intervaloSuperior = x;
            }
            double aux = intervaloSuperior - intervaloInferior;
            if (aux < tolerancia) {
                fim = System.nanoTime();
                System.out.println("A raiz aproximada da função é: " + intervaloInferior + " e foi encontrada com " + interacoes + " interações");
                System.out.println("Tempo: " + (fim - inicio) + " ns");
            }
            interacoes++;
            if (interacoes == 500) {
                System.out.println("Não foi possível chegar a uma resposta aproximada com menos de 500 interações");
                fim = System.nanoTime();
                System.out.println("Tempo: " + (fim - inicio) + " ns");
                break;
            }
        }
    }
}
