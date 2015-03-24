/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Niels
 */
public class ReadJson {
    private final static String WIKIPEDIA_QUERY = "https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&exintro=&explaintext=&titles=";
   
    private static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
      sb.append((char) cp);
    }
    return sb.toString();
  }

  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
    InputStream is = new URL(url).openStream();
    try {
      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      String jsonText = readAll(rd);
      JSONObject json = new JSONObject(jsonText);
      return json;
    } finally {
      is.close();
    }
  }
  
  public static String getDescriptionFromWiki(String search) throws IOException{
      JSONObject jo = readJsonFromUrl(WIKIPEDIA_QUERY + search);
      jo = jo.getJSONObject("query").getJSONObject("pages");
      for(String key : jo.keySet()){
          jo = jo.getJSONObject(key);
      }
      return jo.has("extract") ? jo.getString("extract"): "No description found.";
  }
}
