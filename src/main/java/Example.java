import io.smallrye.mutiny.Uni;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("")
public class Example {

    @POST
    @Path("/payload")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Payload> helloPayload(Payload payload) {
        return Uni.createFrom().item(payload);
    }
}
