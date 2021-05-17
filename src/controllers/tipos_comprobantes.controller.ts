import {Request,Response} from 'express'
import {getRepository} from 'typeorm'
import {Tipos_comprobantes} from '../Entity/Tipos_comprobantes'
import {Mensaje} from '../utils/Mensaje'

export const getTipos_comprobantes = async(req: Request,res:Response) : Promise<Response> =>{

    const application = req.header("Application");
    const idorganizacion = req.header("idorganizacion");
    const acceptLanguage = req.header("Accept-Language");

    const codigoEmpresa= req.query.codigoEmpresa;
    const usoTipoComprobantes = req.query.usoTipoComprobantes;
    let status=400;



    let tiposComprobantes;

    let mensaje;

    if(!application || !idorganizacion){
        mensaje = new Mensaje(status,"Se Necesitan las cabeceras idOrganizacionHeader y Applicacion",false,[])
    }

    if(application === "UEhBTlRPTVhfV0VC" && idorganizacion === "365509c8-9596-4506-a5b3-487782d5876e"){
        if(acceptLanguage){
            status = 200;
            mensaje = new Mensaje(status,"hay lenguaje",true,[])
        }

        if(codigoEmpresa){
            if(usoTipoComprobantes === "GESTION_NOTA_CREDITO"){
                status = 200;

                tiposComprobantes = await getRepository(Tipos_comprobantes)
                    .createQueryBuilder("tC")
                    .where("tC.CODIGO_EMPRESA = :codigoEmpresa", { codigoEmpresa: codigoEmpresa})
                    .andWhere("tC.NOMBRE_TIPO_COMPROBANTE = :usoTipoComprobantes", { usoTipoComprobantes: "NOTA DE CREDITO"})
                    .getMany();

                    mensaje = new Mensaje(status,"NOTA CREDITO",true, tiposComprobantes);

            }else if(usoTipoComprobantes === "GESTION_FACTURACION"){

                status = 200;
                tiposComprobantes = await getRepository(Tipos_comprobantes)
                    .createQueryBuilder("tC")
                    .where("tC.CODIGO_EMPRESA = :codigoEmpresa", { codigoEmpresa: codigoEmpresa})
                    .andWhere("tC.NOMBRE_TIPO_COMPROBANTE = :usoTipoComprobantes", { usoTipoComprobantes: "FACTURA"})
                    .getMany();

                    mensaje = new Mensaje(status,"GESTION_FACTURACION",true, tiposComprobantes);

            }else{
                status = 200;
                tiposComprobantes = await getRepository(Tipos_comprobantes).find();
                mensaje = new Mensaje(status,"TODOS",true, tiposComprobantes);
            }
        }else{
            mensaje = new Mensaje(status,"El valor de codigoEmpresa es requerido",false,[]);
        }

    }else{
        mensaje = new Mensaje(status,"Los valores de idOrganizacionHeader o Applicacion son incorrectos",false,[]);
    }

    return res.status(status).json(mensaje);
}