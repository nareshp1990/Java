package com.example.cloud.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 28/12/17 5:26 AM
 */
@Data
@AllArgsConstructor()
@NoArgsConstructor
@ToString
public class Student {
    private String name;
    private String address;
    private String cls;
}
