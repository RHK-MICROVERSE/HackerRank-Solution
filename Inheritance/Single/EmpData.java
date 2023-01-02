public class EmpData {
    public static void main(String[] args) {
        Employee empdata = new Employee();
        empdata.setname("Robiul");
        empdata.setage(23);
        empdata.setempID("Alpha1010");
        System.out.println("Name: " + empdata.getname());
        System.out.println("Age: " + empdata.getage());
        System.out.println("EmpID: " + empdata.getempID());
    }
    
}
