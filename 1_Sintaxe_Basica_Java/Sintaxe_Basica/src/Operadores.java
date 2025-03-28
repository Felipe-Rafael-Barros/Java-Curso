
public class Operadores {
    public static void main(String [] args) {
        String concatenacao ="?";
        concatenacao = 1+1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(numero);

        int numerox = -numero;
        System.out.println(numerox);

        numerox = ++numero;
        System.out.println(numerox);

        numerox = --numero;
        System.out.println(numerox);

        System.out.println(++numero);//aqui o numero soma-se 1 no print
        System.out.println(numero++);//aqui printa o valor antes da soma e depois soma

        Boolean variavel1 = true;
        Boolean variavel2 = false;

        System.out.println(!variavel1); //! é no NOT, inverte a entrada.

        // IF ELSE

        int a = 6;
        int b = 5;
        String resultado = "";

        if (a==b)
            resultado = "Verdadeira";
        else
            resultado ="Falso";
        System.err.println(resultado);

        // Operador ternário

        String resultado2 = a==b ? "Verdadeiro2" : "Falso2";
        System.err.println(resultado2);




    }
}
/*  Crtl,Shift,p -> Create new projec
 * 
*/