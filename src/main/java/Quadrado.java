public class Quadrado extends Formato {

    @Override
    public String retornaFormatoCor() {
        return "Quadrado" + " " + this.cor.retornaCor();
    }
}
