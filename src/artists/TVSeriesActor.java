package artists;

import exceptions.MyException;
import interfaces.Artist;

/**
 * Created by Mirel on 29.10.2014.
 */
public class TVSeriesActor extends Actor implements Artist {

    /*This is the episode number*/
    private int mEpisodeNumber;

    public TVSeriesActor(String Name, String Activity) {
        super(Name, Activity);
        setmEpisodeNumber(0);
    }

    public int getmEpisodeNumber() {
        return mEpisodeNumber;
    }

    public void setmEpisodeNumber(int mEpisodeNumber) {
        this.mEpisodeNumber = mEpisodeNumber;
    }

    @Override
    public void film() {
        setmEpisodeNumber(getmEpisodeNumber()+1);
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
        if (getmEpisodeNumber() == 12) {
            System.out.println("Sezon incheiat! Filmarile se vor relua");
            setmEpisodeNumber(0);
        } else System.out.println("Sezonul inca nu s-a incheiat!");
    }


}
