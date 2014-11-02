package artists;

import interfaces.Artist;

/**
 * Created by Mirel on 29.10.2014.
 */
public abstract class Actor {

    /* This is the name of the actor */
    private String mName;
    /* This is the current activity of the actor */
    private String mCurrentActivity;

    /* This is the default constructor */

    public Actor(String Name, String Activity) {
        this.mName = Name;
        this.mCurrentActivity = Activity;
    }

    public String getmCurrentActivity() {
        return mCurrentActivity;
    }

    public void setmCurrentActivity(String mCurrentActivity) {
        this.mCurrentActivity = mCurrentActivity;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    /* This is the abstrac method to film an episod/day */
    public abstract void film();

}
