package net.hsexpert.painter;

import java.awt.*;

/**

 * Created by ikaros on 2015/3/17.
 */
public abstract class Shape {
    protected int x1, y1, x2, y2;
    protected int strokeWidth;
    protected Color color1;
    protected Color color2;
    protected Boolean filled;
    protected Boolean visible = true;
    protected Boolean gradient;

    public abstract void draw(Graphics G);
    public abstract void setPointer(int x1, int y1, int x2, int y2);

    public Boolean isGradient() {
        return gradient;
    }

    public void setGradient(Boolean gradient) {
        this.gradient = gradient;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }
    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    public Shape() {
    }

    public Shape(int x1, int y1, int x2, int y2) {
        setPointer(x1,y1,x2,y2);
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }
}
