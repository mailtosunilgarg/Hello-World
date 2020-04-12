package org.sample;

import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.sample.beans.ApiResponse;
import org.sample.beans.Pet;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/pet")
public interface PetResource {
  /**
   *
   */
  @PUT
  @Produces({"application/xml", "application/json"})
  @Consumes({"application/xml", "application/json"})
  void updatePet(Pet body);

  /**
   *
   */
  @POST
  @Produces({"application/xml", "application/json"})
  @Consumes({"application/xml", "application/json"})
  void addPet(Pet body);

  /**
   * Multiple status values can be provided with comma separated strings
   */
  @Path("/findByStatus")
  @GET
  @Produces({"application/xml", "application/json"})
  List<Pet> findPetsByStatus(@QueryParam("status") Object status);

  /**
   * Muliple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   */
  @Path("/findByTags")
  @GET
  @Produces({"application/xml", "application/json"})
  List<Pet> findPetsByTags(@QueryParam("tags") Object tags);

  /**
   * Returns a single pet
   */
  @Path("/{petId}")
  @GET
  @Produces({"application/xml", "application/json"})
  Pet getPetById(@PathParam("petId") long petId);

  /**
   *
   */
  @Path("/{petId}")
  @POST
  @Produces({"application/xml", "application/json"})
  @Consumes("application/x-www-form-urlencoded")
  void updatePetWithForm(@PathParam("petId") long petId, String name, String status);

  /**
   *
   */
  @Path("/{petId}")
  @DELETE
  @Produces({"application/xml", "application/json"})
  void deletePet(@HeaderParam("api_key") String apiKey, @PathParam("petId") long petId);

  /**
   *
   */
  @Path("/{petId}/uploadImage")
  @POST
  @Produces("application/json")
  @Consumes("multipart/form-data")
  ApiResponse uploadFile(@PathParam("petId") long petId, String additionalMetadata, Object file);
}
