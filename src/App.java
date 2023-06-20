import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = teclado.nextLine();

        System.out.print("Digite o regime de pagamento, se for clt e pj digite em maiusculo e o H de horista em maiusculo (CLT, Horista ou PJ): ");
        String regimePagamentos = teclado.nextLine();

        double valorAReceber = 0.0;

        if (regimePagamentos.equals("CLT")) {
            System.out.print("Digite o salário mensal do professor: ");
            double salarioMensal = teclado.nextDouble();
            valorAReceber = salarioMensal;

        } else if (regimePagamentos.equals("Horista")) {
            System.out.print("Digite o número de horas trabalhadas pelo professor: ");
            double horasTrabalhadas = teclado.nextDouble();

            System.out.print("Digite o valor da hora de trabalho: ");
            double valorHoraTrabalho = teclado.nextDouble();

            valorAReceber = horasTrabalhadas * valorHoraTrabalho;

        } else if (regimePagamentos.equals("PJ")) {
            System.out.print("Digite o valor do contrato do professor: ");
            double valorContrato = teclado.nextDouble();
            valorAReceber = valorContrato;

        } else {
            System.out.println("Regime de pagamento inválido!");
            System.exit(0);
        }

        System.out.println("Nome do professor: " + nomeProfessor);
        System.out.println("Valor a receber: " + valorAReceber);
        teclado.close();
    }
}