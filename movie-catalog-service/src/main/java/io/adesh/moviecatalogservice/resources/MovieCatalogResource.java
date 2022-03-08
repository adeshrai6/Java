package io.adesh.moviecatalogservice.resources;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Collections;

@RestController
public class MovieCatalogResource{

    public List<CatalogItem> getCatalog(String userId){
        return Collections.singletonList(
            new CatalogItem("Trans", "Test", 4)
        );
    } 

}