public class FormLetterWriter
{
    public static void main(String[] args)
    {
        String lastName = "Manor";
        String firstName = "Tea";

        displaySalutation(lastName);
        displaySalutation(firstName, lastName);
    }

    private static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms. " + lastName);
        System.out.println("Thank you for your recent order.");
    }

    private static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order.");
    }
}
