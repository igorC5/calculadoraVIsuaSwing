import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainCalculadora {
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnC;
    private JButton btn4;
    private JButton btnEqual;
    private JButton btn1;
    private JTextField visor;
    private JButton btnPlus;
    private JButton btn6;
    private JButton btn5;
    private JButton btn2;
    private JButton btn3;
    private JButton btnSub;
    private JButton btnDiv;
    private JButton btnMulti;
    private JButton btn0;
    private JPanel calcular;

    public String valorSinal = "0";
    public String valor1 = "0";

    public static void main(String[] args) {

        JFrame frame = new JFrame("minha calculadora");
        frame.setContentPane(new mainCalculadora().calcular);
        frame.pack();
        frame.setSize(800,800);
        frame.setVisible(true);
    }

    public void teste(int x){
        visor.setText(visor.getText() + x); //adiciona o número no visor
    };

    public void sinais(String sinal){
        valor1 = visor.getText(); //guarda o valor atual do visor
        visor.setText(sinal); // limpa o visor e coloca o sinal no lugar
        valorSinal = sinal; // guarda o sinal da operação
    }

    public void resultado(){

        int resul = 0;

        if (valorSinal.equals("+")){
            resul = Integer.parseInt(valor1) + Integer.parseInt(visor.getText());
            visor.setText( String.valueOf(resul));
        }

        if (valorSinal.equals("-")){
            resul = Integer.parseInt(valor1) - Integer.parseInt( visor.getText().substring(1) );
            visor.setText( String.valueOf(resul));
        }

        if (valorSinal.equals("*")){
            resul = Integer.parseInt(valor1) * Integer.parseInt( visor.getText().substring(1) );
            visor.setText( String.valueOf(resul));
        }

        if (valorSinal.equals("/")){
            resul = Integer.parseInt(valor1) / Integer.parseInt( visor.getText().substring(1) );
            visor.setText( String.valueOf(resul));
        }


    }

    public mainCalculadora(){

        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado();
            }
        });

        //BOTAO MAIS
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sinais("+");
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sinais("-");
            }
        });

        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sinais("*");
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sinais("/");
            }
        });

        //BOTAO CLEAR
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visor.setText("");
                valor1 = "0";
                valorSinal = "0";
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                teste(1);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(2);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(3);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(4);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(5);
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(6);
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(7);
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(8);
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(9);
            }
        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(0);
            }
        });
    }
}
