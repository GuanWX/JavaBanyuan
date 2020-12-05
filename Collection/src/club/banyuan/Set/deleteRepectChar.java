package club.banyuan.Set;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/3 10:43 上午
 */
public class deleteRepectChar {
    public static void main(String[] args) {
        LinkedHashSet<Character> characters = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars =  str.toCharArray();
        for (char c :chars) {
            characters.add((Character) c);
        }
        System.out.println(characters);

    }
}
