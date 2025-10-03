package poly.lab3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class staff {
    private String id;
    private String fullname;
    @
    private String photo = "photo.jpg";
    @Builder.Default
    private Boolean gender = true;
    @Default
    private Date birthday = new Date();
    @Default
    private Double salary = 12345.6789;
    @Default
    private Integer level = 0;
}
