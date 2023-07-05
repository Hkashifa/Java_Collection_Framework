import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class Problem_1_to_7 {
    public static void main(String[] args){
        //Problem 1
        ArrayList<String> colors = new ArrayList<>();
        // Add elements
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("indigo");
        colors.add("violet");

        System.out.println("ArrayList: " + colors);

//     //Problem2
//         for(String s : colors)
//         {
//             System.out.println(s);
//         }
//
//         //Problem 3
//        colors.add(0,"yellow");
//        System.out.println("ArrayList: " + colors);
//
//        //Problem 4
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter index- ");
//        int a= sc.nextInt();
//        System.out.println(colors.get(a));
//
//        //Problem 5
//        Scanner sm= new Scanner(System.in);
//        System.out.print("Index of element you want to changes- ");
//        int b= sm.nextInt();
//        Scanner sd= new Scanner(System.in);
//        System.out.print("Enter new colour: ");
//        String str= sd.nextLine();
//        colors.set(a,str);
//        System.out.println("ArrayList: " + colors);
//
//        //Problem 6
//        colors.remove(2);
//        System.out.println("ArrayList: " + colors);
//
//        //Problem 7
//        Scanner se= new Scanner(System.in);
//        System.out.print("Search for colour: ");
//        String src= se.nextLine();
//        for(String s : colors)
//        {
//            if(s.equals(src)) {
//                System.out.println(src);
//            }
//
//        }
//
//        //Problem 8
//        System.out.println("List before sort: "+colors);
//        Collections.sort(colors);
//        System.out.println("List after sort: "+colors);
//
//       // Problem 9
//        ArrayList<String> colorShuffle = new ArrayList<>(Arrays.asList("", "", "","", "", "",""));
//        System.out.println("UnShuffled list: "+colorShuffle);
//        int rnd;
//        for (String sr: colors)
//        {
//            rnd=  (int) ((Math.random() * (6 - 0)) + 0);
//            System.out.println("rnd:"+rnd);
//            colorShuffle.add(rnd,sr);
//        }
//        System.out.println("Shuffled list: "+colorShuffle);
//
////        //Problem 11
//        ArrayList<String> colorsReverse = new ArrayList<>();
//
//        for (int i=0;i<7;i++)
//        {
//            colorsReverse.add(colors.get(6-i));
//        }
//        System.out.println("Reversed list: "+colorsReverse);
//
//        //Problem 12
//        ArrayList<String> colorsPortion = new ArrayList<>();
//        Scanner sf= new Scanner(System.in);
//        Scanner sg= new Scanner(System.in);
//        System.out.print("Enter range- ");
//        int l= sf.nextInt();
//        int r= sg.nextInt();
//        for(int i = l; i<r; i++)
//        {
//            colorsPortion.add(colors.get(i));
//        }
//        System.out.println("Partial list: "+colorsPortion);
//
        //Problem13
        ArrayList<String> daysOfTheWeek=
        new ArrayList<>(Arrays.asList("Sunday", "Monday", "Tuesday","Wednesday", "Thursday", "Friday","Saturday"));
         int difference;
        for(int j = 0; j<7; j++)
        {
            difference = colors.get(j).compareTo(daysOfTheWeek.get(j));
            System.out.println("Strings:"+daysOfTheWeek.get(j)+" "+colors.get(j)+" Difference "+difference);
        }

        //Problem 14
        System.out.println("Before Swap");
        System.out.println("Colors"+colors);
        System.out.println("Week"+ daysOfTheWeek);
        for(int j = 0; j<7; j++)
        {
            String temp  = "";
            temp = colors.get(j);
            colors.set(j,daysOfTheWeek.get(j)) ;
            daysOfTheWeek.set(j,temp);
        }
        System.out.println("After Swap");
        System.out.println("Colors"+daysOfTheWeek);
        System.out.println("Week"+colors);

        for(int j = 0; j<7; j++)
        {
            String temp  = "";
            temp = colors.get(j);
            colors.set(j,daysOfTheWeek.get(j)) ;
            daysOfTheWeek.set(j,temp);
        }
        //Problem 15
        ArrayList<String> secondList= new ArrayList<>();
        for(int k = 0; k<7; k++)
        {
            secondList.add(colors.get(k));
        }
        for(int m = 0; m<7; m++)
        {
            secondList.add(daysOfTheWeek.get(m));
        }
        System.out.println("Second List"+secondList);

        //Problem 17

            secondList.removeAll(secondList);

        System.out.println("Second List"+secondList);

        //Problem 18
        if(secondList.isEmpty())
        {
            System.out.println("List is empty");
        }

        //Problem 19
        System.out.println("Original array list: " + colors);
        System.out.println("Let trim to size the above array: ");
        colors.trimToSize();
        System.out.println(colors);

        //Problem 20

        colors.ensureCapacity(4);
        System.out.println("Original array list: " + colors);

        //Problem 22
        for(int p = 0; p<7; p++)
        {
           System.out.println(colors.get(p));
        }

    }

}
