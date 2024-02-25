public class Main {
    public static void main(String[] args) {
        //Account ex
        System.out.println("Account ex");
        Account a1 = new Account("1","ahmed",1000);
        Account a2 = new Account("2","omar",500);
        System.out.println("before:-");
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        int transferredAmount = a1.transferTo(a2,500);

        System.out.println(a1.getName()+" transferred to "+ a2.getName()+" this amount: " +transferredAmount);

        System.out.println(a1.getName()+" added " + a1.credit(150));

        System.out.println(a2.getName()+ " withdraw "+a2.debit(250));

        System.out.println("after:-");
        System.out.println(a1.toString());
        System.out.println(a2.toString());


        System.out.println("--------------------------------------------------------------------------------------------------------------\n");
        //Employee ex
        System.out.println("Employee ex");
        Employee e1 = new Employee("1","ahmed",5000);

        System.out.println("before: "+e1.toString());

        System.out.println("annual salary: " +e1.getAnnualSalary());

        System.out.println("employee "+e1.getName()+" got a raise by "+ e1.raisedSalary(5)+"%");

        System.out.println("after: "+e1.toString());
        System.out.println("annual salary: " +e1.getAnnualSalary());




    }
}