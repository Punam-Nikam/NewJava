class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidJobProfileException extends Exception {
    public InvalidJobProfileException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class Validator {
    
    public boolean validateName(String name) {
        return name != null && !name.trim().isEmpty();
    }
    
    public boolean validateJobProfile(String jobProfile) {
        if (jobProfile == null) return false;
        String lower = jobProfile.toLowerCase();
        return lower.equals("associate") || lower.equals("clerk") || 
               lower.equals("executive") || lower.equals("officer");
    }
    
    public boolean validateAge(int age) {
        return age >= 18 && age <= 30;
    }
    
    public void validate(Applicant applicant) 
            throws InvalidNameException, InvalidJobProfileException, InvalidAgeException {
        
        if (!validateName(applicant.getName())) {
            throw new InvalidNameException("Invalid name");
        }
        if (!validateJobProfile(applicant.getJobProfile())) {
            throw new InvalidJobProfileException("Invalid job profile");
        }
        if (!validateAge(applicant.getAge())) {
            throw new InvalidAgeException("Invalid age");
        }
    }
}

class Applicant {
    private String name;
    private String jobProfile;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getJobProfile() { return jobProfile; }
    public void setJobProfile(String jobProfile) { this.jobProfile = jobProfile; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

class ExceptionValidation {
    public static void main(String[] args) {
        try {
            Applicant applicant = new Applicant();
            applicant.setName("Jenny");
            applicant.setJobProfile("Clerk");
            applicant.setAge(25);
            
            Validator validator = new Validator();
            validator.validate(applicant);
            System.out.println("Application submitted successfully!");
        } catch (InvalidNameException | InvalidJobProfileException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}