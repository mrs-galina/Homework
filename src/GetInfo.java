public final class GetInfo {
    private GetInfo() {}
    public static final String COMPANY_NAME = "Company";

    public static void Description() {
        System.out.println("This is the best company in the world");
    }

    public static int CountSalary(int age, int years ){
        return age*years*10000;
    }
}
