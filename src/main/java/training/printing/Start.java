package training.printing;

/**
 * Created by sczerwinski on 2015-04-27.
 */
public class Start {
    public static void main(String[] args){
//        Imachine machine = new Printer(true,"MY PRINTER");
        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,"MY PRINTER",new ColorCartridge());
        printer.turnOn();
        printer.loadPaper(1);
        //printer.print(4);
        //myPrinter.loadPaper(1);
        //myPrinter.print(2);
        printer.printUsingCartridge(new ColorCartridge(), "Printing using cartridge");
    }
}
