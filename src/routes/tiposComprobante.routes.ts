import {Router} from 'express'
import { getTipos_comprobantes } from '../controllers/tipos_comprobantes.controller';

const router = Router();

router.get('/tipos_comprobantes',getTipos_comprobantes);

export default router;
 