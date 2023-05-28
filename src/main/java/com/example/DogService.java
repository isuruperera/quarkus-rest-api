package com.example;

import com.example.beans.DogFact;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/v2")
@RegisterRestClient(configKey = "dog-api")
public interface DogService {
    @GET
    @Path("/facts")
    DogFact getDogFact(@QueryParam("limit") int number);
}
