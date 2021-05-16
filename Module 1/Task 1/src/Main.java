public class Main {
    private static String name = "Sasha";
    private static int age = 26;
    private static String address = "Kiev";
    private static String phone = "380 666 85 21 86";

    public Main() {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(phone);
    }
}
