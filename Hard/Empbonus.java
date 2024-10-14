import java.util.Scanner;
class Empbonus
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int salary,bonus=0;
        System.out.println("enter the salary:");
        salary = in.nextInt();
        char grade;
        System.out.println("enter the gradeA/B:");
        grade=in.next().charAt(0);
        if(salary>10000&&(grade=='a'||grade=='A'))
        {
            bonus=salary*5/100;
        }
        else if(salary>10000 && (grade=='b'||grade=='B')){
            bonus=salary*5/100;
        }
        else if(salary>10000 &&(grade =='b'||grade=='B'))
        {
            bonus=salary*10/100;
        }
        else if(salary<10000 &&(grade=='b'||grade=='B'))
        {
            bonus=salary*12/100;
        }
        else{
            System.out.println("enter the valid input");
        }
        System.out.println("Salary="+salary);
        System.out.println("Bonus="+bonus);
        System.out.println("total to be paid:"+(salary+bonus));
    }
}