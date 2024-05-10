package br.cesul.collection;

public class ActionFigure extends CollectableItem{

    private String color;
    private int edition;
    private double width;
    private double height;
    private double length;
    private String material;
    private double weight;
    private String accessories;
    private boolean articulated;

    @Override
    public double getSellPrice() {
        double sellPrice = super.getSellPrice();

        if (articulated) {
            sellPrice = sellPrice * 1.3;
        }

        return sellPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public boolean isArticulated() {
        return articulated;
    }

    public void setArticulated(boolean articulated) {
        this.articulated = articulated;
    }
}
