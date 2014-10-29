package artists;

import interfaces.Artist;

/**
 * Created by Mirel on 29.10.2014.
 */
public abstract class Actor{

    /* This is the name of the actor */
    private String Name;

    /* This is the default constructor */

    public Actor(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public abstract boolean isHeFilming();
}
