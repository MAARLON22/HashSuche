public class hashSuche {
    private int pmod;
    private int[] zahlen = {1903198,21121979,9081981,6061981,14101980,29081981,11031979,17061980};

    private double[] zahlen2 = {8.99,1.98,5.89,7.98,4.00,9.79,2.19,4.98};

    private int[] hashTabelle = new int [10];


    public hashSuche(int pMod){
       this.pmod = pMod;

    }

    public int berechneHash( int pSchlüssel){

        return pSchlüssel%pmod;
    }

    public int fuegeEin(int pSchlüssel, double Wert){


        return 0;
    }

    public int suchePositionVon(int pSchlüssel){


        return 0;
    }

    public int fuegeEin2(int pSchlüssel) {
        return 0;
    }

    public int [] gibZahlen(){

       return zahlen;
    }

    public double [] gibZahlen1(){

        return zahlen2;
    }

    public double gibWertVon(int pGeburtsdatum){

     return 0;
    }
}
