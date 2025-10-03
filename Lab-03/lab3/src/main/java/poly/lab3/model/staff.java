package poly.lab3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class staff {
    private String id;
    private String fullname;

    @Builder.Default
    private String photo = "img.png";

    @Builder.Default
    private Boolean gender = true;

    @Builder.Default
    private Date birthday = new Date();

    @Builder.Default
    private Double salary = 12345.6789;

    @Builder.Default
    private Integer level = 0;
}
