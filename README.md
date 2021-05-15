# WebService- Jersey- Spring Boot

Demo of a Standard Restful WebService created using Spring Boot 2.4.5

1. Endpoint to handle a simple request without any information passed from request - http://localhost:8080/hello

2. Endpoint to handle a request with pathparam - http://localhost:8080/hello/<pathparam1> , ex. http://localhost:8080/hello/rahul

3. Endpoint returning an Java Object. Also use of jaxb mapper in this case

4. Endpoint Returning a HttpEntity<T> which can return responsebosy + headers (optional).
