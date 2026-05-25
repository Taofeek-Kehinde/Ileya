public class TaskOne {

public static void main(String[] args) {

int[] listNumbers = {45, 60, 3, 10, 9, 22};

for(int numbers : listNumbers) if(numbers % 2 != 0)
    System.out.print( "[" + numbers + "]" + " ");

for(int numbers : listNumbers) if (numbers % 2 == 0) 
    System.out.print(numbers + " ");

}

}
