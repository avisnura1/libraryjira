package api;

public class bod {
	public static String addbk(String isbn, String aisle) {
		return "{\r\n"
				+ " \r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n";

}
	public static String Createstory ()
	{
		return"{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"Project\": {\r\n"
				+ "            \"key\": \"API\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \"defect through api automation\",\r\n"
				+ "        \"description\": \"first bug\",\r\n"
				+ "        \"issuetpe\" : {\r\n"
				+ "            \"name\": \"bug\"\r\n"
				+ "        }\r\n";
							
	}
}