"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.getTipos_comprobantes = void 0;
var typeorm_1 = require("typeorm");
var Tipos_comprobantes_1 = require("../Entity/Tipos_comprobantes");
var Mensaje_1 = require("../utils/Mensaje");
var getTipos_comprobantes = function (req, res) { return __awaiter(void 0, void 0, void 0, function () {
    var application, idorganizacion, acceptLanguage, codigoEmpresa, usoTipoComprobantes, status, tiposComprobantes, mensaje;
    return __generator(this, function (_a) {
        switch (_a.label) {
            case 0:
                application = req.header("Application");
                idorganizacion = req.header("idorganizacion");
                acceptLanguage = req.header("Accept-Language");
                codigoEmpresa = req.query.codigoEmpresa;
                usoTipoComprobantes = req.query.usoTipoComprobantes;
                status = 400;
                if (!application || !idorganizacion) {
                    mensaje = new Mensaje_1.Mensaje(status, "Se Necesitan las cabeceras idOrganizacionHeader y Applicacion", false, []);
                }
                if (!(application === "UEhBTlRPTVhfV0VC" && idorganizacion === "365509c8-9596-4506-a5b3-487782d5876e")) return [3 /*break*/, 9];
                if (acceptLanguage) {
                    status = 200;
                    mensaje = new Mensaje_1.Mensaje(status, "hay lenguaje", true, []);
                }
                if (!codigoEmpresa) return [3 /*break*/, 7];
                if (!(usoTipoComprobantes === "GESTION_NOTA_CREDITO")) return [3 /*break*/, 2];
                status = 200;
                return [4 /*yield*/, typeorm_1.getRepository(Tipos_comprobantes_1.Tipos_comprobantes)
                        .createQueryBuilder("tC")
                        .where("tC.CODIGO_EMPRESA = :codigoEmpresa", { codigoEmpresa: codigoEmpresa })
                        .andWhere("tC.NOMBRE_TIPO_COMPROBANTE = :usoTipoComprobantes", { usoTipoComprobantes: "NOTA DE CREDITO" })
                        .getMany()];
            case 1:
                tiposComprobantes = _a.sent();
                mensaje = new Mensaje_1.Mensaje(status, "NOTA CREDITO", true, tiposComprobantes);
                return [3 /*break*/, 6];
            case 2:
                if (!(usoTipoComprobantes === "GESTION_FACTURACION")) return [3 /*break*/, 4];
                status = 200;
                return [4 /*yield*/, typeorm_1.getRepository(Tipos_comprobantes_1.Tipos_comprobantes)
                        .createQueryBuilder("tC")
                        .where("tC.CODIGO_EMPRESA = :codigoEmpresa", { codigoEmpresa: codigoEmpresa })
                        .andWhere("tC.NOMBRE_TIPO_COMPROBANTE = :usoTipoComprobantes", { usoTipoComprobantes: "FACTURA" })
                        .getMany()];
            case 3:
                tiposComprobantes = _a.sent();
                mensaje = new Mensaje_1.Mensaje(status, "GESTION_FACTURACION", true, tiposComprobantes);
                return [3 /*break*/, 6];
            case 4:
                status = 200;
                return [4 /*yield*/, typeorm_1.getRepository(Tipos_comprobantes_1.Tipos_comprobantes).find()];
            case 5:
                tiposComprobantes = _a.sent();
                mensaje = new Mensaje_1.Mensaje(status, "TODOS", true, tiposComprobantes);
                _a.label = 6;
            case 6: return [3 /*break*/, 8];
            case 7:
                mensaje = new Mensaje_1.Mensaje(status, "El valor de codigoEmpresa es requerido", false, []);
                _a.label = 8;
            case 8: return [3 /*break*/, 10];
            case 9:
                mensaje = new Mensaje_1.Mensaje(status, "Los valores de idOrganizacionHeader o Applicacion son incorrectos", false, []);
                _a.label = 10;
            case 10: return [2 /*return*/, res.status(status).json(mensaje)];
        }
    });
}); };
exports.getTipos_comprobantes = getTipos_comprobantes;
