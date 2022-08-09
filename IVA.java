/*Escribir una función que calcule 
el total de una factura tras aplicarle el IVA.
La función debe recibir la cantidad sin IVA y
el porcentaje de IVA a aplicar, 
y devolver el total de la factura.
Si se invoca la función sin pasarle
el porcentaje de IVA, deberá aplicar un 21%.*/

// 0.00 <= iva <= 0.99
public class IVA {

    static void total(double subtotal){
        System.out.println(subtotal * 1.21);
    }

    static void total(double subtotal, double iva){
        System.out.println(subtotal * (1 + iva));
    }

    public static void main(String[] args) {
        total(100);
        total(100, 0.22);
        total(100, 0.18);
        total(150);
        total(150, 0.17);
    }
}