import javax.swing.*;

public class House1 {
    public static void main(String[] args) {

        House house = new House();

        System.out.println(house.toString());

        house.setPrice(-17);

        System.out.println(house.getPrice());
    }
}
