package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("Tony Stark", "649 Marvel Rd", "747-7777", "645-34-2668", 20000.0);
        staffList[1] = new Executive("Dwanye Johnson", "987 Rock St", "747-5678", "123-48-2889", 4600.0);
        staffList[2] = new StaffEmployee("DJ Khaled", "654 Rugby Rd", "747-8765", "345-76-1745", 6500.0);
        staffList[3] = new TempEmploee("Will Smith", "251 N Bristol Ave", "747-4321", "764-84-8543", 2.0);
        staffList[4] = new TempEmploee("Elon Musk", "654 Tesla St", "747-9876", "752-43-6731", 19.0);
        staffList[5] = new StaffEmployee("Shaquille O'Neal", "987 Tornado Dunk St", "747-5432", "373-23-8674", 7800.0);


        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
