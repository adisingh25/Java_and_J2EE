package Q11_Threading;

import java.util.ArrayList;
import java.util.Scanner;

public class Thread2 extends Thread{
    public void run() {
        String input;
        ArrayList<Character> vowelList = new ArrayList<Character>();
        vowelList.add('a');
        vowelList.add('e');
        vowelList.add('i');
        vowelList.add('o');
        vowelList.add('u');
        System.out.print("Enter the input text : - ");
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        char []inputText = input.toCharArray();
        int vowelCount = 0;
        for(int i=0; i<input.length(); i++) {
            char target = inputText[i];
            if(vowelList.contains(target)) {
                vowelCount++;
            }

        }
        System.out.println("The vowel count is " + vowelCount);
    }

}
