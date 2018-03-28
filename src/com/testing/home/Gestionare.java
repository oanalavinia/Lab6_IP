package com.testing.home;

public class Gestionare {
    BackLayer backLayer;
    private String codProdus;

    public Gestionare(BackLayer backLayer){
        this.backLayer = backLayer;
    }

    public void addProdus( Produs produs){
        backLayer.addToList(produs);
    }

    public void removeProdus(Produs produs){
        backLayer.removeFromList(produs);
    }

    public String getCodProdus() {
        return codProdus;
    }

    public void setCodProdus(String codProdus) {
        this.codProdus = codProdus;
    }
}
