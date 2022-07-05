package com.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.dao.CatalogueDao;

import catalogueservice.CatalogueService;
import sheared.Produit;

@Path("catalogues")
public class CatalogueApi {

	@Inject	
	CatalogueService service;
	
	@POST
	public Response save(Produit p)
	{
		service.save(p);
		return Response.ok().build();
	}
	
	@GET
	@Path("/{id}")
	public Response getbyid(long id)
	{
		Produit p = service.findById(id);
		return Response.ok(p).build();
	}
	
	
}
