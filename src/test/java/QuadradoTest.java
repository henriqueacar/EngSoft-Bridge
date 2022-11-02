import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    @Test
    void deveRetornarQuadradoVermelho(){
        Cor cor = new Vermelho();
        Quadrado quadrado = new Quadrado();
        quadrado.setCor(cor);
        assertEquals("Quadrado vermelho", quadrado.retornaFormatoCor());
    }

    @Test
    void deveRetornarQuadradoAzul(){
        Cor cor = new Azul();
        Quadrado quadrado = new Quadrado();
        quadrado.setCor(cor);
        assertEquals("Quadrado azul", quadrado.retornaFormatoCor());
    }
}