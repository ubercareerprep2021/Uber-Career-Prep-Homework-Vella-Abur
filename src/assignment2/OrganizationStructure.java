package assignment2;
import java.util.*;
public class OrganizationStructure {
    public Employee ceo;

    public static class Employee {
        public String name;
        public String title;
        public List<Employee> directReports;
    }
}

