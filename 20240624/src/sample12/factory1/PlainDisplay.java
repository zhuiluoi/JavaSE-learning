package sample12.factory1;

import java.util.List;

public class PlainDisplay extends Display{
    protected Printer createPrinter() {
        return new PlainPrinter();
    }
}