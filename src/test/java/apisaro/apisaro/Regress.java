  package apisaro.apisaro;
  import org.testng.annotations.Test;
  import io.restassured.RestAssured;
  public class Regress {
	@Test
	public void post() {
		String jshonBody="{\r\n"+ " \"name\": \"morpheus\",\r\n"+ "  \"job\": \"leader\"\r\n"+ "}";
		RestAssured.given().body(jshonBody).when().post("https://reqres.in/api/users").then().statusCode(201);
		}
	@Test
	public void put() {
		String jshonbody="{\r\n"+ "    \"name\": \"morpheus\",\r\n"+ "    \"job\": \"zion resident\"\r\n"+ "}";
		RestAssured.given().body(jshonbody).when().put("https://reqres.in/api/users/2").then().statusCode(200);
		}
	@Test
   public void get() {
		RestAssured.when().put("https://reqres.in/api/users/2").then().statusCode(200);
		}
	@Test
	   public void delete() {
			RestAssured.when().delete("https://reqres.in/api/users/972").then().statusCode(204);
	}		
		
}
