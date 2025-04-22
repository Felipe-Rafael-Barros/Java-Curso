import java.util.Scanner;

public class Metodos {
    //Class métodos
    
    //MÈTODO
     //Para métodos, usamos: Acelerar,Somar,Andar...
     //CamelCase -> calcularNumero
     //Em suma, métodos são para um trabalho específico e da um retorno apenas.   
     //São tipo funções em Python, alguns precisam de argumentos( X,Y)

    //Exemplo de uma TV
    static boolean sair = false;
    boolean tvLligada = false;
    int volume = 20;
    int canal = 1;

    public void statusTV(){
        System.err.println(tvLligada);
        System.err.println(volume);
        System.err.println(canal);

    }
    public void ligar(){
        tvLligada = true;
        statusTV();
    }
    public void desligar(){
        tvLligada = false;
        statusTV();
    }
    public void aumentarVolume(){
        if (volume<=60){
            volume++;
            
        }
        statusTV();
    }
    public void diminuirVolume(){
        if (volume>=60){
            volume++;
        }
        statusTV();
    }
    public void mudarCanal(int novoCanal ){
        canal = novoCanal;
        statusTV();
    }
    public void Sair(){
        sair = true;
    }

    public static void main(String[] args) {
        while (sair==false) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite: ");
            System.out.println("1 - Aumentar Volume ");
            System.out.println("2 - Diminuir Volume ");
            System.out.println("3 - Mudar de canal  ");
            System.out.println("4 - Desligar TV ");
            System.out.println("5 - Ligar TV ");
            System.out.println("6 - Encerrar programa ");
            String Entrada = scanner.nextLine(); 
            if (Entrada == "1") {
                
            }
            else if(Entrada == "2"){

            }
            else if(Entrada == "3"){

            }
            else if(Entrada == "4"){

            }
            else if(Entrada == "5"){

            }
            else if(Entrada == "6"){

            }
            else{
                System.err.println("Nenhuma alternativa selecionada");
            }

        }
    }


    
}

