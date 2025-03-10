package RestAssured_Day1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;

/*
 * given() 
 *     content type, set cookies, add auth, add param, set headers 
 * when()
 *     get, post, put, delete 
 * then()
 *     validate status code, validate response body, and cookies.       
 */

public class HTTPRequests {
	
	@Test
	void getUsers()
	{
		given()
		
		.when()
		     .get("https://regres.in/api/users?page=2")
		
		.then()
		     .statusCode(200)
		     .body("page",equalTo(2))
		     .log().all();
	}
	
	@Test
	void CreateUser()
	
	{
	
	HashMap data = new HashMap();
	data.put("name", "rohit");
	data.put("job", "cricketer");

		given()
		   .contentType("application/json")
		   .body(data)
		
		.when()
		    .post("https://regres.in/api/users")
		
		.then()
		.statusCode(201)
		.log().all();
	}

}
