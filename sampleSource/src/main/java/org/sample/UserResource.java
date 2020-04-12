package org.sample;

import java.lang.String;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.sample.beans.User;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/user")
public interface UserResource {
  /**
   * This can only be done by the logged in user.
   */
  @POST
  @Produces({"application/xml", "application/json"})
  void createUser(User body);

  /**
   *
   */
  @Path("/createWithArray")
  @POST
  @Produces({"application/xml", "application/json"})
  void createUsersWithArrayInput(List<User> body);

  /**
   *
   */
  @Path("/createWithList")
  @POST
  @Produces({"application/xml", "application/json"})
  void createUsersWithListInput(List<User> body);

  /**
   *
   */
  @Path("/login")
  @GET
  @Produces({"application/xml", "application/json"})
  String loginUser(@QueryParam("username") String username,
      @QueryParam("password") String password);

  /**
   *
   */
  @Path("/logout")
  @GET
  @Produces({"application/xml", "application/json"})
  void logoutUser();

  /**
   *
   */
  @Path("/{username}")
  @GET
  @Produces({"application/xml", "application/json"})
  User getUserByName(@PathParam("username") String username);

  /**
   * This can only be done by the logged in user.
   */
  @Path("/{username}")
  @PUT
  @Produces({"application/xml", "application/json"})
  void updateUser(@PathParam("username") String username, User body);

  /**
   * This can only be done by the logged in user.
   */
  @Path("/{username}")
  @DELETE
  @Produces({"application/xml", "application/json"})
  void deleteUser(@PathParam("username") String username);
}
