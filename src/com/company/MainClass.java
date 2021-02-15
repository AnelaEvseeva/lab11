import java.util.Scanner;

class Sotrudnik{
    String fam, im, otch, doljnost;
    int oklad;
}

public class MainClass{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите количество сотрудников");
        int count=sc.nextInt();
        sc.nextLine();

        Sotrudnik []sotr = new Sotrudnik[count];

        System.out.println("Введите информацию о каждом сотруднике: ");
        for(int i=0; i<sotr.length; i++){
            sotr[i]=new Sotrudnik();

            System.out.println("Введите фамилию "+(i+1)+" сотрудника");
            sotr[i].fam=sc.nextLine();

            System.out.println("Введите его имя");
            sotr[i].im=sc.nextLine();

            System.out.println("Введите его отчество");
            sotr[i].otch=sc.nextLine();

            System.out.println("Введите его должность");
            sotr[i].doljnost=sc.nextLine();

            System.out.println("Введите его оклад");
            sotr[i].oklad=sc.nextInt();
            sc.nextLine();
        }
        System.out.println( "\n Сотрудники фирмы: \n фам \t имя \t отч \t должность \t оклад");
        for(Sotrudnik s : sotr){
            System.out.println(s.fam+ "\t" +s.im+"\t"+s.otch +"\t "+ s.doljnost + "\t\t"+ s.oklad);
        }
    }
}