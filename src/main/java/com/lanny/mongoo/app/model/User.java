package com.lanny.mongoo.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
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
@Document(collection = "users")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    private String id;

    @NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
    private String title;

    private Boolean completed = false;

    private Date createdAt = new Date();

    public User(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, title='%s', completed='%s']",
                id, title, completed);
    }
}
