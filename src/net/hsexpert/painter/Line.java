package net.hsexpert.painter;

import java.awt.*;
import java.util.Random;

/**
 * Created by ikaros on 2015/3/17.
 */
public class Line extends Shape {
    public Line(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
        this.setColor1(Color.BLACK);
        this.setColor2(Color.BLACK);
        this.setFilled(false);
        this.setStrokeWidth(10);
        this.setGradient(false);
    }
    public Line(int x1, int y1, int x2, int y2, Color color1, Color color2, Boolean filled, int strokeWidth, Boolean gradient)
    {
        this(x1,y1,x2,y2);
        this.setColor1(color1);
        this.setColor2(color2);
        this.setFilled(filled);
        this.setStrokeWidth(strokeWidth);
        this.setGradient(gradient);
    }
    public Line(Line src)
    {
        this.x1 = src.x1;
        this.y1 = src.y1;
        this.x2 = src.x2;
        this.y2 = src.y2;
        this.filled = src.filled;
        this.color1 = src.color1;
        this.color2 = src.color2;
        this.strokeWidth = src.strokeWidth;
        this.gradient = src.gradient;
    }

    public void setPointer(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public void draw(Graphics G) {
        if(!this.visible) return;
        Graphics2D g2d = (Graphics2D)G;
        g2d.setStroke(new BasicStroke(strokeWidth));
        if (gradient) g2d.setPaint(new GradientPaint(10,10,color1,20,20,color2,true));
        else g2d.setColor(this.color1);
        g2d.drawLine(x1,y1,x2,y2);
    }

    public static Line generateRandomLine()
    {
        Random rnd = new Random();
        int x1, x2, y1, y2, R1, G1, B1, R2, G2, B2;
        x1 = rnd.nextInt(1280);
        x2 = rnd.nextInt(1280);
        y1 = rnd.nextInt(720);
        y2 = rnd.nextInt(720);
        R1 = rnd.nextInt(255);
        G1 = rnd.nextInt(255);
        B1 = rnd.nextInt(255);
        R2 = rnd.nextInt(255);
        G2 = rnd.nextInt(255);
        B2 = rnd.nextInt(255);

        Line line = new Line(x1, y1, x2, y2);
        line.setColor1(new Color(R1, G1, B1));
        line.setColor2(new Color(R2, G2, B2));
        line.setFilled(rnd.nextBoolean());
        line.setGradient(rnd.nextBoolean());

        return line;
    }
}
