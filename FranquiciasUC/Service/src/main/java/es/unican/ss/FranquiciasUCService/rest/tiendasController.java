package es.unican.ss.FranquiciasUCService.rest;

import es.unican.ss.franquiciasUCCommon.domain.Empleado;
import es.unican.ss.franquiciasUCCommon.domain.Tienda;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/tiendas")
public class tiendasController {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Tienda> tiendas(@QueryParam("localidad") String localidad){
        return null;
    }

    @Path("/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Tienda tienda(@PathParam("id")long id)
    {
        return null;
    }

    @Path("/{tiendaId}/empleados")
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Empleado anhadirEmpleadoTienda(Empleado empleado, @PathParam("tiendaId") long tiendaId){
        return null;
    }

    @Path("/{tiendaId}/empleados/{empleadoDni}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Empleado eliminarEmpleadoTienda(@PathParam("tiendaId") long tiendaId, @PathParam("empleadoDni") String empleadoDni){
        return null;
    }
}
