package api;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Jsonfromfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 RestAssured.baseURI="https://rahulshettyacademy.com";
			String lib = given().queryParam("key","qaclick123")
					.header("Content-Type","application/json")
					.body((Files.readAllBytes(Paths.get("F:\\selenium\\Arun\\API testing videos\\addapi.json")))).
					when().post("maps/api/place/add/json").then().statusCode(200).
			extract().response().asString();
			//JsonPath js =new JsonPath(lib);
		JsonPath js =	Reusablemethods.jsn(lib);
			String id =js.get("place_id");
			System.out.println(id);
	}

}
