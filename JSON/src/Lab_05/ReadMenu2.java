package Lab_05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadMenu2 {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("JsonFile/menu2.json")){
            Object obj = jsonParser.parse(reader);

            JSONObject objJson = (JSONObject)obj;

            JSONObject objMenu = (JSONObject)objJson.get("menu");

            System.out.println("menu : ");

            String header = (String)objMenu.get("header");

            System.out.println("\theader : " + header);
            System.out.println("\titems : ");

            JSONArray itemsList = (JSONArray)objMenu.get("items");

            itemsList.forEach(item -> parseItemObj((JSONObject)item));

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }

    private static void parseItemObj(JSONObject item){
        if (item == null){
            System.out.println("-------");
        }
        else {
            System.out.println("id : " + (String)item.get("id"));
        }
    }}
