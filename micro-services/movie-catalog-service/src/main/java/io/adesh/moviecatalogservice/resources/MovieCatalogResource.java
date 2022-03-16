package io.adesh.moviecatalogservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import io.adesh.moviecatalogservice.models.CatalogItem;
import io.adesh.moviecatalogservice.models.Movie;
import io.adesh.moviecatalogservice.models.Rating;
import io.adesh.moviecatalogservice.models.UserRating;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource{

    @Autowired
    private RestTemplate restTemplate;
    

    @Autowired
    private WebClient.Builder webClinentBuilder;

    @RequestMapping("/{userId}")    
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId, String description, int rating){
        

        UserRating ratings = restTemplate.getForObject("http://localhost:8083/ratingsdata/foo" + userId, UserRating.class);

        return ratings.getUserRating().stream().map(rate -> {
                    
            Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rate.getMovieId(), Movie.class);
            
            return new CatalogItem(movie.getName(), "Desc", rate.getRating());
        })
        .collect(Collectors.toList());
        
    } 
    
    // Movie movie = webClinentBuilder.build()
    //         .get()
    //         .uri("http://localhost:8082/movies/" + rate.getMovieId())
    //         .retrieve()
    //         .bodyToMono(Movie.class)
    //         .block();
    
}