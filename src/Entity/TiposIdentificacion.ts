
import {Entity,Column,PrimaryGeneratedColumn} from 'typeorm';

@Entity("DAF_TIPOS_IDENTIFICACION")
export class TiposIdentificaion {

	@PrimaryGeneratedColumn()
    CODIGO_TIPO_IDENTIFICACION:number;
	
	@Column()
	NOMBRE_TIPO_IDENTIFICACION:string;
	
	@Column()
	ABREVIATURA_IDENTIFICACION:string;

}