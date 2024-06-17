package DesignPatterns.creational.prototype;

public class Button {
    protected String color;
    protected int width;
    protected int height;
    protected ButtonBorder border;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ButtonBorder getBorder() {
        return border;
    }

    public void setBorder(ButtonBorder border) {
        this.border = border;
    }

    @Override
    public String toString() {
        return "Button{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", border=" + border +
                '}';
    }
}
