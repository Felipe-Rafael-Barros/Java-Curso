public class App {
    public static void main(String[] args) throws Exception {
        exemploFor();
        exemploForArrays();
        exemploForEach();
    }
    //Usando for 
    public static void exemploFor() {
        for (int carneirinhos = 1; carneirinhos <=20;carneirinhos++){
            System.err.println("Contando carneirinhos "+ carneirinhos);
        }
    }

    //Usando For em Arrays
    
    public static void exemploForArrays() {
        String alunos[] ={ "Felipe", "Rafael", "Barros", "Silva"};
        for (int x=0;x<alunos.length; x++){
            System.err.println(alunos[x]);
        }
    }
    //Usando For em Arrays
    public static void exemploForEach() {
        String alunos[] ={ "Felipe", "Rafael", "Barros", "Silva"};
        for (String aluno : alunos){
            System.err.println("Nome do alunor é: "+ aluno);
        }
    }
}
