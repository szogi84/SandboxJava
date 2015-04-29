package training.printing;

/**
 * Created by sczerwinski on 2015-04-28.
 */
public enum ColorCartridge implements ICartridge {
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green");

    private String colorText;

    private ColorCartridge(String colorText){

        this.colorText = colorText;
    }

    @Override
    public String toString(){
        return "Color!";
    }

    @Override
    public String getFillPercentage() {
        return "90%";
    }

    public String printColor() {
        return colorText;
    }


}
