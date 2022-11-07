package SimpleFactory.nvWa;


public class Nvwa {
    public static void main(String[] args) {
        Person person;
        person = NvWaFactory.getPerson("M");
        person.createPerson();
    }
}
