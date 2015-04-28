package training.printing;

/**
 * Created by sczerwinski on 2015-04-27.
 */
public class PaperTray {

    int pages = 0;
    public void addPages(int count){
        pages+=count;
    }
    public void usePage(){
        pages--;
    }
    public boolean isEmpty(){
        if (pages>0) {
            return false;
        } else{
            return true;
        }
        //return (pages>0);
    }
}
