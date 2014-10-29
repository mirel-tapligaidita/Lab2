package artists;

import exceptions.MyException;
import interfaces.Artist;

/**
 * Created by Mirel on 29.10.2014.
 */
public class TVSeriesActor extends Actor implements Artist {

    public TVSeriesActor(String Name) {
        super(Name);
    }


    @Override
    public boolean isHePerforming() throws MyException {
        if (getName() == null)
            throw new MyException("The name of the artist is invalid");
        // System.out.println(getName() + " is not in the database");
        return true;
    }

    @Override
    public boolean isHeRetired() throws MyException {
        if (getName() == null)
            throw new MyException("The name of the artist is invalid");
        // System.out.println(getName() + " is not in the database");
        return true;
    }

    @Override
    public boolean isHeFilming() {
        return true;
    }
}
