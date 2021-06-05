import 'reflect-metadata'
import express from 'express'
import morgan from 'morgan'
import cors from 'cors'
import {createConnection} from 'typeorm'

import participantes from "./routes/participantes.routes";

const app = express()
createConnection();

//middlewares
app.use(cors());
app.use(morgan('dev'));
app.use(express.json());


//routes
//app.use(tiposComrpobante);
//app.use(TiposIdentificaion);
app.use(participantes);



app.listen(3000);

console.log("server on port",3000);