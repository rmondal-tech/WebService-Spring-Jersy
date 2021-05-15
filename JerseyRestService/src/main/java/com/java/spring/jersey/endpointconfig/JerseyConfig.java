package com.java.spring.jersey.endpointconfig;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.java.spring.jersey.endpoint.MyJerseyEndpoint;
import com.java.spring.jersey.endpoint.MyJerseyEndpoint2CustomException;
import com.java.spring.jersey.error.PersonDataNotFoundExceptionMapper;

/*To get started with Jersey, include the spring-boot-starter-jersey as a dependency
 and then you need one @Bean of type ResourceConfig in which you register all the
 endpoints, as shown in the following example:
 */

/*By default, the Jersey servlet is registered and mapped to /*. 
You can change the mapping by adding @ApplicationPath to your ResourceConfig.@ApplicationPath("/api")
after this resouce is accesible at http://localhost:8080/api/...
 */

/* 
 1. endpoints should be registered individually by using the register method
 2. exception mapper also needs to be registered if @provider does not work
 **/

@Component
public class JerseyConfig extends ResourceConfig {

	 public JerseyConfig() {
	        register(MyJerseyEndpoint.class);
	        register(MyJerseyEndpoint2CustomException.class);
//Register exception mapper class
	        register(PersonDataNotFoundExceptionMapper.class);

	        
	    }

}
