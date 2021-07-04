package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;



public class api {


	
	@Test
	
	public void addbook() {
//	 RestAssured.baseURI="http://216.10.245.166";
//	String lib = given().log().all().header("Content-Type","application/json").body(bod.addbk()).
//			when().post("Library/Addbook.php").then().log().all().statusCode(200).
//	extract().response().asString();
	//JsonPath js =new JsonPath(lib);
//JsonPath js =	Reusablemethods.jsn(lib);
//	String id =js.get("ID");
//	System.out.println(id);
		System.out.println("test");
	}
}


