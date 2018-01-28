package com.example.jackson.views.models;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 30/12/17 4:07 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @JsonView(Views.Public.class)
    private int id;
    @JsonView(Views.Public.class)
    private String itemName;
    @JsonView(Views.Internal.class)
    private String ownerName;

}
