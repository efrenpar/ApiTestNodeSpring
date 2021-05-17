
export class Mensaje{
    code:number;
	message:string ;
	succes:boolean;
	data:any;

	constructor(code:number,message:string,succes:boolean,data:any){
		this.code = code;
		this.succes = succes;
		this.message=message;
		this.data = data;
	}
}