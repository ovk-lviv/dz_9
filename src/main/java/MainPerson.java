public class MainPerson {

    public static void main(String[] args) {
        Woman w1 = new Woman ("Jane", "Doe", 61, false);
        System.out.println(w1.getLastName());
        w1.setMaidenName();
        System.out.println(w1.getMaidenName());

        Man m1 = new Man("Dean", "Stockwell", 66, false);
        m1.registerPartnership();
        System.out.println(m1.isPartner());

        w1.registerPartnership(m1);
        System.out.println(w1.isPartner());
        System.out.println(w1.getLastName());

        w1.deregisterPartnership(m1);
        System.out.println(w1.getLastName());
        System.out.println(m1.isPartner());

        System.out.println(m1.isRetired());
        System.out.println(w1.isRetired());
    }
}
