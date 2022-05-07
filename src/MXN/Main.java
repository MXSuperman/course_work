package MXN;

import java.util.Arrays;


public class Main {

    public static void countMinSalary(Employee[] employee) {
        int minimalSalary = employee[9].getSalary();
        for (Employee value : employee) {
            if (value.getSalary() < minimalSalary) {
                minimalSalary = value.getSalary();
            }
        }
        System.out.println("Minimum wage employee: " + minimalSalary + " rub");
    }

    public static void countMaxSalary(Employee[] employee) {
        int maximalSalary = employee[0].getSalary();
        for (Employee value : employee) {
            if (value.getSalary() > maximalSalary) {
                maximalSalary = value.getSalary();
            }
        }
        System.out.println("Maximum wage employee: " + maximalSalary + " rub");
    }

    public static void countMaxAverageSalary(Employee[] employee) {
        int max = 0;
        for (Employee value : employee) {
            max = max + value.getSalary();

        }
        System.out.println("Amount of salary expenses per month: " + max + " rub");

            int medium = max;
            int average = medium / employee.length; // we can use double
            System.out.println("Average salary: " + average);
            System.out.println();
        }


    public static void main(String[] args) {


        // course work

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivan", "Ivanov", "Ivanovish", 55555, 1);
        employee[1] = new Employee("Alex", "Koronov", "Sergeevish", 66666, 2);
        employee[2] = new Employee("Andrey", "Konovalov", "Olegovish", 77777, 1);
        employee[3] = new Employee("Ilya", "Medvedev", "Borisovish", 88888, 3);
        employee[4] = new Employee("Anatoliy", "Vlasov", "Evgenievish", 99999, 4);
        employee[5] = new Employee("Alena", "Batyushkina", "Vitalievna", 101101, 5);
        employee[6] = new Employee("Aleksei", "Konobeevskikh", "Vladimirovish", 111111, 2);
        employee[7] = new Employee("Arseniy", "Poverof", "Genadievish", 90999, 5);
        employee[8] = new Employee("Luisa", "Simanova", "Romanova", 88809, 3);
        employee[9] = new Employee("Sarah", "Konor", "Terminatorova", 98985, 4);
        System.out.println("Staff Book:");
        Arrays.stream(employee).forEach(System.out::println);
        System.out.println();
        countMinSalary(employee);
        countMaxSalary(employee);
        countMaxAverageSalary(employee);

        System.out.println("Full names List:");
        for (Employee value : employee) {
            System.out.println(value.list());
        }
        }
    }



//  int maxDepSalary = employee[0].getSalary()+ employee[1].getSalary();
// for (Employee value : employee) {
//    if (value.getDepartment() == department && maxDepSalary < value.getSalary()) {
//        maxDepSalary = value.getSalary();
//   }
//    System.out.println(department + maxDepSalary);
//int numberInDepartment = 0;
//        for (int i = 0; i < employee.length; i++) {
     //   if (employee[i].getDepartment() == department) {
    //    numberInDepartment = department + 1;
   //     }
    //    }
    //    System.out.println(numberInDepartment);