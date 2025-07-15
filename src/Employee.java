public class Employee {
    String empName;
    String empDept;
    int empSalary;
    float empBonus;
    double currentMonthlySalary;
    double yearlySalary;
    boolean isActive = true;

    public  Employee(String empName, String empDept, int empSalary,
                                float empBonus, double currentMonthlySalary,double yearlySalary) {
        this.empName = empName;
        this.empDept = empDept;
        this.empSalary = empSalary;
        this.empBonus = empBonus;
        this.currentMonthlySalary = currentMonthlySalary;
        this.yearlySalary = yearlySalary;
    }

    public void totalSalaryCalc(){
        currentMonthlySalary= empSalary +empBonus;
        yearlySalary = (empSalary * 12 + empBonus);

                System.out.println("Employee Name:" + empName + ", Employee Department:" + empDept
                    + ", Employee Salary:" + empSalary+ " , Employee Bonus:" + empBonus
                    + ", Employee Current Salary:" + currentMonthlySalary  +" , Employee Yearly Salary "
                    + yearlySalary + ", Employee isActive: " +isActive );
    }

    @Override
    public String toString() {
        return "EmpSalaryCalculator{" +
                "empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empSalary=" + empSalary +
                ", empBonus=" + empBonus +
                ", currentMonthlySalary=" + currentMonthlySalary +
                ", yearlySalary=" + yearlySalary +
                ", isActive=" + isActive +
                '}';
    }






}
