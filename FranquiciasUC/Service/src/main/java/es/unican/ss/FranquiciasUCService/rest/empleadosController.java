package es.unican.ss.FranquiciasUCService.rest;

import es.unican.ss.franquiciasUCCommon.domain.Empleado;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/empleados")
public class empleadosController {

    @Path("/{dni}")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Empleado empleado(@PathParam("dni") String dni){
        return null;
    }

    @Path("/{dni}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Empleado empleado(Empleado empleado, @PathParam("dni") String dni){
        return null;
    }

    @Path("/{dni}/sueldo")
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public double sueldoEmpleado(@PathParam("dni") String dni)
    {
        return 0;
    }

    @Path("/{dni}/ventas")
    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN})
    public Empleado actualizarVentasEmpleado(double ventas, @PathParam("dni") String dni){
        return null;
    }

    @Path("/mejor")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Empleado mejorEmpleado(){
        return null;
    }



}
