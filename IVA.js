/*Escribir una función que calcule 
el total de una factura tras aplicarle el IVA.
La función debe recibir la cantidad sin IVA y
el porcentaje de IVA a aplicar, 
y devolver el total de la factura.
Si se invoca la función sin pasarle
el porcentaje de IVA, deberá aplicar un 21%.*/

// 0.00 <= iva <= 0.99
var total2 = function (subtotal, iva) {
    if (iva === void 0) { iva = 0.21; }
    return subtotal * (iva + 1);
};

console.log(total2(100));
console.log(total2(100, 0.22));
console.log(total2(100, 0.18));
console.log(total2(150));
console.log(total2(150, 0.17));
