package com.java.spring.jersey.endpoint;




import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.java.spring.jersey.error.PersonDataNotFoundCustomException;
import com.java.spring.jersey.model.Details;

//import javax.ws.rs.core.Response;

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
@Path("/hello2")
public class MyJerseyEndpoint2CustomException {
 //ResponseEntity- body +status
	
	@GET
@Produces("application/json")
	    public ResponseEntity<Details> message1() {
		//  Details details=new Details("Rahul", "Palongpur");
		
		Details details = null;
//		details.getUsername(); //java.lang.NullPointerException.Rest Service Response by default handles , but not enough
	
		if(details==null)
		 throw new PersonDataNotFoundCustomException("My custom PersonDataNotFoundCustomException thrown ");
		 
		
		return new ResponseEntity<Details>(details, HttpStatus.OK);
  

			
	
	    }
	  
}
//------------------------------------------------------------------------------------------------
/*
Lets assume you have following ressource method, thowing the exception:

@Path("items/{itemid}/")
public Item getItem(@PathParam("itemid") String itemid) {
  Item i = getItems().get(itemid);
  if (i == null) {
    throw new CustomNotFoundException("Item, " + itemid + ", is not found");
  }

  return i;
}
//Create your exception class:

public class CustomNotFoundException extends WebApplicationException {

  public CustomNotFoundException() {
    super(Responses.notFound().build());
  }

  
  public CustomNotFoundException(String message) {
    super(Response.status(Responses.NOT_FOUND).
    entity(message).type("text/plain").build());
  }
}
//Now add your exception mapper:

@Provider
public class EntityNotFoundMapper implements ExceptionMapper<CustomNotFoundException> {
  public Response toResponse(CustomNotFoundException  ex) {
    return Response.status(404).
      entity("Ouchhh, this item leads to following error:" + ex.getMessage()).
      type("text/plain").
      build();
  }
}
//In the end you have to register your exception mapper, so it can be used in your application. Here is some pseudo-code:

register(new EntityNotFoundMapper());
//or
register(EntityNotFoundMapper.class);

*/