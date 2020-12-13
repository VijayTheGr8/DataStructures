package MovieTheater;

/**
 * This Main class is simply to test out the three different classes' methods
 * I would love it if you would try it out for yourself!
 *
 * @author vijay
 * @since JDK 1.8
 * @version 1.0
 */

/**
 * Helpful Sources:
 * https://stackoverflow.com/questions/46645539/removing-object-of-arraylist-by-using-its-unique-id
 * https://stackoverflow.com/questions/55079986/i-have-a-problem-with-this-code-cannot-resolve-method-equals-java-lang-string
 * https://stackoverflow.com/questions/1053467/how-do-i-save-a-string-to-a-text-file-using-java
 * https://www.journaldev.com/875/java-read-file-to-string#read-file-to-string-in-java-using-fileinputstream
 *
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("*******************************   Manager Stuff   ************************************************************");

        // managers of Movie Theater
        Manager manager1 = new Manager(1,"Iroh", 55, 100_000, true);
        Manager manager2 = new Manager(2,"Ozai", 46, 10_000_000, true);

        // Iroh manager
        StaffMember member1 = new StaffMember(3, "Aang", 112, 1_000, true, 2005);
        StaffMember member2 = new StaffMember(4, "Katara", 14, 2_000, true, 2005);
        StaffMember member3 = new StaffMember(5, "Sokka", 15, 3_000, true, 2005);
        StaffMember member4 = new StaffMember(6, "Toph", 12, 1_000_000, true, 2005);
        StaffMember member5 = new StaffMember(7, "Zuko", 16, 10, true, 2005);
        // on leave but still managed by Iroh
        StaffMember member6 = new StaffMember(8, "Jet", 16, 2_000_000, false, 2006);

        // Ozai manager
        StaffMember member7 = new StaffMember(9, "Azula", 15, 3_000_000, true, 2006);
        StaffMember member8 = new StaffMember(10, "Mei", 15, 2_000_000, true, 2006);
        StaffMember member9 = new StaffMember(11, "Ty Lee", 14, 2_000_000, true, 2006);
        // on leave but still managed by Ozai
        StaffMember member10 = new StaffMember(12, "Sparky Sparky Boom Man", 40, 50_000, false, 2007);

        // hiring staff
        System.out.println("Iroh's hiring!");
        System.out.println("--------------");
        manager1.hireStaff(member1);
        manager1.hireStaff(member2);
        manager1.hireStaff(member3);
        manager1.hireStaff(member4);
        manager1.hireStaff(member5);
        manager1.hireStaff(member6);

        System.out.println("\nOzai's hiring!");
        System.out.println("----------------");
        manager2.hireStaff(member7);
        manager2.hireStaff(member8);
        manager2.hireStaff(member9);
        manager2.hireStaff(member10);

        // firing staff
        System.out.print("\nIroh's Firing: ");
        manager1.fireStaff(8, "Jet");
        System.out.print("\nOzai's Firing: ");
        manager2.fireStaff(12, "Sparky Sparky Boom Man");

        System.out.println("\n\nIroh's Staff");
        System.out.println("------------");
        System.out.println(manager1.listAllStaffMembers());

        System.out.println("\nOzai's Staff");
        System.out.println("------------");
        System.out.println(manager2.listAllStaffMembers());


        System.out.println("*******************************   Staff Member Stuff   ************************************************************");

        // Aang makes popcorn!
        member1.makePopcorn();
        System.out.println();

        // Let's see how long Zuko has been working here
        String yearsWorking = member5.yearsOfEmployment();
        System.out.println(member5.getName() + " has been working for " + yearsWorking);
        System.out.println("That's rough, buddy...\n");

        // Sokka and Ty Lee loves movies and thought to add their own
        member3.addMovie(new Movie(1, "Ember Island Play", 10));
        member3.addMovie(new Movie(2, "Kung Fu Panda", 9));
        member3.addMovie(new Movie(3, "The Prince Of Egypt", 8));
        member9.addMovie(new Movie(4, "Shark Tale", 3));
        member9.addMovie(new Movie(5, "Shrek the Third", 1));
        System.out.println();

        // Azula (understandably) removes Shark Tale and Mei thinks that everyone should forget about Shrek the Third
        member7.removeMovie(4);
        member8.removeMovie(5);
        System.out.println();

        // Katara, the responsible one, makes sure all the movies are committed
        member4.commitMovieList();
        System.out.println();

        // Katara makes sure that the movies are committed by listing them
        System.out.println("Katara making sure... ");
        String allMovies = member4.listAllMovies();
        System.out.println(allMovies);


        System.out.println("*******************************   Consumer Stuff   ************************************************************");

        Consumer consumer1 = new Consumer(1, "Cabbage Man", 60);

        // Cabbage man just wants to sit back and relax after selling all his cabbages!
        System.out.println("Cabbage man: ");
        String moviesToWatch = consumer1.listAllMovies();
        System.out.println(moviesToWatch);

        consumer1.watchMovie(1);

    }
}
