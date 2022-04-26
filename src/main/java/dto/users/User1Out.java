
package dto.users;

import lombok.*;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Builder
@AllArgsConstructor
@JsonSerialize
@NoArgsConstructor
public class User1Out {

    @Getter
    private Long code;
    @Getter
    private String message;
    @Getter
    private String type;

}
