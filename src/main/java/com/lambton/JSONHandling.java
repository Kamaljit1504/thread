package com.lambton;
import org.json.JSONObject;
import org.json.JSONObject;


public class JSONHandling
{
    public static void main(String[] args) {
        JSONObject obj= new JSONObject();
        obj.put("id",1);
        obj.put("name","Kamal soni");
        obj.put("marks", 100);
        String jsonString=JSONObject.valueToString(obj);

        JSONObject jsonObject= new JSONObject(jsonString);


        System.out.println("StudentID:" +jsonObject.getInt("id"));
        System.out.println("Student Name:" +jsonObject.getString("name"));
        System.out.println("Student Marks:" +jsonObject.getFloat("marks"));


        String userJson = "{\n" +
                "\"id\": 1,\n" +
                "\"name\": \"Leanne Graham\",\n" +
                "\"username\": \"Bret\",\n" +
                "\"email\": \"Sincere@april.biz\",\n" +
                "\"address\": {\n" +
                "\"street\": \"Kulas Light\",\n" +
                "\"suite\": \"Apt. 556\",\n" +
                "\"city\": \"Gwenborough\",\n" +
                "\"zipcode\": \"92998-3874\",\n" +
                "\"geo\": {\n" +
                "\"lat\": \"-37.3159\",\n" +
                "\"lng\": \"81.1496\"\n" +
                "}\n" +
                "},\n" +
                "\"phone\": \"1-770-736-8031 x56442\",\n" +
                "\"website\": \"hildegard.org\",\n" +
                "\"company\": {\n" +
                "\"name\": \"Romaguera-Crona\",\n" +
                "\"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
                "\"bs\": \"harness real-time e-markets\"\n" +
                "}\n" +
                "}";
        JSONObject j=new JSONObject(userJson);
        System.out.println("id " + j.getInt("id"));
        System.out.println("name:"+j.getString("name"));
        System.out.println("UserName"+j.getString("username"));
        System.out.println("Email"+j.getString("Email"));
        JSONObject j=new JSONObject(userJson);




    }
}
