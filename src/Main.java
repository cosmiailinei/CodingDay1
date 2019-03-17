import com.company.Computer;
import model.peripheral.peripherals.Mouse;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Computer computer = new Computer();

        System.out.println(computer.getGeneration());
        computer.setGeneration("AAA");
        System.out.println(computer.getGeneration());

        Mouse mouse1 = new Mouse("USB", "Microsoft");

    System.out.println(mouse1.displayDetails());
    }

}
