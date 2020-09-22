import java.util.Arrays;

class Application {

    String name;

    void run(String[] args) {
        // implement me
        System.out.println(name);
        for(String cell: args) {
            System.out.println(cell);
        }
    }
}