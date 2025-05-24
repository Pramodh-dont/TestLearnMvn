package APITestingRestAssured;

import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.ArgumentMatchers.notNull;
import static org.mockito.Mockito.when;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.devtools.v133.debugger.Debugger.RestartFrameMode;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Given;
import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.build.Plugin.Engine.Source.Empty;
import net.bytebuddy.implementation.bytecode.Duplication;

import static io.restassured.RestAssured.*;

public class SampleRunAPI {
	@Test(priority = 1)
	public void testSuccesscode() {
		Response response = given().when().get("https://www.google.com/");
		int a = response.statusCode();
		System.out.println(a);
		Assert.assertEquals(a, 200);

	}
	@Test(priority =2)
	public static void testGetMethod() {
		Response response = RestAssured.given().headers("x-api-key", " reqres-free-v1").get("https://reqres.in/api/users");
		int responsecode = response.getStatusCode();
		if(responsecode>=200&&responsecode<=299) {
			System.out.println(responsecode+" - passed\n"+response.asPrettyString());
		}
		else {
			System.err.println(responsecode+" - Failed\n" +response.asPrettyString());
		}
	}
	@Test(priority = 3)
	public static void testPostMethodWithBody() {
		JsonObject json = new JsonObject();
		json.addProperty("name", "morpheus");
		json.addProperty("job", "leader");
		System.out.println(json.toString());
		Response response = given().headers("x-api-key", " reqres-free-v1").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(json).post("https://reqres.in/api/users");
		int a = response.statusCode();
		Assert.assertEquals(201, a);
	}
	@Test(priority =4)
	public static void testHeadMethod() {
		Response response = RestAssured.given().headers("x-api-key", " reqres-free-v1").head("https://reqres.in/api/users");
		String res= response.prettyPrint();
		int rtime=(int) response.timeIn(TimeUnit.MILLISECONDS);
		System.out.println(rtime+" MilliSeconds");
		String Empty ="";
		if( res==Empty) {
			System.out.println("No body as expected");
		}
		else {
			System.err.println("Body is present, so failed");
		}
	}
}
