package com.example.jackson.views;

import com.example.jackson.views.models.Item;
import com.example.jackson.views.models.Views;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 30/12/17 4:09 PM
 */
@RestController
public class JacksonViewsController {

    @JsonView(Views.Public.class)
    @RequestMapping("/items/{id}")
    public Item getItemPublic(@PathVariable int id) {
        return new Item(10, "Santhoor", "Wipro");
    }

    @JsonView(Views.Internal.class)
    @RequestMapping("/items/internal/{id}")
    public Item getItemInternal(@PathVariable int id) {
        return new Item(10, "Santhoor", "Wipro");
    }

}
