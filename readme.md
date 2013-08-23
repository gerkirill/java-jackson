# Demo application which reads json data.

 - Libraries used: https://github.com/FasterXML
 - outdated examples (just in case): http://www.mkyong.com/java/how-to-convert-java-map-to-from-json-jackson/
 - Example data:
        {
          "name" : { "first" : "Joe", "last" : "Sixpack" },
          "gender" : "MALE",
          "verified" : false,
          "userImage" : "Rm9vYmFyIQ=="
        }

Compile and run from command line:

	javac -cp ".:lib/*" ./HelloWorld.java
	java -cp ".:lib/*" HelloWorld