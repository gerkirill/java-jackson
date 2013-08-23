import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

// packages: https://github.com/FasterXML
// outdated examples: http://www.mkyong.com/java/how-to-convert-java-map-to-from-json-jackson/
// Example data:
/*
    {
      "name" : { "first" : "Joe", "last" : "Sixpack" },
      "gender" : "MALE",
      "verified" : false,
      "userImage" : "Rm9vYmFyIQ=="
    }
*/
public class HelloWorld {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("user.json"));
        String gender = root.get("gender").asText();
        System.out.println(gender);
        boolean verified = root.get("verified").asBoolean();
        if (!verified) {
            System.out.println("User is not verified!");
        }
        String firstName = root.get("name").get("first").asText().toUpperCase();
        System.out.println(firstName);

        //int age = root.get("age").asInt();
//        Map<String,Map> userData = mapper.readValue(new File("user.json"), Map.class);
//        System.out.println(userData);
//        System.out.println(userData.get("gender"));
//        System.out.println(userData.get("verified"));
//        System.out.println(userData.get("name").get("first"));
   }
}
