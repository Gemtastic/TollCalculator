import model.Vehicle;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationPath("/api")
public class CalculatorAPI extends Application {

   @POST
   @Path("/register")
   @Consumes(MediaType.APPLICATION_JSON)
   public Response registerVehicle(Vehicle vehicle){
      // Save vehicle to db
      return Response.ok().build();
   }

   @GET
   @Path("/thisMonthsToll/{licensePlate}")
   @Produces(MediaType.APPLICATION_JSON)
   public Response gerThisMonthsToll(@PathParam("licensePlate") String licensePlate) {
      int tollFee = 0;
      // Get toll fee
      String json = "{" +
              "\"Tolls for License Plate" + licensePlate +"\": {" +
              "\"TollsThisFar\":" + tollFee +
              "}" +
              "}";
      return Response.ok(json, MediaType.APPLICATION_JSON).build();
   }
}
