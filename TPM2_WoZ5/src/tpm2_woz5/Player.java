package tpm2_woz5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;



/**
 *
 * @author Delphine
 */
public class Player {
    private String aliasP;
    private ArrayList<Weapon> weaponPlayer;
    private int strenghtPlayer;

    public Player(String pseudoJ, ArrayList<Weapon> armeJ, int forceJ) {
        this.aliasP = pseudoJ;
        this.weaponPlayer = armeJ;
        this.strenghtPlayer = forceJ;
    }

    public String getAliasP() {
        return aliasP;
    }

    public void setAliasP(String aliasP) {
        this.aliasP = aliasP;
    }

    public ArrayList<Weapon> getWeaponPlayer() {
        return weaponPlayer;
    }

    public void setWeaponPlayer(ArrayList<Weapon> weaponPlayer) {
        this.weaponPlayer = weaponPlayer;
    }

    public int getStrenghtPlayer() {
        return strenghtPlayer;
    }

    public void setStrenghtPlayer(int strenghtPlayer) {
        this.strenghtPlayer = strenghtPlayer;
    }
    
}
