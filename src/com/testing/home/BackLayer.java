package com.testing.home;

import java.util.ArrayList;
import java.util.List;

public class BackLayer {
    private List<Produs> produse = new ArrayList<>();

    private Produs produs;                           //agregare
    private Application app;                         //agregare
    private final Gestionare gestionare;             //compozitie


    public BackLayer(Application app){
        this.app = app;
        this.gestionare = new Gestionare(this);
    }

    public void addToList(Produs produs){

        produse.add(produs);
    }

    public void removeFromList(Produs produs){
        if(produse.contains(produs)){
            System.out.println("\nProdus deja sters din cos\n");
        }
    }

    public void getProduse(){
        for (Produs p : produse)
            System.out.println(p);
    }
}
