package tpm2_woz5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;



/**
 *
 * @author Paul
 */
public class Player {
    private String aliasP;
    private ArrayList<Weapon> weaponP;
    private int strengthP;

    public Player(String pseudoJ, ArrayList<Weapon> armeJ, int forceJ) {
        this.aliasP = pseudoJ;
        this.weaponP = armeJ;
        this.strengthP = forceJ;
    }

    public String getAliasP() {
        return aliasP;
    }

    public void setAliasP(String aliasP) {
        this.aliasP = aliasP;
    }

    public ArrayList<Weapon> getWeaponP() {
        return weaponP;
    }

    public void setWeaponP(ArrayList<Weapon> weaponP) {
        this.weaponP = weaponP;
    }

    public int getStrengthP() {
        return strengthP;
    }

    public void setStrengthP(int strengthP) {
        this.strengthP = strengthP;
    }
    
}
