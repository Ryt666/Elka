package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Line2D;
public class Main extends JComponent {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(600, 600);
        frame.setLocation(500, 400);
        frame.getContentPane().add(new Main());//подключает весь код
        frame.setVisible(true);


    }

    public void paint(Graphics painter) {
        painter.setColor(Color.green);
        painter.fillPolygon(new int[]{54, 104, 79}, new int[]{150, 150, 110}, 3);
        painter.setColor(Color.green);
        painter.fillPolygon(new int[]{54, 104, 144, 14}, new int[]{150, 150, 190, 190}, 4);
        painter.fillPolygon(new int[]{54, 104, 144, 14}, new int[]{190, 190, 230, 230}, 4);
        painter.fillPolygon(new int[]{54, 104, 144, 14}, new int[]{230, 230, 270, 270}, 4);
        painter.fillPolygon(new int[]{54, 104, 144, 14}, new int[]{270, 270, 310, 310}, 4);
        painter.fillPolygon(new int[]{54, 104, 144, 14}, new int[]{310, 310, 350, 350}, 4);
        painter.fillPolygon(new int[]{54, 104, 144, 14}, new int[]{350, 350, 390, 390}, 4);
        painter.fillPolygon(new int[]{54, 104, 104, 54}, new int[]{390, 390, 400, 400}, 4);
        painter.setColor(Color.black);
        painter.fillOval(10, 390, 15, 15);
        painter.fillOval(134, 390, 15, 15);
        painter.setColor(Color.red);
        painter.fillOval(10, 350, 15, 15);
        painter.fillOval(134, 350, 15, 15);
        painter.setColor(Color.black);
        painter.fillOval(10, 310, 15, 15);
        painter.fillOval(134, 310, 15, 15);
        painter.setColor(Color.red);
        painter.fillOval(10, 270, 15, 15);
        painter.fillOval(134, 270, 15, 15);
        painter.setColor(Color.black);
        painter.fillOval(10, 230, 15, 15);
        painter.fillOval(134, 230, 15, 15);
        painter.setColor(Color.red);
        painter.fillOval(10, 190, 15, 15);
        painter.fillOval(134, 190, 15, 15);
        painter.setColor(Color.black);
        painter.fillPolygon(new int[]{54, 104, 104, 54}, new int[]{390, 390, 400, 400}, 4);
        painter.setColor(Color.red);
        painter.fillPolygon(new int[]{14, 79, 144, 90,79,68}, new int[]{140,120, 140, 100, 40,100}, 6);
        /*Graphics2D p = (Graphics2D) painter;
        p.setStroke(new BasicStroke(15.0f));

        Rectangle r = getBounds();
        float width = 60;
        float height = 60;

        p.translate(r.getWidth() / 11 - width / 15, r.getHeight() / 9 - height / 10);
        Path2D star = new Path2D.Float();
        star.moveTo(width / 5F, height - 1);
        star.lineTo(width / 2F, 0);
        star.lineTo(4 * width / 5F, height - 1);
        star.lineTo(0, 2 * height / 5F);
        star.lineTo(width - 1, 2 * height / 5F);
        star.closePath();
        p.draw(star);
        p.fill(star);*/

        Image image = new ImageIcon("C:/Users/polin/OneDrive/Desktop/111111111.jpg").getImage();
       painter.drawImage(image, 180,290, this);

    }


}

