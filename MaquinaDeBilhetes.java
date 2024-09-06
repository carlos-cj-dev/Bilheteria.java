import java.util.Scanner;   

public class MaquinaDeBilhetes {
    double saldo;
    double PrecoDoBilhete;
    int BilhetesVendidos;

    MaquinaDeBilhetes(){
        this.saldo = 0;
        this.PrecoDoBilhete = 20;
        this.BilhetesVendidos = 0;
    }

    double VerSaldo(){
        return saldo;
    }

    int VerBilhetes(){
        return BilhetesVendidos;
    }


    double InserirSaldo(double x){
        saldo = saldo + x;
        System.out.println("Dinheiro adicionado!!!");
        System.out.println("---------------------------------------------------------------");
        verificarPreco();
        return saldo;
    }    

    void verificarPreco(){
        if (saldo >= PrecoDoBilhete){
            while(saldo >= PrecoDoBilhete)
                GerarBilhete();
        }else{
            System.out.println("Saldo Insuficiente para comprar o bilhete, adicione mas saldo!!");
            System.out.println("---------------------------------------------------------------");
        }
    }

    void GerarBilhete(){    
        saldo = saldo - PrecoDoBilhete;
        BilhetesVendidos ++;
        System.out.println("Bilhete Gerado!!!");
        System.out.println("---------------------------------------------------------------");      
    }

    void ZerarMaquina(){
            saldo = 0;
            BilhetesVendidos = 0;
            System.out.println("---------------------------------------------------------------");
            System.out.println("Máquina resetada!!!");
            System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaDeBilhetes teste = new MaquinaDeBilhetes();

        while(true){
            System.out.println("Opções:");
            System.out.println("1. Inserir dinheiro");
            System.out.println("2. Ver saldo");
            System.out.println("3. Ver bilhetes vendidos");
            System.out.println("4. Resetar máquina");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            // break em cada case para evitar o fall-through(cada opçao do case será usada).
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    double valor = scanner.nextDouble();
                    teste.InserirSaldo(valor);
                    break;
                case 2:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Voçe tem de saldo: " + teste.VerSaldo());
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Total de bilhetes vendidos: " + teste.VerBilhetes());
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 4:
                    teste.ZerarMaquina();
                    break;
                case 5:
                    System.out.println("Saindo.......");
                    // o scanner.close() fecha o fluxo de entrada, nada mais pode ser lido pelo scanner, fazendo com que o loop while termine ou até mesmo o programa.
                    scanner.close();
                    break;
                default:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Opção Inválida");
                    System.out.println("Tente novamente:!!!");
                    System.out.println("---------------------------------------------------------------");
                    break;
            }
        }


}
}