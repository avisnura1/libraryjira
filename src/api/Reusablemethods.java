package api;

import io.restassured.path.json.JsonPath;

public class Reusablemethods {
	
	public static JsonPath  jsn (String inp)
	{
		JsonPath js =new JsonPath(inp);
		return js;
	
}
}