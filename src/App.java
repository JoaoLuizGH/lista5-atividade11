import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner tc = new Scanner(System.in);

        System.out.println("Favor informar o dia: ");
        int dia = tc.nextInt();
        System.out.println("Favor informar o mês: ");
        int mes = tc.nextInt();
        System.out.println("Favor informar o ano: ");
        int ano = tc.nextInt();
        tc.close();
        extenso(dia, mes, ano);
    }

    static void extenso(int dia, int mes, int ano) {
        if (mes == 1) {
            System.out.println(dia + "/Janeiro/" + ano);
        } else if (mes == 2) {
            System.out.println(dia + "/Fevereiro/" + ano);
        } else if (mes == 3) {
            System.out.println(dia + "/Março/" + ano);
        } else if (mes == 4) {
            System.out.println(dia + "/Abril/" + ano);
        } else if (mes == 5) {
            System.out.println(dia + "/Maio/" + ano);
        } else if (mes == 6) {
            System.out.println(dia + "/Junho/" + ano);
        } else if (mes == 7) {
            System.out.println(dia + "/Julho/" + ano);
        } else if (mes == 8) {
            System.out.println(dia + "/Agosto/" + ano);
        } else if (mes == 9) {
            System.out.println(dia + "/Setembro/" + ano);
        } else if (mes == 10) {
            System.out.println(dia + "/Outubro/" + ano);
        } else if (mes == 11) {
            System.out.println(dia + "/Novembro/" + ano);
        } else {
            System.out.println(dia + "/Dezembro/" + ano);
        }
    }
}