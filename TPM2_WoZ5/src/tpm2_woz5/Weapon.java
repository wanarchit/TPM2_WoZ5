/*
 * Weapon.java
 *
 * Created on 19 nov. 2017
 * Please enter a description of your class
 * Please enter the goal, attributes of your class...
 *
 * Copyright(c) Delphine, Inc.  All Rights Reserved.
 * This software is the proprietary information of Gphy Company.
 *
 */

package tpm2_woz5;

/**
 * Created on 19 nov. 2017
 * @author Delphine
 */
public class Weapon {
    private String nomArme;
    private int degatArme;

    public Weapon(String nomArme, int degatArme) {
        this.nomArme = nomArme;
        this.degatArme = degatArme;
    }

    public String getNomArme() {
        return nomArme;
    }

    public void setNomArme(String nomArme) {
        this.nomArme = nomArme;
    }

    public int getDegatArme() {
        return degatArme;
    }

    public void setDegatArme(int degatArme) {
        this.degatArme = degatArme;
    }
    
    
}
