package org.sample;

import java.lang.String;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.sample.beans.DataTypeWithExample;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/datatypewithexamples")
public interface DatatypewithexamplesResource {
  /**
   * Gets a list of all `dataTypeWithExample` entities.
   */
  @GET
  List<DataTypeWithExample> getdatatypewithexamples();

  /**
   * Creates a new instance of a `dataTypeWithExample`.
   */
  @POST
  void createdataTypeWithExample(DataTypeWithExample body);

  /**
   * Gets the details of a single instance of a `dataTypeWithExample`.
   */
  @Path("/{datatypewithexampleId}")
  @GET
  DataTypeWithExample getdataTypeWithExample(
      @PathParam("datatypewithexampleId") String datatypewithexampleId);

  /**
   * Updates an existing `dataTypeWithExample`.
   */
  @Path("/{datatypewithexampleId}")
  @PUT
  void updatedataTypeWithExample(@PathParam("datatypewithexampleId") String datatypewithexampleId,
      DataTypeWithExample body);

  /**
   * Deletes an existing `dataTypeWithExample`.
   */
  @Path("/{datatypewithexampleId}")
  @DELETE
  void deletedataTypeWithExample(@PathParam("datatypewithexampleId") String datatypewithexampleId);
}
