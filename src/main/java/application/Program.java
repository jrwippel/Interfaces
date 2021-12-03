package application;

import model.entities.Contract;
import model.entities.Installment;
import model.service.CieloService;
import model.service.ContractService;
import model.service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter contract data");
        System.out.print("Number:");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy):");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value:");
        double value = sc.nextDouble();

        Contract contract = new Contract(number, date, value);

        System.out.print("Enter number of installments:");
        int quota = sc.nextInt();

        System.out.print("Whats Service (Cielo/Paypal)(c/p)?");
        char ch = sc.next().charAt(0);

        if (ch == 'p'){
            ContractService contractServiceC = new ContractService(new PaypalService());
            contractServiceC.processContract(contract, quota);
        }else{
            ContractService contractServiceP = new ContractService(new CieloService());
            contractServiceP.processContract(contract, quota);
        }

        System.out.println("Installments:");
        for (Installment obj: contract.getInstallment()){
            System.out.println(obj);
        }

        sc.close();
    }

}
