package Management_Exc;

import java.io.*;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    /**
     * TODO this implementation
     * Stores the given list of persons to the text "people.csv" in project directory
     * The first column should be its classification, whether Customer, Developer, Employee, or Manager
     * The next columns are the following in order -- name, age, salary (if Customer, 0.0)
     * @param persons the list of persons
     */
    public static void storeToFile(List<Person> persons) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("people.txt"))) {
            for (Person p : persons) {
                String className = p.getClass().getSimpleName();
                String name = p.getName();
                int age = p.getAge();
                double salary = 0.0;

                // Only Employee (and subclasses) have a salary
                if (p instanceof Employee emp) {
                    salary = emp.getSalary();
                }

                // Format: ClassName,Name,Age,Salary
                String line = className + "," + name + "," + age + "," + salary;
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * TODO this implementation
     * Loads the saved details of people from "people.txt" to the list of persons
     * The first column is its classification, whether Customer, Developer, Employee, or Manager
     * The next columns are the following in order -- name, age, salary (if Customer, 0.0)
     * @param persons the list of persons
     */
    public static void retrieveFromFile(List<Person> persons) {
        try (BufferedReader br = new BufferedReader(new FileReader("people.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length < 3) continue; // safety check

                String className = parts[0];
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                double salary = 0.0;

                if (parts.length >= 4) {
                    salary = Double.parseDouble(parts[3]);
                }

                Person p;
                switch (className) {
                    case "Developer":
                        p = new Developer(name, age, salary);
                        break;
                    case "Manager":
                        p = new Manager(name, age, salary);
                        break;
                    case "Employee":
                        p = new Employee(name, age, salary);
                        break;
                    case "Customer":
                        p = new Customer(name, age);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown class: " + className);
                }

                persons.add(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param manager the manager to give the salary
     * @param employee the employee to receive the raise
     * @param salary the salary increase to be given
     * @throws ClassCastException when manager or employee is not a manager or employee
     * @throws IllegalArgumentException when salary is invalid
     * @throws NoSuchElementException when given manager or employee does not exist in the list of persons
     */
    public static void giveRaise(List<Person> persons, String manager, String employee, double salary)  {

        Person emp = null;
        Person manage = null;

        // fine manager and emploeee
        for(Person p : persons){
            if(p.getName().equals(manager)){
                manage = p;
            }

            if(p.getName().equals(employee)){
                emp = p;
            }
        }

        if(emp == null){
            throw new NoSuchElementException(employee + " does not exist");
        }

        if(manage == null){
            throw new NoSuchElementException(manager + " does not exist");
        }

        if(!(manage instanceof Manager)){
            throw new ClassCastException(manager + " is not a manager");
        }

        if(!(emp instanceof Employee)){
            throw new ClassCastException(employee + " is not an employee");
        }

        if(salary < 0){
            throw new IllegalArgumentException("Raise must be non-negative");
        }

        Employee ee = (Employee) emp;
        ee.setSalary(ee.getSalary() + salary);

        Manager mm = (Manager) manage;
        mm.setSalary((salary * 0.5) + mm.getSalary());
    }


    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param developer the developer to be assigned
     * @param manager the manager assigned to the dev
     * @throws ClassCastException when manager or developer is not a manager or employee
     * @throws NoSuchElementException when given manager or developer does not exist in the list of persons
     * @throws IllegalStateException when developer already has a manager
     */
    public static void assignPM(List<Person> persons, String developerName, String managerName) {
        Person dev = null;
        Person manage = null;

        // 1. Find developer and manager
        for (Person p : persons) {
            if (p.getName().equals(developerName)) {
                dev = p;
            }
            if (p.getName().equals(managerName)) {
                manage = p;
            }
        }

        // 2. Check if they exist
        if (dev == null) {
            throw new NoSuchElementException(developerName + " does not exist");
        }
        if (manage == null) {
            throw new NoSuchElementException(managerName + " does not exist");
        }

        // 3. Type checks
        if (!(dev instanceof Developer)) {
            throw new ClassCastException(developerName + " is not a developer");
        }
        if (!(manage instanceof Manager)) {
            throw new ClassCastException(managerName + " is not a manager");
        }

        Developer developer = (Developer) dev;
        Manager manager = (Manager) manage;

        if (developer.getProjectManager() != null) {
            throw new IllegalStateException(developerName + " already has a manager: " + developer.getProjectManager().getName());
        }

        developer.setProjectManager(manager);

    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param customer the customer to speak to the employee
     * @param employee the employee to be spoken to
     * @return the dialogue of the customer to the employee
     * @throws ClassCastException when given customer or employee is not what they are
     * @throws NoSuchElementException when given customer or employee is not in the list of persons
     */
    public static String customerSpeak(List<Person> persons, String customer, String employee) {
        Person cust = null;
        Person emp = null;

        for(Person p : persons){
            if(p.getName().equals(employee)){
                emp = p;
            }

            if(p.getName().equals(customer)){
                cust = p;
            }

        }

        if(cust == null){
            throw new NoSuchElementException(customer + " does not exist");
        }

        if(emp == null){
            throw new NoSuchElementException(employee + " does not exist");
        }

        if(!(cust instanceof Customer)){
            throw new ClassCastException(customer + " is not a customer");
        }

        if(!(emp instanceof Employee)){
            throw new ClassCastException(employee + " is not an employee");
        }

        Employee employeeObj = (Employee) emp;

        // 4. Check if employee is Developer with project manager
        if (employeeObj instanceof Developer dev && dev.getProjectManager() != null) {
            return "Can I see your manager " + dev.getProjectManager().getName() + "?";
        }

        // 5. Default dialogue
        return "Oh, hello, " + employeeObj.getName() + ". Can you assist me?";
    }
}
