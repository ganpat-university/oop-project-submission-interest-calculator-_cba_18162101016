import java.util.*;
import java.lang.*;

class project
{
    public static void main(String []args)
    {
        System.out.println("\t\t\t\t----------------------------------\t\t\t\t");
        System.out.println("\t\t\t\t\tINTEREST CALCULATOR\t\t\t\t\t");
        System.out.println("\t\t\t\t----------------------------------\t\t\t\t");



        Scanner sc = new Scanner(System.in);

        double principle,rate,time,emi;
        double A,P,r,n,t,I;
        double temp;
        int choice;

        System.out.println("->To view the Norms Page press 1");
        System.out.println("->For calculating EMI press");
        System.out.println("->For calculating FD and interest on it press 3");
        System.out.println("Enter your choice:");
         choice = sc.nextInt();

            if(choice==1)
            {
                System.out.println("Norms Page");
            }
           else if(choice==2)
            {
                System.out.print("Enter principal: ");
                principle = sc.nextFloat();

                System.out.print("Enter rate: ");
                rate = sc.nextFloat();

                System.out.print("Enter time in year: ");
                time = sc.nextFloat();

                rate=rate/(12*100);
                time=time*12;

                emi= (principle*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
                System.out.println("****************************************");
                System.out.print("MONTHLY EMI IS:"+emi+"\n");
                System.out.println("****************************************");

            }
            else if(choice==3)
            {
                System.out.print("Enter the principle amount:");
                P=sc.nextDouble();

                System.out.print("Enter the rate:");
                r=sc.nextDouble();

                System.out.print("Enter the time of years:");
                t=sc.nextDouble();
                System.out.print("Enter the no. of years:");
                n=sc.nextDouble();
                temp=(1+r/n);
                A=P*Math.pow(temp,(n*t));
                System.out.println("****************************************");
                System.out.println("FIXED DEPOSIT IS: "+ Math.round(A));

                I=A-P;
                System.out.println("INTEREST EARNED IN RUPEES IS: "+ Math.round(I));
                System.out.println("****************************************");
            }
            else
            {
                System.out.println("Wrong input!!!!!!!");
            }

        }
}

