package io.adesh.moviecatalogservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.adesh.moviecatalogservice.models.CatalogItem;
import io.adesh.moviecatalogservice.models.Movie;
import io.adesh.moviecatalogservice.models.Rating;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource{

    
    @RequestMapping("/{userId}")    
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId, String description, int rating){
        
        RestTemplate restTemplate = new RestTemplate();

        List<Rating> ratings = Arrays.asList(       
             

            new Rating("1234", 4),
            new Rating("4567", 5)
        );

        return ratings.stream().map(mapper -> {
                    
        Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + mapper.getMovieId(), Movie.class);
        return new CatalogItem(movie.getName(), "Desc", mapper.getRating());
        })
        .collect(Collectors.toList());

    } 

    
}