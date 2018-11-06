package Befehl;

import Empfaenger.Kassensystem;

public class TagesUmsatz implements TagesUmsatzBefehl {
    private Kassensystem kassensystem;
    public TagesUmsatz(Kassensystem kassensystem){
        this.kassensystem = kassensystem;
    }
    @Override
    public String getTagesUmsazt() {
        return kassensystem.getTagesUmsatz();
    }
}
