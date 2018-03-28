package com.testing.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BackLayer {
    private List<Produs> produse = new ArrayList<>();


    public void addProdus(Produs produs){
        this.produse.add(produs);
    }

    public void removeProdus(Produs produs){
        this.produse.remove(produs);
    }

    public void updateStatus(Produs produs, String status){
        for(Produs p : produse){
            if(Objects.equals(p, produs))
                p.setStatus(status);
        }
    }

    public List<Produs> getProduse() {
        return produse;
    }
}
