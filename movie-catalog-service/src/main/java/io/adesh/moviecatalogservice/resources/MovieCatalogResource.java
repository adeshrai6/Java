package io.adesh.moviecatalogservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Collections;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource{

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        return Collections.singletonList(
            new CatalogItem("Trans", "Test", 4)
        );
    } 

}