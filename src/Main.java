public class Main {
    public static void main(String[] args) {
    Accountant myAccountant1 = new Accountant("Mathew","Moses",
            +239044984,"No.3 Bank Road, Benin city",
            "joseph99@gmail.com","20-01-1999");
  Staff myStaff = new Staff("Opeyemi","Moses",+123233,"No.20",
          "geee@gmail.com",
          "20-30-2022");
  CEO myCEO = new CEO("Innocent","Omenka",+2365377,
          "Decagon","email@gmail.com", "22-3-2020");
   myCEO.fire();
         myAccountant1.paySalary();
            System.out.println(" Accountant Firstname " + myAccountant1.getFirstName());

        Manager myManager =new Manager("Abdul","Abdulgeee",+4426526,"17b decagon",
                "geemail@mail","20-2-2020");
            myManager.assignTask();
           myManager.issueQuery();

        Applicant myApplicant1 = new Applicant("Musa", "Sani",
                +2368788,"No.12,Waff Road",
                "musa@gmail.com","12-03-1993");

    }
}