package com.springinaction.springidol;

import java.util.Collection;

public class OneManBand implements Performer {

    private Collection<Instrument> instruments;

    public OneManBand() {
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments; // Внедрение коллекции инструментов
    }

    public void perform() {
        for(Instrument instrument : instruments)
            instrument.play();
    }


}
