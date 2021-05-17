import {Entity,Column,PrimaryGeneratedColumn} from 'typeorm';

@Entity("DAF_TIPOS_COMPROBANTES")
export class Tipos_comprobantes {

    @PrimaryGeneratedColumn()
    CODIGO_TIPO_COMPROBANTE:number;

    @Column()
    CODIGO_EMPRESA:number;

    @Column()
    NOMBRE_TIPO_COMPROBANTE:string;

	@Column()
	CODIGO_EMPRESA_PADRE:number;

	@Column()
	CODIGO_SRI:number;
	
	@Column()
	ES_C_X_C:string;
	
	@Column()
	ES_C_X_P:string;
	
	@Column()
	ES_ACTIVO:string;
	
	@Column()
	FECHA_INGRESO:string;
	
	@Column()
	USUARIO_INGRESO:string;
	
	@Column()
	FECHA_MODIFICACION:string;
	
	@Column()
	USUARIO_MODIFICACION:string;
	
	@Column()
	NEMONICO:string;


}