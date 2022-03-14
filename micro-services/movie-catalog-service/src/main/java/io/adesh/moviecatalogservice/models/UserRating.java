package io.adesh.moviecatalogservice.models;

import java.util.List;

public class UserRating {
    private List<Rating> userRatings;

    public List<Rating> getUserRating() {
        return userRatings;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRatings = userRating;
    }
    
}
