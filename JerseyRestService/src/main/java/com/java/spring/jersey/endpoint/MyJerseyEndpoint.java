package com.java.spring.jersey.endpoint;

import java.net.URI;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import com.java.spring.jersey.model.Details;

import ch.qos.logback.core.status.Status;

/* All the registered endpoints should be @Components with HTTP resource annotations
  (@GET and others), as shown in the following example:
*/


/**
 * @author LENOVO
 *
 */
/**
 * @author LENOVO
 *
 */
@Component
@Path("/hello")
public class MyJerseyEndpoint {
	ArrayList<Details> personDetailslist = new ArrayList<Details>();
	
	/*
	 * //http://localhost:8080/hello
	 * 
	 * @GET public String message() { return "Hello"; }
	 * 
	 */
//with pathparam -http://localhost:8080/hello/pathparam1
	  @GET
		@Path("{name}")
		@Produces("text/plain")
		public Response getHuman(@PathParam("name") String name) {

			return Response.accepted("Hello- " + name + " api called successfully.").build();
		}
	  
	
//Read Sub Resource URI Path Parameter using @PathParam  Mapping /hello/rahul/addresses/2	  
//http://localhost:8080/hello/rahul/addresses/221
	  @GET
		@Path("{name}/addresses/{addressId}")
		@Produces("text/plain")
		public Response getAddress(@PathParam("name") String name, @PathParam("addressId") int addressId) {

			return Response.accepted(
					"Hello -" + name + "/addresses/" + addressId + " api called successfully.")
					.build();
		}
	  
	  
		/*
		 * 
		 * @GET public Response message1() {
		 * 
		 * return
		 * Response.status(Response.Status.OK).entity("entiry string object or any object").build();
		 * 
		 * 
		 * }
		 */
	  
	  
	  
//	MediaType needs to be specified when returning an object. also jaxb mapper has to be added in jar 
/*
	  @GET

	  @Produces(MediaType.APPLICATION_JSON) 
	  public Details message1() { 
		  Details
		  details=new Details("Rahul", "Palongpur"); 

		  return details;


	  }

	*/
	  
//HttpEntity<T> can teturn responsebosy + headers. its similar how we used ResponseEntity.
//HttpEntity can be used to create both RequestEntity and ResponseEntity. Where as ResponseEntity 
//is subclassed from HttpEntity with a more elaborative way to send the ResponseObject and it only limited to sending the Response.	  

/*	  
    @GET
	  @Produces(MediaType.APPLICATION_JSON)
	    public HttpEntity<Details> message1() {
		  Details details=new Details("Rahul", "Palongpur");
		
		  HttpHeaders headers = new HttpHeaders();

		 headers .set("dd", "dd");
		 return new HttpEntity<>(deheaderstails,);
		  
	     
	    }
*/
	  
	/*    @GET
		  @Produces(MediaType.APPLICATION_JSON)
		    public HttpEntity<List> message1() {
			  Details details=new Details("Rahul", "Palongpur");
			
			personDetailslist.add(details);
			  HttpHeaders headers = new HttpHeaders();

			  headers.set("dd", "dd");
			 return new HttpEntity<>(personDetailslist,headers);
			  
		     
		    }
	*/    
	  
	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	    public HttpEntity<List> message1() {
	
		  HttpHeaders headers = new HttpHeaders();

		  headers.set("dd", "dd");
		 return new HttpEntity<>(personDetailslist);
		  
	     
	    }
	    @POST
		  @Produces(MediaType.APPLICATION_JSON)
	    @Path("{username}/{address}")
		    public HttpEntity<List> putmessage(@PathParam("username") String username, @PathParam("address") String address) {
			  Details details=new Details(username, address);
			
			personDetailslist.add(details);
			  HttpHeaders headers = new HttpHeaders();

			  headers.set("dd", "dd");
			 return new HttpEntity<>(personDetailslist);
			  
		     
		    }
/*
GET: It represents one or a list of resources or sub resources.
POST: It creates a new resource as represented by URI from the request payload.
PUT: It change an existing resource as represented by URI from the request payload.
DELETE: It delete an existing resource as represented by URI.
HEAD: It has URI similar to GET, but server don’t send any response body. It used mainly to know response headers information.	  
 */
}
