package main;

import artists.Actor;
import artists.MoviesActor;
import artists.TVSeriesActor;
import exceptions.MyException;
import interfaces.Artist;

import java.util.List;

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

        Artist artist = new MoviesActor("Morgan Freeman","Bruce Almighty");
        TVSeriesActor tvSeriesActor = new TVSeriesActor("Michael C. Hall","Dexter");
        Actor actor = new TVSeriesActor("Charlie Sheen","Two and a half men");


        try {
            artist.perform();
        } catch (MyException e) {
            System.out.println("Exception on performing activity: " + e.getMessage());

        }

        /* Un actor filmeaza mai multe episoade */
        try {
            tvSeriesActor.perform();
            tvSeriesActor.perform();
            tvSeriesActor.perform();
            tvSeriesActor.perform();
        } catch (MyException e) {
            System.out.println("Exception on performing activity: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            ((Artist) actor).perform();
        } catch (MyException e) {
            System.out.println("Exception on performing activity: " + e.getMessage());
        }

        /* Se afiseaza numarul episoadelor filmate */
       System.out.println(tvSeriesActor.getmEpisodeNumber());

        /* Se incearca sa se "relaxeze un actor */
        try {
            tvSeriesActor.relax();
        } catch (MyException e) {
            e.printStackTrace();
        }

        /* Se seteaza numarul de episoade la 12(limita pentru un sezon) */
        tvSeriesActor.setmEpisodeNumber(12);

        /* Se afiseaza numarul episoadelor filmate */
        System.out.println(tvSeriesActor.getmEpisodeNumber());

        /* Se incearca sa se "relaxeze un actor, in cazul succesului numarul de episoade va fi resetat la 0 */
        try {
            tvSeriesActor.relax();
        } catch (MyException e) {
            e.printStackTrace();
        }

        /* Se afiseaza numarul episoadelor filmate din noul sezon */
        System.out.println(tvSeriesActor.getmEpisodeNumber());


    }
}
