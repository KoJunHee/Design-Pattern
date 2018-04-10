package ass4_4;

public class SampleFormats {
    public static void main(String[] args) {

        /* Tests */
        BasicFormat basicFormat = new BasicFormat();
        System.out.println("Date : " + basicFormat.formatDate(2005, 7, 4));
        System.out.println("Integer: " + basicFormat.formatLong(1234567));
        System.out.println("Integer: " + basicFormat.formatLong((long) 67.7));
        System.out.println("Money : " + basicFormat.formatMoney(9812345.678));
        System.out.println("Money : " + basicFormat.formatMoney(9812345));
        System.out.println("Money : " + basicFormat.formatMoney(.78));
        System.out.println("Person : " + basicFormat.formatPerson("Weinman", "Jerod", "weinman"));

    }
}


