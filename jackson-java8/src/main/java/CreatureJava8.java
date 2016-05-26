import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
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
public class CreatureJava8 {

    private String name;
    private Integer age;
    private LocalDate birthday;
    private LocalDateTime createdAt;
    private Instant createdAtInstant;

    public static void main(String[] args) throws IOException {
        final String creatureJson = "{\"name\": \"dragon\", \"age\": \"3100\", \"birthday\": \"2010-08-14\"," +
                "\"createdAt\": \"2010-08-14T13:10:05Z\", \"createdAtInstant\": \"2010-08-14T13:10:05Z\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        JavaTimeModule javaTimeModule = new JavaTimeModule();

        objectMapper.registerModule(javaTimeModule);

        CreatureJava8 creature = objectMapper.readValue(creatureJson, CreatureJava8.class);
        System.out.println(creature);
    }

}
