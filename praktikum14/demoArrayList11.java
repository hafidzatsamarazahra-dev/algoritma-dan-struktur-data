package praktikum14;
import java.util.ArrayList;
import java.util.Collections;
public class demoArrayList11 {
    public static void main(String[] args) {
    ArrayList<customer11> customers = new ArrayList<>();

    customer11 customer1 = new customer11(1, "Zaskia");
    customer11 customer2 = new customer11(5, "Budi");

    customers.add(customer1);
    customers.add(customer2);

    customers.add(new customer11(4, "Cica"));

    customers.add(2, new customer11(100, "Rosa"));

    System.out.println(customers.indexOf(customer2));

    customer11 customer = customers.get(1);
    System.out.println(customer.name);
    customer.name = "Budi Utomo";

    ArrayList<customer11> newCustomers = new ArrayList<>();
    newCustomers.add(new customer11(201, "Della")); 
    newCustomers.add(new customer11(202, "Victor")); 
    newCustomers.add(new customer11(203, "Sarah")); 

    customers.addAll(newCustomers);

    for (customer11 cust : customers){
        System.out.println(cust.toString());
    }

    ArrayList<String> daftarSiswa = new ArrayList<>();
    daftarSiswa.add("Zainab");
    daftarSiswa.add("Andi");
    daftarSiswa.add("Rara");
    Collections.sort(daftarSiswa);

    System.out.println(daftarSiswa);

    customers.sort((c1,c2)->c1.name.compareTo(c2.name));
    // System.out.println(customers);
    }
}
