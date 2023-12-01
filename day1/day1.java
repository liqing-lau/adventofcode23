import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1 {

    static int read_file_part_1(File filename) { 
        try {
            int total = 0;
            Scanner scanner = new Scanner(filename);
            while (scanner.hasNextLine()) {
                total += get_digits_part_1(scanner.nextLine());
            }
            scanner.close();
            return total;

        } catch (FileNotFoundException e) {
            System.out.println("An error has occured");
            return 0;
        }
    }

    static int read_file_part_2(File filename) { 
        try {
            int total = 0;
            Scanner scanner = new Scanner(filename);
            while (scanner.hasNextLine()) {
                total += get_digits_part_2(scanner.nextLine());
            }
            scanner.close();
            return total;

        } catch (FileNotFoundException e) {
            System.out.println("An error has occured");
            return 0;
        }
    }

    static int get_digits_part_1(String string) {
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                num.append(string.charAt(i));
                break;
            }
        }

        for (int i = string.length() - 1; i > -1; i--) {
            if (Character.isDigit(string.charAt(i))) {
                num.append(string.charAt(i));
                break;
            }
        }
        return Integer.parseInt(num.toString());
    }

    
    static int get_digits_part_2(String string) {
        string = string.replaceAll("one", "o1e");
        string = string.replaceAll("two", "t2o");
        string = string.replaceAll("three", "t3e");
        string = string.replaceAll("four", "f4r");
        string = string.replaceAll("five", "f5e");
        string = string.replaceAll("six", "s6x");
        string = string.replaceAll("seven", "s7n");
        string = string.replaceAll("eight", "e8t");
        string = string.replaceAll("nine", "n9e");
        int num = get_digits_part_1(string);
        return num;
    }

    public static void main(String[] args) {
        System.out.print("part1=");
        System.out.println(read_file_part_1(new File("inputData.txt")));
        System.out.print("part2=");
        System.out.println(read_file_part_2(new File("inputData.txt")));

    }
}