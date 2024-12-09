import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private Map<String, List<String>> directory;


    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        directory.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Иванов", "123-456");
        phoneDirectory.add("Иванов", "789-012");
        phoneDirectory.add("Петров", "345-678");
        phoneDirectory.add("Сидоров", "901-234");


        System.out.println("Телефоны Иванова: " + phoneDirectory.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneDirectory.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneDirectory.get("Сидоров"));
        System.out.println("Телефоны несуществующей фамилии: " + phoneDirectory.get("Неизвестный"));
    }
}