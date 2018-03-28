package com.testing.home;

public class Application {
    private BackLayer backLayer;
    private Status status;

    public Application (){
        backLayer = new BackLayer(this);
        this.status = new Status(this);
    }




    public static void main(String[] args) {

        Application application = new Application();
        BackLayer backLayer = new BackLayer(application);
        Gestionare gestionare = new Gestionare(backLayer);
        Produs produs = new Produs("Stricat","123", "Toshiba");
        gestionare.addProdus(produs);
        backLayer.getProduse();
    }
}
