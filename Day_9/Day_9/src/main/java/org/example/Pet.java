package org.example;

public class Pet {
    public String vards;
    public String tips;
    public int vecums;
    public String saimniekaEpasts;

    public Pet(String vards, String tips, int vecums, String saimniekaEpasts) {
        this.vards = vards;
        this.tips = tips;
        this.vecums = vecums;
        this.saimniekaEpasts = saimniekaEpasts;
    }
    public void print (){
        System.out.println(vards);
        System.out.println(tips);
        System.out.println(vecums);
        System.out.println(saimniekaEpasts);
    }
}
