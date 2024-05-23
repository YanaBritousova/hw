package Task3;


import java.util.Scanner;


public class Main {
    public static void printStr(String first, String second, String third, int len){
        String str = "";
        if (first.length()==len) str = first;
        else if (second.length()==len) str=second;
        else str=third;
        System.out.println("String "+str+" with length "+len);
    }

    public static void isDiffChars(String str){
        boolean flag = true;
        for (int i=0;i<str.toCharArray().length;i++){
            for (int j=i+1;j<str.toCharArray().length-1;j++){
                if (str.toCharArray()[i]==str.toCharArray()[j]){
                    flag = false;
                    break;
                }
            }
        }
        if (flag) System.out.println(str);
    }

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Input first string:");
        String first = s.nextLine();
        System.out.println("Input second string:");
        String second = s.nextLine();
        System.out.println("Input third string:");
        String third = s.nextLine();

        int firstLen = first.length();
        int secLen = second.length();
        int thirdLen = third.length();

        //task 1
        System.out.println("Min str");
        int minLen = Math.min(firstLen,Math.min(secLen,thirdLen));
        printStr(first,second,third,minLen);

        System.out.println("Max str");
        int maxLen = Math.max(firstLen,Math.max(secLen,thirdLen));
        printStr(first,second,third,maxLen);

        //task 2
        int medium = (firstLen+secLen+thirdLen)/3;
        System.out.println("Medium len is "+medium);
        if (firstLen<medium) System.out.println("String "+first+" with length "+firstLen);
        if (secLen<medium) System.out.println("String "+second+" with length "+secLen);
        if (thirdLen<medium) System.out.println("String "+third+" with length "+thirdLen);

        //task 3
        System.out.println("String with different symbols: ");
        isDiffChars(first);
        isDiffChars(second);
        isDiffChars(third);



        //task 4
        StringBuffer sb = new StringBuffer();
        for (char c:first.toCharArray()){
            sb.append(c);
            sb.append(c);
        }
        System.out.println("First string with repeated symbols: "+sb);
    }
}
