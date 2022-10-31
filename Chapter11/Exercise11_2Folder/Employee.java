package Chapter11.Exercise11_2Folder;

public class Employee {
        private int office;
        private double salary;
        private MyDate dateHired;
    
        public Employee(int office, double salary, MyDate dateHired) {
            this.office = office;
            this.salary = salary;
            this.dateHired = dateHired;
        }
        public Employee(String name, String address, String phone, 
            String email, int office, double salary) {
            super();
            this.office = office;
            this.salary = salary;
            this.dateHired = new MyDate();
        }
        public int getOffice() {
            return office;
        }
        public String getSalary() {
            return String.format("%.2f", salary);
        }
        public String getDateHired() {
            return dateHired.getMonth() + "/" + dateHired.getDay() 
                     + "/" + dateHired.getYear();
        }
        public void setOffice(int office) {
            this.office = office;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setDateHired() {
            dateHired = new MyDate();
        }
        public String toString() {
            return super.toString() + "\nOffice: " + office + 
                     "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
        }
}
