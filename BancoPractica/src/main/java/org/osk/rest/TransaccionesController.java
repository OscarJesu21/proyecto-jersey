package org.osk.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import org.osk.model.TransaccionesBean;
import org.osk.service.TransacionesService;

@Path("/referencia")
public class TransaccionesController {

	
	private TransacionesService service;
	
	public void setService(TransacionesService service) {
		this.service = service;
	}
	
	//Prueba funcionalidad del servicio
	@GET
	@Path("/lista")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listaP() {
		
		List<TransaccionesBean> lst = new ArrayList<TransaccionesBean>();
		
		TransaccionesBean bean = new TransaccionesBean();
		
		bean.setSaldo(12550);
		lst.add(bean);
		System.out.println(lst);
		return Response.status(200).entity(new GenericEntity<List<TransaccionesBean>>(lst) {}).build();
		
	}
	@POST
	@Path("/depositar")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deposito(TransaccionesBean bean) {
			
		try {
			service.deposito(bean);
			
		}catch (Exception e) {
			 System.out.println(e.getMessage());
		}
		return Response.status(200).entity(bean).build();
		
		
	}
	@POST
	@Path("/retiro")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response retiro(TransaccionesBean bean) {
		
		try {
			service.deposito(bean);
			
		}catch (Exception e) {
			 System.out.println(e.getMessage());
		}
		return Response.status(200).entity(bean).build();
		
	}
	
	
}
