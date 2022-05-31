package PracticesDemo;

 class Employee1 implements Comparable<Employee1>{

     public int id;
     public double salary;
     public int year;

    public Employee1(int id, double salary, int year) {
        this.id = id;
        this.salary = salary;
        this.year = year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public int getYear() {
        return year;
    }



    public int compareTo(Employee1 e) {
       if(salary>e.salary)
        return 1;
       else if(salary<e.salary)
           return -1;
       else if(salary==e.salary)
           return 0;
        return 0;
    }
}

