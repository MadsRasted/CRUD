public class Main {

    public static void main(String[] args) {

        ICrud arr = new ArrayListRepository();

        arr.create(new Person("Mads", 22));
        arr.create(new Person("Nick", 26));
        System.out.println(arr.read(0));
        System.out.println(arr.read(1));
        arr.update(new Person("Søren", 22), 1);
        System.out.println(arr.read(1));

    }
}
