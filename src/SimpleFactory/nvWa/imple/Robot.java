package SimpleFactory.nvWa.imple;

import SimpleFactory.nvWa.Person;


public class Robot extends Person {
    @Override
    public void createPerson() {
        System.out.println("女娲造出机器人");
    }
}
