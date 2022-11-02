public abstract class Formato {

    /*
    Interface Cor é implementada pelas classes Azul e Vermelho
    Classe abstrata Formato é extendida pelas classes Quadrado e Triangulo
    Objeto Triangulo/Quadrado possuem Cor devido à classe abstrata Formato que possui uma variável Cor
     */

    protected Cor cor;

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract String retornaFormatoCor();
}
