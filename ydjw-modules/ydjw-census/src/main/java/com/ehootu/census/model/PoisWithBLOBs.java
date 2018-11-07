package com.ehootu.census.model;

public class PoisWithBLOBs extends Pois {
    private String description;

    private String spriders;

    private String images;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSpriders() {
        return spriders;
    }

    public void setSpriders(String spriders) {
        this.spriders = spriders == null ? null : spriders.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }
}