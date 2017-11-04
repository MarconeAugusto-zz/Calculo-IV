public class Principal {

    public static void main(String[] args) {

        System.out.println("\n->  Função: x⁵ - (10/9)x³ + (5/21)x");
        System.out.println("->  Intervalo avaliado: [" + Dados.intervaloInferior + "," + Dados.intervaloSuperior + "].");
        System.out.println("->  Tolerância = " + Dados.tolerancia);

        Bisseccao bisseccao = new Bisseccao();
        bisseccao.calculaBisseccao();
        System.out.println("------------------------------------------------------------------------------------");

        Dados.intervaloSuperior = 0.8;
        Dados.intervaloInferior = 0.1;
        Dados.tolerancia = 0.0000000001;
        Dados.interacoes = 0;

        PosicaoFalsa posicaoFalsa = new PosicaoFalsa();
        posicaoFalsa.calculaPosicaoFalsa();
        System.out.println("------------------------------------------------------------------------------------");

        Dados.intervaloSuperior = 0.8;
        Dados.intervaloInferior = 0.1;
        Dados.tolerancia = 0.0000000001;
        Dados.interacoes = 0;


        Secante secante = new Secante();
        secante.calculaSecante();
        System.out.println("------------------------------------------------------------------------------------");


        Dados.intervaloSuperior = 0.8;
        Dados.intervaloInferior = 0.1;
        Dados.tolerancia = 0.0000000001;
        Dados.interacoes = 0;

        Newton newton = new Newton();
        newton.calculaNewton();
        System.out.println("------------------------------------------------------------------------------------");

    }


}
