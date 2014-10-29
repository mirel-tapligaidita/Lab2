package interfaces;

import exceptions.MyException;

/**
 * Created by Mirel on 29.10.2014.
 */
public interface Artist {

    /* This is the method that shows if an artist is still performing or not at the moment */
    public boolean isHePerforming() throws MyException;
    /* This is the method that show if an artist is retired or not*/
    public boolean isHeRetired() throws MyException;

}
