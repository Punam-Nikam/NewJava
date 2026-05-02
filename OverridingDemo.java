class Faculty {
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;

    public Faculty(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonusPercentage = 4.0f;
        this.carAllowancePercentage = 2.5f;
    }

    public float calculateSalary() {
        float bonus = basicSalary * bonusPercentage / 100;
        float carAllowance = basicSalary * carAllowancePercentage / 100;
        return basicSalary + bonus + carAllowance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public float getCarAllowancePercentage() {
        return carAllowancePercentage;
    }

    public void setCarAllowancePercentage(float carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }
}

class OfficeStaff extends Faculty {
    private String designation;

    public OfficeStaff(String name, float basicSalary, String designation) {
        super(name, basicSalary);
        this.designation = designation;
    }

    @Override
    public float calculateSalary() {
        float baseSalary = super.calculateSalary();
        float additionalPay = 0;
        switch(designation) {
            case "Manager":
                additionalPay = 10000;
                break;
            case "Accountant":
                additionalPay = 8000;
                break;
            case "Clerk":
                additionalPay = 5000;
                break;
            default:
                break;
        }
        return baseSalary + additionalPay;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

class Teacher extends Faculty {
    private String qualification;

    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }

    @Override
    public float calculateSalary() {
        float baseSalary = super.calculateSalary();
        float additionalPay = 0;
        switch(qualification) {
            case "PhD" -> additionalPay = 15000;
            case "Masters" -> additionalPay = 10000;
            case "Bachelor" -> additionalPay = 5000;
            default -> {
            }
        }
        return baseSalary + additionalPay;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}

class OverridingDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Kitkat", 30500f, "Masters");
        OfficeStaff officeStaff = new OfficeStaff("Games", 24000f, "Accountant");

        System.out.println("Teacher Details\n***************");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Qualification: " + teacher.getQualification());
        System.out.println("Total salary: $" + Math.round(teacher.calculateSalary() * 100) / 100.0);
        System.out.println();

        System.out.println("Office Staff Details\n***************");
        System.out.println("Name: " + officeStaff.getName());
        System.out.println("Designation: " + officeStaff.getDesignation());
        System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary() * 100) / 100.0);
    }
}