"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Mensaje = void 0;
var Mensaje = /** @class */ (function () {
    function Mensaje(code, message, succes, data) {
        this.code = code;
        this.succes = succes;
        this.message = message;
        this.data = data;
    }
    return Mensaje;
}());
exports.Mensaje = Mensaje;
