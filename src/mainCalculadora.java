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


    public static void main(String[] args) {

        JFrame frame = new JFrame("minha calculadora");
        frame.setContentPane(new mainCalculadora().calcular);
        frame.pack();
        frame.setSize(800,800);
        frame.setVisible(true);
    }

    public void teste(int x){
        visor.setText(visor.getText() + x);
    };

    public void calcular(){

        if (visor.getText().contains("+")){

        }

    }

    public mainCalculadora(){

        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visor.setText("");
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
