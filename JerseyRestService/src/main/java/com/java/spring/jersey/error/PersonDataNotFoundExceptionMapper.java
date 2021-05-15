package com.java.spring.jersey.error;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
/*Before talking about exception mapper, we first need to understand the concept of provider. Providers in JAX-RS are
 responsible for various cross-cutting concerns such as filtering requests, converting representations into Java objects,
mapping exceptions to responses, etc. By default, a single instance of each provider class is instantiated for each JAX-RS
 application, aka singletons.

Interface ExceptionMapper<E extends Throwable> defines a contract for a provider that maps Java exceptions E to Response.
Same as other providers, exception mappers can be either pre-packaged in the JAX-RS runtime or supplied by an application.
In order to create your own exception mapper, you need to create a class which implements interface ExceptionMapper

When an exception of type PersonDataNotFoundCustomException thrown by a JAX-RS resource, this exception mapper can catch the exception and transform it into a HTTP NOT_FOUND response, with the origin exception message as entity.
*/

@Provider
public class PersonDataNotFoundExceptionMapper implements ExceptionMapper<PersonDataNotFoundCustomException>{
	
	public Response toResponse(PersonDataNotFoundCustomException ex)
	{
		return Response.status(Status.NOT_FOUND)
				.entity(new DisplayCustomException("404", ex.getMessage()))
				.build();
	}
}