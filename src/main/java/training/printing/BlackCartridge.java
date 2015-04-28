package training.printing;

/**
 * Created by sczerwinski on 2015-04-28.
 */
public class BlackCartridge implements ICartridge {
    @Override
    public String getFillPercentage() {
        return "50%";
    }

    @Override
    public String toString(){
        return "BlackWhite!";
    }
}
