package ar.com.inviu;

class StockExercise {
    /*
    Dado un array de precios donde prices[i] es el valor de una accion en el dia i
    Tu objetivo es obtener la mayor ganancia posible mediante la compra y posterior venta de las mismas en un dia distinto (1 sola operacion de cada tipo)
    Retornar la ganancia maxima posible de esta transaccion. Si no hay ganancia posible, retornar 0.

    Ejemplo 1:
    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explicacion: Comprar en el dia 2 (price = 1) y vender en el dia 5 (price = 6), ganancia = 6-1 = 5.

    Ejemplo 2:
    Input: prices = [7,6,4,3,1]
    Output: 0
    Explicacion: En este caso, no se realiza ninguna transaccion y la ganancia es 0

    Condiciones
    - Comprar en el dia 2 y vender en el 1 es imposible porque debes comprar antes de poder vender.
    - 1 <= prices.length <= 10^5 (100.000)
    - 0 <= prices[i] <= 10^4 (10.000)
     */
    public static int maxProfit(int[] prices) {
        return 0;
    }

    public static void main(String[] args)
    {
        int [] arr = {7,1,5,3,6,4};
        int ans=  maxProfit(arr);
        System.out.println(ans);
    }
}