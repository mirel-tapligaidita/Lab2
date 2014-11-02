package artists;

import exceptions.MyException;
import interfaces.Artist;

/**
 * Created by Mirel on 29.10.2014.
 */
public class MoviesActor extends Actor implements Artist {


    /*This is the number of days filmed */
    private int mDaysOfFilming;

    public MoviesActor(String Name, String Activity) {
        super(Name, Activity);
        setMdaysOfFilming(0);
    }

    public int getMdaysOfFilming() {
        return mDaysOfFilming;
    }

    public void setMdaysOfFilming(int mdaysOfFilming) {
        this.mDaysOfFilming = mdaysOfFilming;
    }
    
    @Override
    public void film() {
        setMdaysOfFilming(getMdaysOfFilming() + 1);
    }

    @Override
    public void perform() throws MyException {
        if (getName() == null)
            throw new MyException("The name of the artist is invalid");
        // System.out.println(getName() + " is not in the database");
        film();
    }

    @Override
    public void relax() throws MyException {
        if (getName() == null)
            throw new MyException("The name of the artist is invalid");
        // System.out.println(getName() + " is not in the database");
        if (getMdaysOfFilming() == 100) {
            System.out.println("Trimestru incheiat! Filmarile se vor relua");
            setMdaysOfFilming(0);
        } else System.out.println("Trimestru inca nu s-a incheiat!");
    }

}
