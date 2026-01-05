import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite o seu nome: ");
        String NomeUsuario = sc.nextLine();

       System.out.println("Agora digite o número da sua conta [Somente números]: ");
        int NumeroDaConta = sc.nextInt();
            
    
       System.out.println("Digite o número da agência [4 digitos]: ");
        String Agencia = sc.next();
            while (Agencia.length()!=4) {
                System.out.println("ERRO: Digite novamente o número da agência com 4 dígitos.");
                Agencia = sc.next();
            }
            System.out.println("Agência válida! "+Agencia);
double Saldo = 0;
boolean valido = false;
while(!valido){
    try{
        System.out.println("Adicione o seu saldo: ");
        String entrada = sc.next();
        entrada = entrada.replace(",",".");
        Saldo = Double.parseDouble(entrada);
        valido=true;
        System.out.println("Saldo adicionado com sucesso!");
    }catch(NumberFormatException e){
        System.out.println("ERRO: Digite um número válido [ex: 123.00 ou 123,00]");
    }
    
}
       
    System.out.println("Olá "+NomeUsuario+" obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+NumeroDaConta+", e seu saldo "+Saldo+" já está disponível para saque");
        sc.close(); 
    }
}
