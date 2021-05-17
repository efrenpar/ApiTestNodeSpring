"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var express_1 = require("express");
var tipos_comprobantes_controller_1 = require("../controllers/tipos_comprobantes.controller");
var router = express_1.Router();
router.get('/tipos_comprobantes', tipos_comprobantes_controller_1.getTipos_comprobantes);
exports.default = router;
