package main;

    class Emp {
    protected String name;
    protected String address;
    protected String phone;
    protected String socialSecurityNumber;
    protected double payRate;

    public Emp(String name, String address, String phone,String socialSecurityNumber, double payRate) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    public String toString() {
        return "Name: " + name + "\nAddress: " + address +
               "\nPhone: " + phone;
    }

    public double pay() {
        return payRate;
    }

    public int getVacationDays() {
        return 10; 
    }
}

    class Executive extends Emp {
        private double bonus;

        public Executive(String name, String address, String phone,
                         String socialSecurityNumber, double payRate) {
            super(name, address, phone, socialSecurityNumber, payRate);
            bonus = 0;
        }

        public void awardBonus(double execBonus) {
            bonus = execBonus;
        }

        @Override
        public double pay() {
            double payment = super.pay() + bonus;
            bonus = 0;
            return payment;
        }

        @Override
        public int getVacationDays() {
            return 30; // Executives get more vacation
        }
    }
    
    class Hourly extends Emp {
        private int hoursWorked;

        public Hourly(String name, String address, String phone,
                      String socialSecurityNumber, double payRate) {
            super(name, address, phone, socialSecurityNumber, payRate);
            hoursWorked = 0;
        }

        public void addHours(int moreHours) {
            hoursWorked += moreHours;
        }

        @Override
        public double pay() {
            double payment = payRate * hoursWorked;
            hoursWorked = 0;
            return payment;
        }

        @Override
        public int getVacationDays() {
            return 5; // Hourly workers get less vacation
        }
    }
    
    class Staff {
        private Emp[] staffList;

        public Staff() {
            staffList = new Emp[3];

            staffList[0] = new Executive("Smriti", "Kathmandu", "9800000000",
                    "123-45-6789", 2423.07);

            staffList[1] = new Hourly("Yuri", "Kathmandu", "980000000",
                    "987-65-4321", 12.55);

            staffList[2] = new Emp("Bhawana", "Kathmandu", "9800000000",
                    "111-22-3333", 1045.00);

            ((Executive) staffList[0]).awardBonus(500.00);
            ((Hourly) staffList[1]).addHours(40);
        }

        public void payday() {
            for (Emp staffMember : staffList) {
                System.out.println(staffMember);
                System.out.println("Vacation Days: " + staffMember.getVacationDays());

                double amount = staffMember.pay();

                if (amount == 0.0)
                    System.out.println("Thanks!");
                else
                    System.out.println("Paid: Rs " + amount);

                System.out.println("-----------------------------------");
            }
        }
    }




public class Firm {
	public static void main(String[] args) {
        Staff personnel = new Staff();
        personnel.payday();
    }

}
