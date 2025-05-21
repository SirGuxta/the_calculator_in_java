import java.io.*;
import javax.swing.*;

class The_Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        construir_botoes(frame);

        JButton botao_igual = new JButton("=");
        botao_igual.setBounds(362, 320, 112, 200);
        frame.add(botao_igual);

        JTextField caixaTexto = new JTextField();
        caixaTexto.setBounds(20, 25, 450, 30);
        frame.add(caixaTexto);

        frame.setSize( 500,  600);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static JButton criar_botao(String texto, JFrame janela_mae, int posx, int posy, int tamx, int tamy) 
    {
        JButton botao_interno = new JButton(texto);

        botao_interno.setBounds(posx, posy, tamx, tamy);

        janela_mae.add(botao_interno);

        return botao_interno;
    }

    public static void construir_botoes(JFrame minha_janela) 
    {
        String[] textoBotoes = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "", "0", "*", "/", ""};

        int[] posiX = {25, 137, 250, 362};
        int[] posiY = {120, 220, 320, 420};

        int contador = 0;
        int contadorX = 0;
        int contadorY = 0;

        while (contador < 15)
        {
            if (textoBotoes[contador] != "") {
                criar_botao(textoBotoes[contador], minha_janela, posiX[contadorX], posiY[contadorY], 112, 100);
            }

            if (contadorX < 3) {
                contadorX++;
            }
            else {
                contadorX = 0;
                
                contadorY++;
            }

            contador++;
        }
    }
}
