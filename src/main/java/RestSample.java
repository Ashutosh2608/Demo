import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class RestSample {

	private String message;
	
	private String get;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getGet() {
		return get;
	}
	public void setGet(String get) {
		this.get = get;
	}
	

	public void gitsample(String get) {
		this.get = get;
	}
	


@Test
public void detail() {
	RestSample rs = new RestSample();
	rs.setMessage("Hi");
	rs.setMessage("Ashu");
	
	
	String res=given().body(rs).when().post("http://localhost:8080/RestSample").then().extract().response().asString();
	System.out.println(res);
	
}






}