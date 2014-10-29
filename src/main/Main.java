package main;

import artists.Actor;
import artists.MoviesActor;
import artists.TVSeriesActor;
import exceptions.MyException;
import interfaces.Artist;

/**
 * Created by Mirel on 29.10.2014.
 */
public class Main {

    /**
     * This is the main function
     *
     * @param args
     */
    public static void main(String[] args) {

        Artist artist=new MoviesActor("Morgan Freeman");
        TVSeriesActor tvSeriesActor=new TVSeriesActor("Michael C. Hall");
        Actor actor=new TVSeriesActor("Gogu Fanel");

        System.out.println("Lista cu numele actorilor: ");

        try {
            artist.isHePerforming();
        } catch (MyException e) {
            System.out.println("Exception on performing activity: " + e.getMessage());

        }

        try {
            tvSeriesActor.isHePerforming();
        } catch (MyException e) {
            System.out.println("Exception on performing activity: " + e.getMessage());
           // e.printStackTrace();
        }

        try {
            ((Artist)actor).isHePerforming();
        } catch (MyException e) {
            System.out.println("Exception on performing activity: " + e.getMessage());
        }

    }
}
