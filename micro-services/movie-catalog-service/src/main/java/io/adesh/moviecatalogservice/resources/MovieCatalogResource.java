package io.adesh.moviecatalogservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.adesh.moviecatalogservice.models.CatalogItem;

import java.util.List;
import java.util.Collections;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource{

    @RequestMapping("/{userId}")    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId, String description, int rating){
        return Collections.singletonList(
            new CatalogItem(userId, "Test", 4)
        );
    } 

    
}