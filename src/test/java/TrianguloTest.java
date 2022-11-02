import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    void deveRetornarTrianguloVermelho(){
        Cor cor = new Vermelho();
        Triangulo triangulo = new Triangulo();
        triangulo.setCor(cor);
        assertEquals("Triangulo vermelho", triangulo.retornaFormatoCor());
    }

    @Test
    void deveRetornarTrianguloAzul(){
        Cor cor = new Azul();
        Triangulo triangulo = new Triangulo();
        triangulo.setCor(cor);
        assertEquals("Triangulo azul", triangulo.retornaFormatoCor());
    }

}