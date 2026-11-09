
import java.util.Scanner;

public class duplicateelimination {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int[] numbers = new int[10];

for (int i = 0; i < 10; i++) {
numbers[i] = -1;
}

int count = 0;

for (int i = 0; i < 10; i++) {

System.out.print("Enter a number: ");
int num = input.nextInt();

if (num >= 10 && num <= 100) {

boolean found = false;

for (int j = 0; j < count; j++) {
if (numbers[j] == num) {
found = true;
break;
}
}

if (found == false) {
numbers[count] = num;
count++;
}

} else {
System.out.println("Enter a number between 10 and 100.");
i--;
}
}

System.out.println("Unique numbers:");

for (int i = 0; i < count; i++) {
System.out.println(numbers[i]);
}

}
}
