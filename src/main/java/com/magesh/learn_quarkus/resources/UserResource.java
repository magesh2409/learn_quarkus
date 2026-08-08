package com.magesh.learn_quarkus.resources;


import com.magesh.learn_quarkus.dto.request.CreateUser;
import com.magesh.learn_quarkus.dto.request.GetUser;
import com.magesh.learn_quarkus.service.UserService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Map;

@Path("/user")
public class UserResource {

    @Inject
    UserService userService;

    @GET
    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("userId") String userId){
        Map<String, Object> response = userService.getUser(userId);
        return Response.status(Response.Status.OK).entity(response).build();
    }

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllUsers(){
        List<Map<String, Object>> response = userService.getAllUsers();
        return Response.status(Response.Status.OK).entity(response).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(@Valid CreateUser request){
        // created user
        return Response.status(Response.Status.OK).entity("{}").build();
    }
}
