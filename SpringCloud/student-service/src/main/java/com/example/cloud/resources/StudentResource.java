package com.example.cloud.resources;

import com.example.cloud.models.Student;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 28/12/17 5:28 AM
 */
@RestController
public class StudentResource {

    @RequestMapping(value = "/echoStudentName/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name) {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : "
            + new Date();
    }

    @RequestMapping(value = "/getStudentDetails/{name}")
    public Student getStudentDetails(@PathVariable(name = "name") String name) {
        return new Student(name, "Pune", "MCA");
    }
}
