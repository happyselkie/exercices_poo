package org.example.exerciceList;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private int siret;
    private String address;
    private String website;

    public Company(String name, int siret, String address, String website) {
        this.name = name;
        this.siret = siret;
        this.address = address;
        this.website = website;
    }

    @Override
    public String toString() {
        return "L'entreprise " + name + " a un siret :" +siret + ", à l'adresse : " +address+". Site web : "+website;
    }
}
