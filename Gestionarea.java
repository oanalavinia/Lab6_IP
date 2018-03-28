package com.testing.home;

public class Gestionare {
    private BackLayer backLayer;

    public Gestionare(BackLayer backLayer){
        this.backLayer = backLayer;
    }

    public void addProdus(Produs produs){
        backLayer.addProdus(produs);
    }

    public void removeProdus(Produs produs){
        backLayer.removeProdus(produs);
    }
}
