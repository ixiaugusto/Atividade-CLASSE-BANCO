public class Main {
    public static void main(String[] args) throws Exception {

        ContaBancaria conta1 = new ContaBancaria (9922, "Yuri", 4000);

        ContaBancaria conta2 = new ContaBancaria (1000, "Sabrina", 6000);
    
        


        System.out.println("Saldo inicial (conta1): " + conta1.getSaldo());
        conta1.depositar(1000.0);
        System.out.println("Após depósito de R$1000: " + conta1.getSaldo() );
        boolean ok = conta1.sacar(1750.0);
        System.out.println("Tentativa de saque de R$1750: " + (ok ? "sucesso" :
       "falha"));
        System.out.println("Saldo final (conta1): " + conta1.getSaldo());
       
        System.out.println("");



        System.out.println("Saldo inicial (conta2): " + conta2.getSaldo());
        conta2.depositar(2000.0);
        System.out.println("Após depósito de R$2000: " + conta2.getSaldo() );
        boolean notOk = !conta2.sacar(3000.0);
        System.out.println("Tentativa de saque de R$3000: " + (!notOk ? "sucesso" :
       "falha"));
        System.out.println("Saldo final (conta2): " + conta2.getSaldo());

       }
    }

