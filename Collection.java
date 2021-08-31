


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isabella
 */
import java.util.*;
class Collection{
   public static void main(String[] args) {
       ArrayList<String> names = new ArrayList<>();
       names.add("Sarah");
       names.add("Donny");
       names.add("Valery");
       names.add("Sam");
       names.add("Ryan");
       names.add("Yasmine");
       names.add("Isabella");
       names.add("Melissa");
       System.out.println("Names:");
       names.forEach(s -> {
           System.out.println(s);
       });
       System.out.println("\nAfter sorting: ");
       Collections.sort(names);
       names.forEach(s -> {
           System.out.println(s);
       });
       System.out.println("\nAfter shuffle:");
       Collections.shuffle(names);
       names.forEach(s -> {
           System.out.println(s);
       });
       String findElement = "Donny";
       String notFoundElement = "ABD";
       System.out.println("Positon of "+findElement+": "+names.indexOf(findElement));
       System.out.println("Positon of "+notFoundElement+": "+names.indexOf(notFoundElement));
       System.out.println("\nAfter converting to array:");
       String[] arr = new String[names.size()];
       arr = names.toArray(arr);
       for(String s : arr){
           System.out.println(s);
       }
       System.out.println("\nAfter converting to list:");
       List<String> list = Arrays.asList(arr);
       list.forEach(s -> {
           System.out.println(s);
       });
   }
}

