import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ohjelma { 
 
    public static void main(String[] args) { 
ArrayList<Integer> l = new ArrayList<>();
l.add(12);
l.add(14);
l.add(18);
l.add(40);
l.add(41);
l.add(42);
l.add(47);
l.add(52);
l.add(59);
int x = 42;

int a = 0;
int b = l.size() - 1;
while (a <= b) {
    int c = a + (b - a) / 2;
    if (x < l.get(c)) {
        b = c - 1;
    } else if (x > l.get(c)) {
        a = c + 1;
    } else {
        System.out.println(1.size());
    }
}

System.out.println("-1");
     }
}