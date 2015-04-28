package training.printing;

/**
 * Created by sczerwinski on 2015-04-28.
 */
public class ColorCartridge implements ICartridge {
    @Override
    public String toString(){
        return "Color!";
    }

    @Override
    public String getFillPercentage() {
        return "90%";
    }
}
