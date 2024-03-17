public class Person {
    public static String personInfo(String firstName, String lastName, String city, String phoneNumber) {
        return "Позвонить гражданину " +
                firstName + " " + lastName + " из города " +
                city + " можно по номеру " + phoneNumber + ".";
    }
    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", "Нью-Йорк", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Шанхай", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "Лондон", "37742123513"));
    }
}
