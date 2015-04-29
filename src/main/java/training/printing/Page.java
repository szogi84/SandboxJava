package training.printing;

/**
 * Created by sczerwinski on 2015-04-29.
 */
public class Page {
    private String printedText;

    public Page(String text){
        printedText=text;
    }
    public String getText(){
        return printedText;
    }
}
