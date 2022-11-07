package SimpleFactory.nvWa;


import SimpleFactory.nvWa.imple.Man;
import SimpleFactory.nvWa.imple.Robot;
import SimpleFactory.nvWa.imple.WoMan;

public class NvWaFactory {
    public static Person getPerson(String type) {
        Person person = null;
        if (type.equalsIgnoreCase("M")) {
            person = new Man();
        } else if (type.equalsIgnoreCase("W")) {
            person = new WoMan();
        } else if (type.equalsIgnoreCase("R")) {
            person = new Robot();
        }
        return person;
    }
}