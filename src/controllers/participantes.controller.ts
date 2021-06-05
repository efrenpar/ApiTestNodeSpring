import {Request,Response} from 'express'
import {getRepository} from 'typeorm'
import {participante} from '../Entity/participantes';
import {Mensaje} from '../utils/Mensaje'

export const getParticipantes = async(req: Request,res:Response) : Promise<Response> =>{

       const participantes = await getRepository(participante).find();

        return res.status(200).json(participantes);
}