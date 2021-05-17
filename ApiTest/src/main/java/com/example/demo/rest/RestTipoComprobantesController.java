package com.example.demo.rest;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.entity.Tipos_comprobantes;
import com.example.demo.repository.Tipos_comprobantesRepository;
import com.example.demo.utils.Mensaje;

@RestController
@RequestMapping("/tipos_comprobantes")
public class RestTipoComprobantesController {
	
	@Autowired
	private Tipos_comprobantesRepository tiposComprobantesRepository;
	
	@GetMapping
	public ResponseEntity<Mensaje> getTipos_comprobantes(@RequestHeader(value="Application")String applicationHeader,
			@RequestHeader(value="IdOrganizacion") String idOrganizacionHeader, 
			@RequestHeader(value="Accept-Language",required=false) String acceptLanguage, 
			@RequestParam(value="codigoEmpresa") String codigoEmpresa,
			@RequestParam(value="usoTipoComprobantes",required=false)String usoTipoComprobantes){
		
		Mensaje response;
		ArrayList<Tipos_comprobantes> tiposComprobantes = new ArrayList<Tipos_comprobantes>();
		
		
		
		response = new Mensaje(400,"Se Necesitan las cabeceras idOrganizacionHeader y UEhBTlRPTVhfV0VC",false,null);
		
		if(idOrganizacionHeader.equals("365509c8-9596-4506-a5b3-487782d5876e") && applicationHeader.equals("UEhBTlRPTVhfV0VC")) {
			if(acceptLanguage!=null){
				response = new Mensaje(200,"hay lenguaje",true,tiposComprobantes);
			}
			
			if(codigoEmpresa!=null) {
			
					if(usoTipoComprobantes.equals("NOTA DE CREDITO") ) {
						this.tiposComprobantesRepository.findByCodigoEmpresaAndNombreTipoComprobantePadre(Long.parseLong(codigoEmpresa)
								, usoTipoComprobantes).forEach(tiposComprobantes::add);
						response = new Mensaje(200,"GESTION_NOTA_CREDITO",true,tiposComprobantes);
						
					}else if(usoTipoComprobantes.equals("FACTURA")) {
						this.tiposComprobantesRepository.findByCodigoEmpresaAndNombreTipoComprobantePadre(Long.parseLong(codigoEmpresa)
								, usoTipoComprobantes).forEach(tiposComprobantes::add);
						response = new Mensaje(200,"GESTION_FACTURACION",true,tiposComprobantes);
						
					}else {
						this.tiposComprobantesRepository.findByCodigoEmpresa(Long.parseLong(codigoEmpresa)).forEach(tiposComprobantes::add);
						response = new Mensaje(200,"hay codigoempresa",true,tiposComprobantes);
					}
				
				
			}
		}else {
			response = new Mensaje(400,"La cabecera Application  o  IdOrganizacion es incorrecta",true,tiposComprobantes);
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
		
	}

}
