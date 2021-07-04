package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class sd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				 
			 RestAssured.baseURI="http://216.10.245.166";
			String lib = given().header("Content-Type","application/json").body(bod.addbk("bcdsa34","231")).
					when().post("Library/Addbook.php").then().statusCode(200).
			extract().response().asString();
			//JsonPath js =new JsonPath(lib);
		JsonPath js =	Reusablemethods.jsn(lib);
			String id =js.get("ID");
			System.out.println(id);

	
	}
}
	
