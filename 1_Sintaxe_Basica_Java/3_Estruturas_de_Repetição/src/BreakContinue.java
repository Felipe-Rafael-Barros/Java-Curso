public class BreakContinue {
    public static void main(String[] args) {
        for (int numero =1; numero <=5; numero++){
            if (numero ==3)
                break; // Break vai para a estrutura de repetição no valor do if
            System.out.println(numero);
        }
        for (int numero =1; numero <=5; numero++){
            if (numero ==3)
                continue; // Continue vai apenas não mostrar o numero do if
            System.out.println(numero);
        }
    }
}
