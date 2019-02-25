package com.lanny.mongoo.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Lanny Yao
 * @date 2/20/2019 1:16 PM
 */
@Document(collection = "employees")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    private String id;

    @NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
    private String title;

    private Boolean completed = false;

    private Date createdAt = new Date();

    public Employee(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee[id=%s, title='%s', completed='%s']",
                id, title, completed);
    }
}
