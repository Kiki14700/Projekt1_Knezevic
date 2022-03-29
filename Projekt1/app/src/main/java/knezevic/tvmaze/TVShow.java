package knezevic.tvmaze;

import java.io.Serializable;
import java.util.ArrayList;

public class TVShow implements Serializable {

    private String name;
    private String language;
    private ArrayList<String> genres;

    public TVShow(String name, String language, ArrayList<String> genres) {
        this.name = name;
        this.language = language;
        this.genres = genres;
    }
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {

        this.language = language;
    }

   public ArrayList<String> getGenres() {
        return genres;
    }

   public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
   }



}
