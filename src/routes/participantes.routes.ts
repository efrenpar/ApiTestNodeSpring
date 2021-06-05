import {Router} from 'express'
import { getParticipantes  } from '../controllers/participantes.controller';

const router = Router();

router.get('/participantes',getParticipantes );

export default router;
 