package restApi;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1)
        {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static String readJsonFromUrl(String url, String val) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
        String jsonText = readAll(rd);
        String result = null;
        JSONArray jsonarray = new JSONArray(jsonText);
        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            JSONArray jsonArrayRates = new JSONArray(jsonobject.getString("rates"));
            for (int j = 0; j < jsonArrayRates.length(); j++) {
                JSONObject jsonobjectRates = jsonArrayRates.getJSONObject(j);
                String code = jsonobjectRates.getString("code");
                String mid = jsonobjectRates.getString("mid");
                if ( code.equals(val) )
                {
                    result = mid;
                }
            }
        }
        return result;
    }
}
