package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel extends JPanel {

    private Random randomNumbers = new Random();
    private MyLine[] lines;

    public DrawPanel()
    {
        setBackground(Color.BLACK);
        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        for(int count = 0; count < lines.length; count++)
        {
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            Color color = new Color(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(MyLine line : lines)
            line.draw(g);
    }
}
