package br.cesul.collection;

public class CollectableItem {

    private String author;
    private int year;
    private double price;
    private String name;
    private String anomalies;
    private ConservationState conservationState;
    private RarityLevel rarity;
    private boolean autographed;
    private String genre;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnomalies() {
        return anomalies;
    }

    public void setAnomalies(String anomalies) {
        this.anomalies = anomalies;
    }

    public ConservationState getConservationState() {
        return conservationState;
    }

    public void setConservationState(ConservationState conservationState) {
        this.conservationState = conservationState;
    }

    public RarityLevel getRarity() {
        return rarity;
    }

    public void setRarity(RarityLevel rarity) {
        this.rarity = rarity;
    }

    public boolean isAutographed() {
        return autographed;
    }

    public void setAutographed(boolean autographed) {
        this.autographed = autographed;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
