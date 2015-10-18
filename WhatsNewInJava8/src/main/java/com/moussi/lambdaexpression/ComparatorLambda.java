package com.moussi.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://github.com/Moussi/Whats_New_In_Java8
 * @author MOUSSI Aymen
 *
 */public class ComparatorLambda {
  public static void main(String[] args) {
    Comparator<String> comparator = new Comparator<String>() {

      @Override
      public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
      }
    };

    Comparator<String> lambdaComparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

    System.out.println("----------Standart Comparator---------");
    sortWithComparator(comparator);
    System.out.println("----------Lambda Comparator-----------");
    sortWithComparator(lambdaComparator);
  }

  private static void sortWithComparator(Comparator<String> comparator) {
    List<String> list = Arrays.asList("***", "**", "****", "*");
    Collections.sort(list, comparator);
    for (String s : list) {
      System.out.println(s);
    }
  }
}
