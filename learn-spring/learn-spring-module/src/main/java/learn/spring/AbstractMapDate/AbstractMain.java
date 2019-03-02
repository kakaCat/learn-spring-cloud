package learn.spring.AbstractMapDate;

public class AbstractMain {

    public static void main(String[] args) {
        InterfaceMapDates A = new AMapDate();
        InterfaceMapDates B = new BMapDate();

        A.putDate("A","A");
        B.putDate("B","B");
        System.out.println("A :"+A.getDate("B"));

        System.out.println("B :"+B.getDate("A"));

    }

}
