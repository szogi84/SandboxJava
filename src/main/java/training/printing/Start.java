package training.printing;

/**
 * Created by sczerwinski on 2015-04-27.
 */
public class Start {
    public static void main(String[] args){
//        Imachine machine = new Printer(true,"MY PRINTER");
//        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,"MY PRINTER",new ColorCartridge());
        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,"MY PRINTER",ColorCartridge.RED);
        printer.turnOn();
        printer.loadPaper(3);
        //printer.print(4);
        //myPrinter.loadPaper(1);
        try {
            printer.print(2);
            //List
            //printer.outputPages();
            //Map
            printer.outputPage(2);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally{
            printer.turnOff();
        }

        switch (printer.getCartridge()){
            case RED:
                System.out.println("RED");
                break;
        }
        for (ColorCartridge cartridge:ColorCartridge.values()){
            System.out.println(cartridge.printColor());
        }

        //printer.printUsingCartridge(new ColorCartridge(), "Printing using cartridge");
    }
//    public static void printOne(Printer<? extends ICartridge> printer){
//        String fillPercentage = printer.getCartridge().getFillPercentage();
//        System.out.println(fillPercentage);
//    }

}
