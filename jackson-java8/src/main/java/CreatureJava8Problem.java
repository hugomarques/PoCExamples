import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by hugomarques on 5/25/16.
 */
@ToString @Getter @Setter
public class CreatureJava8Problem {

    private String name;
    private Integer age;
    private LocalDate birthday;
    private LocalDateTime createdAt;
    private Instant createdAtInstant;

    public static void main(String[] args) throws IOException {
        final String creatureJson = "{\"name\": \"dragon\", \"age\": \"3100\", \"birthday\": \"2010-08-14\"," +
                "\"createdAt\": \"2010-08-14 13:10:05\", \"createdAtInstant\": \"2010-08-14 13:10:05\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        CreatureJava8Problem creature = objectMapper.readValue(creatureJson, CreatureJava8Problem.class);
        System.out.println(creature);
    }

}
