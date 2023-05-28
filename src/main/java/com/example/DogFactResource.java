package com.example;

import com.example.beans.DogFact;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/dogfacts")
public class DogFactResource {

    @Inject
    @RestClient
    DogService dogService;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getDogFact() throws WebApplicationException {
        try {
            // Call the dog API with number 1 and Any category
            DogFact dogFact = dogService.getDogFact(10);
            // Return the random fact as a plain text response
            return dogFact.getRandomFact();
        } catch (Exception e) {
            // Throw an internal server error if something goes wrong
            throw new WebApplicationException(e.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
}
