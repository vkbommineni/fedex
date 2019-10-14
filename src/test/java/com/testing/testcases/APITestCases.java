package com.testing.testcases;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertNotNull;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

public class APITestCases {

	/* Test case to verify Get call*/
	@Test
	public void test_Get_Response() {

		Object jsonResult = given().when().get("https://jsonplaceholder.typicode.com/posts/1").then().assertThat()
				.statusCode(200);

		assertNotNull(jsonResult);
	}

	/* Test case to verify Post call*/
	@Test
	public void test_Post_Response() {

		Map<String, String> request = new HashMap<>();
		request.put("title", "foo");
		request.put("body", "bar");
		request.put("userId", "1");

		Object jsonResult = given().contentType("application/json; charset=UTF-8").body(request).when()
				.post("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(201);
		
		assertNotNull(jsonResult);
	}

}