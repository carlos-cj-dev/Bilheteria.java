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
        this.saldo = saldo + x;
        return saldo;
    }    

    boolean verificarPreco(){
        if (this.saldo >= this.PrecoDoBilhete){
            return true;
        }
        return false;
    }

    void GerarBilhete(){
        if (verificarPreco() == true){
            this.saldo = saldo - PrecoDoBilhete;
            this.BilhetesVendidos ++;
            System.out.println("Bilhete Gerado!!!");
    }
        
    }

    void SaldoDisponivel(){
        System.out.printf("Saldo Disponível: %.2f", this.saldo);
        System.out.print("");
        System.out.printf("Bilhetes Vendidos: %.2f", this.BilhetesVendidos);
    }

    void ZerarMaquina(){
            this.saldo = 0;
            this.BilhetesVendidos = 0;
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

            switch ((opcao)) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    double valor = scanner.nextDouble();
                    teste.InserirSaldo(valor);
                case 2:
                    teste.VerSaldo();
                case 3:
                    teste.VerBilhetes();
                case 4:
                    teste.ZerarMaquina();
                case 5:
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }


}
}