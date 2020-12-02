import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class vendingmacine extends JFrame implements ActionListener {

    private Container frame;
    private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,uang,kembali,hasil;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,price1,price2,price3,price4,reset,ambil;
    private JTextField harga,kembalian;
    private ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,img10;

    public  vendingmacine(){
        setTitle("VENDING MACHINE");
        setBounds(100,20,700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame=getContentPane();
        frame.setLayout(null);

        //background GUI
        frame.setBackground(new java.awt.Color(102,255,255));

        //tulisan vending machine
        label1 = new JLabel("VENDING MACHINE");
        label1.setBounds(240,0,300,50);
        label1.setFont( new Font("VENDING MACHINE",2,24));
        frame.add(label1);

        // gambar 1
        img1 = new ImageIcon("bear.jpg");
        label2 = new JLabel();
        label2.setBounds(40,100,70,100);
        label2.setIcon(img1);
        frame.add(label2);
        // gambar 2
        img2 = new ImageIcon("cap3.jpg");
        label3 = new JLabel();
        label3.setBounds(180,100,70,100);
        label3.setIcon(img2);
        frame.add(label3);
        // gambar 3
        img3 = new ImageIcon("teh.jpg");
        label4 = new JLabel();
        label4.setBounds(315,100,70,100);
        label4.setIcon(img3);
        frame.add(label4);
        // gambar 4
        img4 = new ImageIcon("indomilk.jpg");
        label5 = new JLabel();
        label5.setBounds(450,100,70,100);
        label5.setIcon(img4);
        frame.add(label5);
        // gambar 5
        img5 = new ImageIcon("lemineral.jpg");
        label6 = new JLabel();
        label6.setBounds(580,100,70,100);
        label6.setIcon(img5);
        frame.add(label6);
        // gambar 6
        img6 = new ImageIcon("milo.jpg");
        label7 = new JLabel();
        label7.setBounds(40,250,70,100);
        label7.setIcon(img6);
        frame.add(label7);
        // gambar 7
        img7 = new ImageIcon("pocari.jpg");
        label8 = new JLabel();
        label8.setBounds(180,250,70,100);
        label8.setIcon(img7);
        frame.add(label8);
        // gambar 8
        img8 = new ImageIcon("sprite.jpg");
        label9 = new JLabel();
        label9.setBounds(315,250,70,100);
        label9.setIcon(img8);
        frame.add(label9);
        // gambar 9
        img9 = new ImageIcon("uc.jpg");
        label10 = new JLabel();
        label10.setBounds(450,250,70,100);
        label10.setIcon(img9);
        frame.add(label10);
        // gambar 10
        img10 = new ImageIcon("hydro.jpg");
        label11 = new JLabel();
        label11.setBounds(580,250,70,100);
        label11.setIcon(img10);
        frame.add(label11);

        // button 1
        btn1 = new JButton("8500");
        btn1.setBounds(40,200,70,30);
        frame.add(btn1);
        // button 2
        btn2 = new JButton("5000");
        btn2.setBounds(180,200,70,30);
        frame.add(btn2);
        // button 3
        btn3 = new JButton("4000");
        btn3.setBounds(315,200,70,30);
        frame.add(btn3);
        // button 4
        btn4 = new JButton("5000");
        btn4.setBounds(450,200,70,30);
        frame.add(btn4);
        // button 5
        btn5 = new JButton("4500");
        btn5.setBounds(580,200,70,30);
        frame.add(btn5);
        // button 6
        btn6 = new JButton("9000");
        btn6.setBounds(40,350,70,30);
        frame.add(btn6);
        // button 7
        btn7 = new JButton("6000");
        btn7.setBounds(180,350,70,30);
        frame.add(btn7);
        // button 8
        btn8 = new JButton("5000");
        btn8.setBounds(315,350,70,30);
        frame.add(btn8);
        // button 9
        btn9 = new JButton("7000");
        btn9.setBounds(450,350,70,30);
        frame.add(btn9);
        // button 10
        btn10 = new JButton("10000");
        btn10.setBounds(580,350,70,30);
        frame.add(btn10);

        //ambil
        hasil= new JLabel();
        hasil.setBounds(40,390,400,120);
        hasil.setBorder( new TitledBorder( new EtchedBorder(EtchedBorder.LOWERED),""));
        hasil.setBackground(Color.white);
        hasil.setOpaque(true);
        frame.add(hasil);

        //uang
        uang = new JLabel("Uang Anda          : ");
        uang.setBounds(450,390,120,20);
        frame.add(uang);
        //field uang
        harga= new JTextField("0");
        harga.setBounds(554,390,120,20);
        frame.add(harga);
        //kembali
        kembali = new JLabel("Kembalian Anda : ");
        kembali.setBounds(450,410,120,20);
        frame.add(kembali);
        //field kembali
        kembalian= new JTextField("0");
        kembalian.setBounds(554,413,120,20);
        frame.add(kembalian);
        //button ambil
        ambil = new JButton("AMBIL MINUMAN");
        ambil.setBounds(165,520,140,30);
        frame.add(ambil);
        //price 1
        price1 = new JButton("500");
        price1.setBounds(470,445,70,30);
        frame.add(price1);
        //price 2
        price2 = new JButton("1000");
        price2.setBounds(570,445,70,30);
        frame.add(price2);
        //price 3
        price3 = new JButton("2000");
        price3.setBounds(470,480,70,30);
        frame.add(price3);
        //price 4
        price4 = new JButton("5000");
        price4.setBounds(570,480,70,30);
        frame.add(price4);

        //button reset
        reset = new JButton("RESET");
        reset.setBounds(490,520,100,30);
        frame.add(reset);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        ambil.addActionListener(this);
        price1.addActionListener(this);
        price2.addActionListener(this);
        price3.addActionListener(this);
        price4.addActionListener(this);
        reset.addActionListener(this);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        // uang 500
        if(e.getSource()==price1){
            int nilai1=(Integer.parseInt(harga.getText().trim()));
            int total =nilai1+500;
            harga.setText(String.valueOf(total));
        }
        // uang 1000
        if(e.getSource()==price2){
            int nilai1=(Integer.parseInt(harga.getText().trim()));
            int total =nilai1+1000;
            harga.setText(String.valueOf(total));
        }
        // uang 2000
        if(e.getSource()==price3){
            int nilai1=(Integer.parseInt(harga.getText().trim()));
            int total =nilai1+2000;
            harga.setText(String.valueOf(total));
        }
        // uang 5000
        if(e.getSource()==price4){
            int nilai1=(Integer.parseInt(harga.getText().trim()));
            int total =nilai1+5000;
            harga.setText(String.valueOf(total));
        }
        // button 1 bear brend
        if(e.getSource()==btn1){
            if(Integer.parseInt(harga.getText().trim())<8500){
                kembalian.setText(String.valueOf("0"));
                hasil.setText("Maaf uang anda kurang dari 8500");
            }else if(Integer.parseInt(harga.getText().trim())>8500){
                int nilai1=(Integer.parseInt(harga.getText().trim()));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf(nilai1));
                hasil.setText("Maaf uang anda terlalu banyak");
            }else if(Integer.parseInt(harga.getText().trim())==8500){
                hasil.setText("");
                hasil.setIcon(new ImageIcon("bear.jpg"));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf("0"));
            }
        }
        // button 2 cap 3
        if(e.getSource()==btn2){
            if(Integer.parseInt(harga.getText().trim())<5000){
                kembalian.setText(String.valueOf("0"));
                hasil.setText("Maaf uang anda kurang dari 5000");
            }else if(Integer.parseInt(harga.getText().trim())>5000){
                int nilai1=(Integer.parseInt(harga.getText().trim()));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf(nilai1));
                hasil.setText("Maaf uang anda terlalu banyak");
            }else if(Integer.parseInt(harga.getText().trim())==5000){
                hasil.setText("");
                hasil.setIcon(new ImageIcon("cap3.jpg"));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf("0"));
            }
        }
        // button 3 teh pucuk
        if(e.getSource()==btn3){
            if(Integer.parseInt(harga.getText().trim())<4000){
                kembalian.setText(String.valueOf("0"));
                hasil.setText("Maaf uang anda kurang dari 4000");
            }else if(Integer.parseInt(harga.getText().trim())>4000){
                int nilai1=(Integer.parseInt(harga.getText().trim()));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf(nilai1));
                hasil.setText("Maaf uang anda terlalu banyak");
            }else if(Integer.parseInt(harga.getText().trim())==4000){
                hasil.setText("");
                hasil.setIcon(new ImageIcon("teh.jpg"));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf("0"));
            }
        }
        // button 4 indomilk
        if(e.getSource()==btn4){
            if(Integer.parseInt(harga.getText().trim())<5000){
                kembalian.setText(String.valueOf("0"));
                hasil.setText("Maaf uang anda kurang dari 5000");
            }else if(Integer.parseInt(harga.getText().trim())>5000){
                int nilai1=(Integer.parseInt(harga.getText().trim()));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf(nilai1));
                hasil.setText("Maaf uang anda terlalu banyak");
            }else if(Integer.parseInt(harga.getText().trim())==5000){
                hasil.setText("");
                hasil.setIcon(new ImageIcon("indomilk.jpg"));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf("0"));
            }
        }
        // button 5 Lemineral
        if(e.getSource()==btn5){
            if(Integer.parseInt(harga.getText().trim())<4500){
                kembalian.setText(String.valueOf("0"));
                hasil.setText("Maaf uang anda kurang dari 4500");
            }else if(Integer.parseInt(harga.getText().trim())>4500){
                int nilai1=(Integer.parseInt(harga.getText().trim()));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf(nilai1));
                hasil.setText("Maaf uang anda terlalu banyak");
            }else if(Integer.parseInt(harga.getText().trim())==4500){
                hasil.setText("");
                hasil.setIcon(new ImageIcon("lemineral.jpg"));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf("0"));
            }
        }
        // button 6 milo
        if(e.getSource()==btn6){
            if(Integer.parseInt(harga.getText().trim())<9000){
                kembalian.setText(String.valueOf("0"));
                hasil.setText("Maaf uang anda kurang dari 9000");
            }else if(Integer.parseInt(harga.getText().trim())>9000){
                int nilai1=(Integer.parseInt(harga.getText().trim()));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf(nilai1));
                hasil.setText("Maaf uang anda terlalu banyak");
            }else if(Integer.parseInt(harga.getText().trim())==9000){
                hasil.setText("");
                hasil.setIcon(new ImageIcon("milo.jpg"));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf("0"));
            }
        }
        // button 7 pocari
        if(e.getSource()==btn7){
            if(Integer.parseInt(harga.getText().trim())<6000){
                kembalian.setText(String.valueOf("0"));
                hasil.setText("Maaf uang anda kurang dari 8000");
            }else if(Integer.parseInt(harga.getText().trim())>6000){
                int nilai1=(Integer.parseInt(harga.getText().trim()));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf(nilai1));
                hasil.setText("Maaf uang anda terlalu banyak");
            }else if(Integer.parseInt(harga.getText().trim())==6000){
                hasil.setText("");
                hasil.setIcon(new ImageIcon("pocari.jpg"));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf("0"));
            }
        }
        // button 8 sprite
        if(e.getSource()==btn8){
            if(Integer.parseInt(harga.getText().trim())<5000){
                kembalian.setText(String.valueOf("0"));
                hasil.setText("Maaf uang anda kurang dari 5000");
            }else if(Integer.parseInt(harga.getText().trim())>5000){
                int nilai1=(Integer.parseInt(harga.getText().trim()));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf(nilai1));
                hasil.setText("Maaf uang anda terlalu banyak");
            }else if(Integer.parseInt(harga.getText().trim())==5000){
                hasil.setText("");
                hasil.setIcon(new ImageIcon("sprite.jpg"));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf("0"));
            }
        }
        // button 9 uc 1000
        if(e.getSource()==btn9){
            if(Integer.parseInt(harga.getText().trim())<7000){
                kembalian.setText(String.valueOf("0"));
                hasil.setText("Maaf uang anda kurang dari 7000");
            }else if(Integer.parseInt(harga.getText().trim())>7000){
                int nilai1=(Integer.parseInt(harga.getText().trim()));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf(nilai1));
                hasil.setText("Maaf uang anda terlalu banyak");
            }else if(Integer.parseInt(harga.getText().trim())==7000){
                hasil.setText("");
                hasil.setIcon(new ImageIcon("uc.jpg"));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf("0"));
            }
        }
        // button 10 hydro coco
        if(e.getSource()==btn10){
            if(Integer.parseInt(harga.getText().trim())<10000){
                kembalian.setText(String.valueOf("0"));
                hasil.setText("Maaf uang anda kurang dari 10000");
            }else if(Integer.parseInt(harga.getText().trim())>10000){
                int nilai1=(Integer.parseInt(harga.getText().trim()));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf(nilai1));
                hasil.setText("Maaf uang anda terlalu banyak");
            }else if(Integer.parseInt(harga.getText().trim())==10000){
                hasil.setText("");
                hasil.setIcon(new ImageIcon("hydro.jpg"));
                harga.setText(String.valueOf("0"));
                kembalian.setText(String.valueOf("0"));
            }
        }
        // button ambil
        if(e.getSource()==ambil){
            hasil.setIcon(new ImageIcon(""));
        }
        // button reset
        if(e.getSource()==reset){
            hasil.setText(String.valueOf(""));
            harga.setText(String.valueOf("0"));
            kembalian.setText(String.valueOf("0"));
        }
    }
    public static void main(String[] args){

        vendingmacine vend = new vendingmacine();
    }
}
