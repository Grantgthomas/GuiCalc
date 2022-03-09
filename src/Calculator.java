import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;

import java.util.DoubleSummaryStatistics;

/**
 * Created by Grant on 3/5/2018.
 */



public class Calculator extends JFrame implements ActionListener{


    JPanel CalcContain;
    JButton btnEquals;
    JButton btnPlus;
    JButton btnMinus;
    JButton btnMulti;
    JButton btnSQRT,btnMod, btnDivide;
    JButton btnDec,one,two,three,four,five,six,seven,eight,nine,zero;
    JButton btnHelp;
    JButton btnNeg;
    JButton btnExit;
    JButton btnClear;
    Double x,y,z;
    String resultString= "",Operation = "";
    JTextField result;





    public Calculator()
    {



        CalcContain = new JPanel();

        JPanel Organizer = new JPanel(new GridLayout(1,3));
            JPanel Numbers = new JPanel(new GridLayout(4,3,1,1));
            JPanel Operators = new JPanel(new GridLayout(4,2));
            JPanel TextAera = new JPanel(new FlowLayout());
            JPanel BottomArea = new JPanel(new FlowLayout());
            JPanel CenterArea =  new JPanel(new FlowLayout());
            JMenuBar Menu = new JMenuBar();

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());


        Menu.setVisible(true);
        CalcContain.setLayout(new GridLayout());
        CalcContain.add(Organizer);
        Organizer.add(Numbers);
        CenterArea.add(TextAera);
        Organizer.add(CenterArea);
        Organizer.add(Operators);

       // CalcContain.add(BottomArea,BorderLayout.SOUTH);

    //    CalcContain.add(BottomArea);



     //  JMenuBar Menu = new JMenuBar();

       result = new JTextField(20);
       one = new JButton("1");
       two = new JButton("2");
       three = new JButton("3");
       four = new JButton("4");
       five = new JButton("5");
       six = new JButton("6");
       seven = new JButton("7");
       eight = new JButton("8");
       nine = new JButton("9");
       zero = new JButton("0");
       btnEquals = new JButton("=");
       btnPlus = new JButton("+");
       btnMinus = new JButton("-");
       btnMulti = new JButton("*");
       btnSQRT = new JButton("sqrt");
       btnMod = new JButton("%");
       btnDivide = new JButton("/");
       btnNeg = new JButton("+/-");
       btnDec = new JButton(".");
      btnExit = new JButton("Exit");
      btnHelp = new JButton("Help");
       btnClear = new JButton("Clear");





        one.addActionListener(this);
        btnHelp.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        btnEquals.addActionListener(this);
        btnPlus.addActionListener(this);
        btnDec.addActionListener(this);
        btnDivide.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMod.addActionListener(this);
        btnMulti.addActionListener(this);
        btnNeg.addActionListener(this);
        btnSQRT.addActionListener(this);
        btnExit.addActionListener(this);
        btnClear.addActionListener(this);


        Menu.add(btnExit) ;
        Menu.add(btnHelp);

        Operators.add(btnDivide);
        Operators.add(btnMinus);
        Operators.add(btnMulti);
        Operators.add(btnPlus);
        Operators.add(btnSQRT);
        Operators.add(btnMod);
        Operators.add(btnEquals);
        Operators.add(btnClear);


        Numbers.add(one);
        Numbers.add(two);
        Numbers.add(three);
        Numbers.add(four);
        Numbers.add(five);
        Numbers.add(six);
        Numbers.add(seven);
        Numbers.add(eight);
        Numbers.add(nine);
        Numbers.add(btnNeg);
        Numbers.add(zero);
        Numbers.add(btnDec);

        TextAera.add(result);

        CenterArea.add(btnExit);
        CenterArea.add(btnHelp);


        cp.add(CalcContain);
        setBounds(0,0,800,800);
    }





    public void actionPerformed(ActionEvent e){

        ActionEvent lastEvent = e;

        if(e.getSource() == btnClear){
            resultString = "";
            result.setText(resultString);
        }
        if(e.getSource() == btnHelp){
            JOptionPane.showMessageDialog(btnHelp,"Grant");
        }
        if(e.getSource() == btnExit){
            System.exit(0);
        }
        if(e.getSource() == btnEquals){

        }
        if(e.getSource() == one){
            resultString+="1";
            result.setText(resultString);

        }
        if(e.getSource() == two){
            resultString+="2";
            result.setText(resultString);
        }
        if(e.getSource() == three){

            resultString+="3";
            result.setText(resultString);
        }
        if(e.getSource() == four){
            resultString+="4";
            result.setText(resultString);

        }
        if(e.getSource() == five){
            resultString+="5";
            result.setText(resultString);

        }
        if(e.getSource() == six){
            resultString+="6";
            result.setText(resultString);

        }
        if(e.getSource() == seven){
            resultString+="7";
            result.setText(resultString);

        }
        if(e.getSource() == eight){
            resultString+="8";
            result.setText(resultString);

        }
        if(e.getSource() == nine){
            resultString+="9";
            result.setText(resultString);

        }
        if(e.getSource() == btnNeg){
            x = Double.parseDouble(result.getText());
            x/=-1;
            result.setText(x.toString());
        }
        if(e.getSource() == btnDec && !(resultString.contains("."))){
            resultString +=".";
            result.setText(resultString);
        }
        if(e.getSource() == btnPlus){
            x = Double.parseDouble(result.getText());
            resultString = "";
            Operation = btnPlus.getText();
            result.setText("0");
        }
        if(e.getSource() == btnMinus){
            x = Double.parseDouble(result.getText());
            resultString = "";
            Operation = btnMinus.getText();
            result.setText("0");
        }
        if(e.getSource() == btnMulti){
            x = Double.parseDouble(result.getText());
            resultString = "";
            Operation = btnMulti.getText();
            result.setText("0");
        }
        if(e.getSource() == btnDivide){
            x = Double.parseDouble(result.getText());
            resultString = "";
            Operation = btnDivide.getText();
            result.setText("0");
        }
        if(e.getSource() == btnMod){
            x = Double.parseDouble(result.getText());
            resultString = "";
            Operation = btnMod.getText();
            result.setText("0");
        }
        if(e.getSource() == btnSQRT){
            x = Double.parseDouble(result.getText());
            x = Math.sqrt(x);
            result.setText(x.toString());
        }
        if(e.getSource()== btnEquals){
            if(Operation.equals("+")){
                y = Double.parseDouble(result.getText());
                z = y + x;
                result.setText( z.toString());
            }
            if(Operation.equals("-")){

                y = Double.parseDouble(result.getText());
                z = x - y;
                result.setText( z.toString());
            }
            if(Operation.equals("*")){

                y = Double.parseDouble(result.getText());
                z = y * x;
                result.setText( z.toString());
            }
            if(Operation.equals("/")){
                y = Double.parseDouble(result.getText());
                z = x / y;
                result.setText( z.toString());
            }
            if(Operation.equals("%")){
                y = Double.parseDouble(result.getText());
                z = x % y;
                result.setText( z.toString());
            }
            if(result.getText().endsWith(".0")){
                result.setText(result.getText().replace(".0",""));
            }






        }

    }

    public static void main(String [] args)
    {

        Calculator calc = new Calculator();
        calc.setVisible(true);



    }


}
