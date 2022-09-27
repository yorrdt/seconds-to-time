package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 
{   
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours, minutes;
        
        hours = seconds / 3600;
        seconds -= hours * 3600;

        minutes = seconds / 60;
        seconds -= minutes * 60;
        
        System.out.printf("%d:%02d:%02d\n", hours % 24, minutes, seconds);
    }
}
