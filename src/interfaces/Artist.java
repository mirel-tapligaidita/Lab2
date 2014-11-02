package interfaces;

import exceptions.MyException;

/**
 * Created by Mirel on 29.10.2014.
 *
 * This is the "Artist" interface with 2 methods
 */
public interface Artist {

    /* This is the action of performing */
    public void perform() throws MyException;
    /* This is the method that allows an artist to take a well deserved holiday*/
    public void relax() throws MyException;

}
