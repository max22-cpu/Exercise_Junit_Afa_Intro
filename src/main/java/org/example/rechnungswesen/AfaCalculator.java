package org.example.rechnungswesen;

public class AfaCalculator {

    public float calculate(float anschaffungswert,
                           int nutzungsdauer,
                           boolean halbjahres){

        if(anschaffungswert <=1000 && anschaffungswert > 0)
            return anschaffungswert;

        if(anschaffungswert < 0 || nutzungsdauer <=0)
            throw new IllegalArgumentException();

       float afa =  anschaffungswert/nutzungsdauer;

       return  halbjahres ? afa/2.0F : afa;



    }
}
