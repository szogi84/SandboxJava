package training.printing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sczerwinski on 2015-04-27.
 */
public class Printer<T extends ICartridge> implements Imachine {//extends Machine {
    private String modelNumber;
    private PaperTray paperTray = new PaperTray();
    private Machine machine;
    private T cartridge;
    private List<Page> pages = new ArrayList<Page>();
    private Map<Integer,Page> pagesMap = new HashMap<Integer, Page>();
    public Printer(boolean isOn, String modelNumber,T cartridge) {

        //super(isOn);
        machine = new Machine(isOn);
        this.modelNumber = modelNumber;
        this.cartridge=cartridge;
    }

    @Override
    public boolean isOn() {
        return machine.isOn();
    }

    public void print(int copies) {
        checkCopies(copies);

        System.out.println(cartridge.toString());
        String onStatus = "";
        if (machine.isOn())
            onStatus = " is on!";
        else
            onStatus = " is off!";

        String textToPrint = modelNumber + onStatus;
        int pageNumber=1;
        while (copies > 0 && !paperTray.isEmpty()) {
//            System.out.println(textToPrint);
//            pages.add(new Page(textToPrint));
            pagesMap.put(pageNumber,new Page(textToPrint + ":" + pageNumber));
            copies--;
            paperTray.usePage();
            pageNumber++;
        }
        if (paperTray.isEmpty()){
            System.out.println("Load more paper");
        }


    }
    //List
    public void outputPages(){
        for (Page currentPage:pages){
            System.out.println(currentPage.getText());
        }
    }
    //Map
    public void outputPage(int pageNumber){
        System.out.println(pagesMap.get(pageNumber).getText());
    }

    private void checkCopies(int copies) {
        if (copies<=0){
            throw new IllegalArgumentException ("Cannot print negative or 0 value of copies");
        }
    }

    @Override
    public void turnOn() {
//        System.out.println("Warming up print engine");
        //super.turnOn();
        machine.turnOn();
    }

    @Override
    public void turnOff() {
//        System.out.println("Turned off");
        machine.turnOff();
    }

    public void printColors(){
        String[] colors = new String[]{"Red"};
        for (String currentColor:colors){
            System.out.println("Color: "+currentColor);
        }
    }

    public void loadPaper(int i) {
        paperTray.addPages(i);
    }
    public <U extends ICartridge> void printUsingCartridge(U cartridge, String message){
        System.out.println(cartridge.toString());
        System.out.println(message);
        System.out.println(cartridge.getFillPercentage());
    }

    public T getCartridge() {
        return cartridge;
    }
}
