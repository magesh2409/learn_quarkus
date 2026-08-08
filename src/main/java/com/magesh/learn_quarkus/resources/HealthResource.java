package com.magesh.learn_quarkus.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
public class HealthResource {

    @GET
    @Path("")
    @Produces(MediaType.TEXT_PLAIN)
    public Response basePath(){
        return Response.status(Response.Status.OK).entity("OK from base path").build();
    }


    @GET
    @Path("/health")
    @Produces(MediaType.TEXT_PLAIN)
    public Response healthCheck(){
        return Response.status(Response.Status.OK).entity("OK").build();
    }
}
