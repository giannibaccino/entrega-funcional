/*Escribir una función que calcule 
el total de una factura tras aplicarle el IVA.
La función debe recibir la cantidad sin IVA y
el porcentaje de IVA a aplicar, 
y devolver el total de la factura.
Si se invoca la función sin pasarle
el porcentaje de IVA, deberá aplicar un 21%.*/

//---TypeScript---
function calculus(total, prctg){
    let iva = 0.21;
    
    if(prctg != 0)
        iva = prctg/100;

    console.log(total * (1 + iva));
}

calculus(100, 0);
calculus(100, 22);