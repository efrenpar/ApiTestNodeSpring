"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.Tipos_comprobantes = void 0;
var typeorm_1 = require("typeorm");
var Tipos_comprobantes = /** @class */ (function () {
    function Tipos_comprobantes() {
    }
    __decorate([
        typeorm_1.PrimaryGeneratedColumn(),
        __metadata("design:type", Number)
    ], Tipos_comprobantes.prototype, "CODIGO_TIPO_COMPROBANTE", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", Number)
    ], Tipos_comprobantes.prototype, "CODIGO_EMPRESA", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", String)
    ], Tipos_comprobantes.prototype, "NOMBRE_TIPO_COMPROBANTE", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", Number)
    ], Tipos_comprobantes.prototype, "CODIGO_EMPRESA_PADRE", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", Number)
    ], Tipos_comprobantes.prototype, "CODIGO_SRI", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", String)
    ], Tipos_comprobantes.prototype, "ES_C_X_C", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", String)
    ], Tipos_comprobantes.prototype, "ES_C_X_P", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", String)
    ], Tipos_comprobantes.prototype, "ES_ACTIVO", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", String)
    ], Tipos_comprobantes.prototype, "FECHA_INGRESO", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", String)
    ], Tipos_comprobantes.prototype, "USUARIO_INGRESO", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", String)
    ], Tipos_comprobantes.prototype, "FECHA_MODIFICACION", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", String)
    ], Tipos_comprobantes.prototype, "USUARIO_MODIFICACION", void 0);
    __decorate([
        typeorm_1.Column(),
        __metadata("design:type", String)
    ], Tipos_comprobantes.prototype, "NEMONICO", void 0);
    Tipos_comprobantes = __decorate([
        typeorm_1.Entity("DAF_TIPOS_COMPROBANTES")
    ], Tipos_comprobantes);
    return Tipos_comprobantes;
}());
exports.Tipos_comprobantes = Tipos_comprobantes;
