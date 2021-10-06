package by.tms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data @AllArgsConstructor @NoArgsConstructor
public class User {


    private long id;

    @NotBlank
    @Size(min = 4)
    private String name;

    @NotBlank
    @Size(min = 4)
    private String username;

    @NotBlank
    @Size(min = 4)
    private String password;

}
