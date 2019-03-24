package restApi;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws IOException, JSONException {
        JsonReader x = new JsonReader();
        System.out.print(x.readJsonFromUrl("http://api.nbp.pl/api/exchangerates/tables/A?format=json", "EUR"));
        ObjectMapper mapper1 = new ObjectMapper();
        //Bar[] bar = mapper1.readValue((DataInput) x.readJsonFromUrl("http://api.nbp.pl/api/exchangerates/tables/A?format=json", "EUR"), Bar[].class);
        SpringApplication.run(Application.class, args);
    }
}
