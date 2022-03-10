package io.adesh.moviecatalogservice.models;

public class Rating {
    private String movieId;
    private int ratings;

    public Rating(String movieId, int rating){
        this.movieId = movieId;
        this.ratings = rating;
    }

    public String getMovieId(){
        return movieId;
    }
    public void setMovieId(String movieId){
        this.movieId = movieId;
    }

    public int getRating(){
        return ratings;
    }

    public void setRating(int rating){
        this.ratings = rating;
    }

}
