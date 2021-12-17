package convertor;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class  Ccovertor extends JFrame implements ActionListener {

    public JButton jb1,jb2,jb3, jb4;
    public JTextField tx1,tx2,tx3,tx4;
    public JPanel j;

    Font f = new Font("Georgia",Font.BOLD,15);
    Font f1 = new Font("Georgia",Font.ITALIC,20);

    Ccovertor(){
        setTitle("Temperature Converter");
        setSize(400,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        //icon set
        ImageIcon icon = new ImageIcon(new ImageIcon("C:\\Users\\Unique-pc\\Downloads\\veg\\calculator.png").getImage().getScaledInstance(10000,10000, Image.SCALE_SMOOTH));
        this.setIconImage(icon.getImage());


        JLabel l = new JLabel("Temperature Converter");
        l.setBounds(100,30,300,20);
        l.setForeground(new Color(0x000000));
        l.setFont(f1);
        add(l);

        JLabel l1 =  new JLabel("Celsius:");
        l1.setBounds(20,100,130,40);
        l1.setForeground(new Color(0x363535));
        l1.setFont(f);
        add(l1);

        JLabel l2 =  new JLabel("Fahrenheit:");
        l2.setBounds(5,170,130,40);
        l2.setForeground(new Color(0x000000));
        l2.setFont(f);
        add(l2);

        JLabel l3 =  new JLabel("Kalvin:");
        l3.setBounds(20,240,130,40);
        l3.setForeground(new Color(0x000000));
        l3.setFont(f);
        add(l3);

        JLabel l4 =  new JLabel("OUTPUT:");
        l4.setBounds(10,340,130,40);
        l4.setFont(f);
        l4.setForeground(new Color(0x000000));
        add(l4);


        tx1 = new JTextField();
        tx1.setBounds(100,100,130,40);
        tx1.setFont(f);
        add(tx1);

        tx2 = new JTextField();
        tx2.setBounds(100,170,130,40);
        tx2.setFont(f);
        add(tx2);

        tx3 = new JTextField();
        tx3.setBounds(100,240,130,40);
        tx3.setFont(f);
        add(tx3);

        tx4 = new JTextField();
        tx4.setBounds(100,340,150,40);
        tx4.setBackground(new Color(9, 70, 77, 255));
        tx4.setForeground(new Color(0xF5F5F5));
        tx4.setFont(f);
        add(tx4);

        ////////////////////////////////
        jb1 = new JButton("C");
        jb1.addActionListener(this);
        jb1.setBounds(60,400,70,30);
        jb1.setBackground(Color.PINK);
        jb1.setFont(f);
        add(jb1);


        jb2 = new JButton("F");
        jb2.setBackground(new Color(223, 255, 20));
        jb2.addActionListener(this);
        jb2.setBounds(150,400,70,30);
        jb2.setFont(f);
        add(jb2);

        jb3 = new JButton("K");
        jb3.setBackground(new Color(8, 255, 87));
        jb3.addActionListener(this);
        jb3.setBounds(230,400,70,30);
        jb3.setFont(f);
        add(jb3);


        //reset Button
        jb4 = new JButton("Reset");
        jb4.setBounds(140,460,100,40);
        jb4.setBackground(new Color(255, 43, 5));
        jb4.setForeground(Color.BLACK);
        jb4.addActionListener(this);
        jb4.setFont(f);
        add(jb4);

        j = new JPanel();
        j.setBounds(0,0,400,550);
        j.setLayout(null);
        j.setBackground(new Color(248, 231, 155));
        add(j);



        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jb1) {

            //Celcious to Celsious
            if (tx2.getText().equals("") && tx3.getText().equals("") && tx1.getText() != "") {
                String s = tx1.getText();
                tx4.setText(""+s);
            }

            // farenhite to celcious

            else if (tx1.getText().equals("") && tx3.getText().equals("") && tx2.getText() != "")
            {
                double far = Double.parseDouble((tx2.getText()));
                double cel = (far - 32) * 5 / 9;

                String s = String.valueOf(cel);
                tx4.setText(""+cel );
            }


            // kalvin to celcious
            else if (tx1.getText().equals("") && tx2.getText().equals("") && tx3.getText() != "")
            {
                double kal = Double.parseDouble((tx3.getText()));
                double cel = (kal - 273.15);
                String s = String.valueOf(cel);
                tx4.setText(""+cel);
            }

            else if (tx1.getText().equals("") && tx2.getText().equals("") && tx3.getText().equals(""))
            {
                tx4.setText("Input need");
            }
            else {
                tx4.setText("Multiple Input ");
            }
        }

        ////////////////////////////////////////////////////

        else  if (e.getSource()==jb2)
        {
            //Farenheit to Farenheit
            if(tx1.getText().equals("")&& tx3.getText().equals("")&& tx2.getText()!="")
            {
                String s = tx2.getText();
                tx4.setText(s);
            }

            //Celcious to Farenheit

            else if(tx2.getText().equals("")&& tx3.getText().equals("")&& tx1.getText()!="")
            {
                double cel = Double.parseDouble((tx1.getText()));
                double far = (cel*9/5)+32;
                String s = String.valueOf(far);
                tx4.setText(""+far);
            }

            //kalvin to farenheit

            else if(tx1.getText().equals("")&& tx2.getText().equals("")&& tx3.getText()!="")
            {
                double kal = Double.parseDouble((tx3.getText()));
                double far = (kal-273.15)*9/5+32;
                String s = String.valueOf(far);
                tx4.setText(""+far);
            }
            else if (tx1.getText().equals("") && tx2.getText().equals("") && tx3.getText().equals(""))
            {
                tx4.setText("Input need");
            }
            else {
                tx4.setText("Multiple Input ");
            }
        }


        ////////////////////////////////////////////////////////
        else  if (e.getSource()==jb3)
        {
            //Kalvin to Kalvin
            if(tx1.getText().equals("")&& tx2.getText().equals("")&& tx3.getText()!="")
            {
                String s = tx3.getText();
                tx4.setText(s);
            }

            //Fahernheit to Kalvine

            else if(tx1.getText().equals("")&& tx3.getText().equals("")&& tx2.getText()!="")
            {
                double far = Double.parseDouble((tx2.getText()));
                double kal = (far-32)*5/9+273.15;
                String s = String.valueOf(kal);
                tx4.setText(""+kal);
            }

            //Celcious to Kalvin

            else if(tx2.getText().equals("")&& tx3.getText().equals("")&& tx1.getText()!="")
            {
                double cel = Double.parseDouble((tx1.getText()));
                double kal = (cel+273.15);
                String s = String.valueOf(kal);
                tx4.setText(""+kal);
            }
            else if (tx1.getText().equals("") && tx2.getText().equals("") && tx3.getText().equals(""))
            {
                tx4.setText("Input need");
            }
            else {
                tx4.setText("Multiple Input ");
            }
        }
        else if(e.getSource()==jb4)
        {
            tx1.setText(null);
            tx2.setText(null);
            tx3.setText(null);
            tx4.setText(null);

        }

    }
}



public class Main {

    public static void main(String[] args) {
     new Ccovertor();
    }
}
