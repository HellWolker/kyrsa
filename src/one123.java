import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.applet.*;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*;

import javax.swing.*;

public class one123 extends JFrame {
private JTextField input = new JTextField("");
private JButton button = new JButton("Расчёт");
private JLabel label = new JLabel("ПИ-220");
private JLabel label2 = new JLabel("Косарев Антон Вадимович ");
private JLabel label4 = new JLabel("Мухамедьяров Вадим Асхатович ");
private JLabel label6 = new JLabel("Калганова Ксения Алексеевна ");
private JLabel label8 = new JLabel("Якупов Ядгар Галимович ");
private JLabel label10= new JLabel();
private JButton swith = new JButton("Переключение на кубические сантиметры");
private JLabel otvet =new JLabel();





public one123() {
super("Window");
this.setBounds(300,600,520,400);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
button.addActionListener(new ButtonEventListener());
swith.addActionListener( new ButtonEventListener12());
setContentPane(new BgPanel());
Container container = this.getContentPane();
container.setLayout(new GridLayout(0,1,2,10));
container.add(label);
container.add(label2);
container.add(label4);
container.add(label6);
container.add(label8);
container.add(input);
container.add(button);
container.add(swith);
container.add(label10);
container.add(otvet);



}
class ButtonEventListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
double b = 90*Integer.parseInt(input.getText())*800;
double a=b/100;
otvet.setText("Объем параллелепипеда равен: "+a+" куб. м.");
}
}
class ButtonEventListener12 implements ActionListener {
public void actionPerformed(ActionEvent e) {
int a = 90*Integer.parseInt(input.getText())*800;
otvet.setText("Объем параллелепипеда равен: "+a+" куб. см.");
}
}

public static void main(String[] args) {
one123 app = new one123();
app.setVisible(true);
}
class BgPanel extends JPanel{
public void paintComponent(Graphics g){
Image im = null;
try {
im = ImageIO.read(new File("1.png"));
} catch (IOException e) {}
g.drawImage(im, 205,0, null);
}
}
}
