package Lab_05;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONObject employeeDetails1 = new JSONObject();
        employeeDetails1.put("firstName", "Dang");
        employeeDetails1.put("lastName", "Kim Thi");
        employeeDetails1.put("website","codelean.vn");

        JSONObject employeeObj1 = new JSONObject();
        employeeObj1.put("employee",employeeDetails1);

        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Code");
        employeeDetails2.put("lastName", "Lean");
        employeeDetails2.put("website","codelean.com");

        JSONObject employeeObj2 = new JSONObject();
        employeeObj2.put("employee",employeeDetails2);

        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObj1);
        employeeList.add(employeeObj2);

        try (FileWriter file = new FileWriter("JsonFile/employee.json")){
            file.write(employeeList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}