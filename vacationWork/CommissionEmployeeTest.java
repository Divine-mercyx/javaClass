public class CommissionEmployeeTest {

    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Divine", "Mercy", "123678653", 0.06, 10000);
        System.out.println(employee);
        System.out.println(employee.earning());
    }
}
