package tech.pdall.async;

public class JsonModel {
    private String fruit;
    private String size;
    private String color;

    public JsonModel() {
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "JsonModel{" +
                "fruit='" + fruit + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
