package restApi;

import org.json.JSONException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping(path="/currencies")
public class currencyController
{
    @RequestMapping(value = "/get-current-currency-value-command", method = RequestMethod.GET)
    public String get_currency(@RequestParam String currency) throws IOException, JSONException {
        JsonReader json = new JsonReader();
        String result = json.readJsonFromUrl("http://api.nbp.pl/api/exchangerates/tables/A?format=json" ,String.format(currency));
        return result;
    }
}
