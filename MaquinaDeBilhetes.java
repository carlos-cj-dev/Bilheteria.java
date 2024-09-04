
public class MaquinaDeBilhetes {
    double saldo;
    double PrecoDoBilhete;
    int BilhetesVendidos;

    MaquinaDeBilhetes(){
        this.saldo = 0;
        this.PrecoDoBilhete = 20;
        this.BilhetesVendidos = 0;
    }

    double InserirSaldo(double x){
        System.out.println("Adicionar saldo: ");
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
        if (this.verificarPreco() == true){
            this.saldo = saldo - PrecoDoBilhete;
            this.BilhetesVendidos ++;
        }
    }

    void SaldoDisponivel(){
        System.out.printf("Saldo Disponível: %.2f", this.saldo);
        System.out.printf("Bilhetes Vendidos: %.2f", this.BilhetesVendidos);
    }

    public static void main(String[] args) {
        MaquinaDeBilhetes teste = new MaquinaDeBilhetes();

    

}
}
