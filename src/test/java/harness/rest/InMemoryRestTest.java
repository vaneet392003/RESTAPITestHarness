package test.java.harness.rest;

import static org.junit.Assert.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import test.java.harness.object.OrderRequestObj;


public class InMemoryRestTest {

    @Path("myresource")
    public static class MyResource {

        @POST
        @Consumes(MediaType.TEXT_PLAIN)
        @Produces(MediaType.APPLICATION_XML)
        public OrderRequestObj createOrder(String customerNo) {

            return new OrderRequestObj();
        }

    }

    public static MyResource sut = new MyResource();
    public static InMemoryRestServer server;

    @BeforeClass
    public static void beforeClass() throws Exception {
        server = InMemoryRestServer.create(sut);
    }

    @AfterClass
    public static void afterClass() throws Exception {
        server.close();
    }

    @Test
    public void getSimpleBody() throws Exception {
    	String searchQueryApi = "http://35.244.107.6/restapi/api/order?customerNo=12345";
    	HttpResponse<String> response6 = Unirest.get(searchQueryApi).asString();
    	System.out.println(response6.getBody());         // gives the full json response
        assertEquals(Response.Status.CREATED.getStatusCode(), response6.getStatus());
    }
}
