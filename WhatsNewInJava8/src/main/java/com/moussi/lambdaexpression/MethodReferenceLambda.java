package com.moussi.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author AMOUSSI
 *
 */
public class MethodReferenceLambda {

  public static void main(String[] args) {

    Comparator<Integer> comparator = (i1, i2) -> Integer.compare(i1, i2);
    Comparator<Integer> comparator2 = Integer::compare;
    List<Integer> list = Arrays.asList(1,7,3,10);

    System.out.println("----------Lambda Comparator---------");
    sortList(comparator, list);
    System.out.println("----------Method Reference Lambda Comparator-----------");
    sortList(comparator2, list);

  }

  private static void sortList(Comparator<Integer> comparator2, List<Integer> list) {
    Collections.sort(list,comparator2);
    for(Integer i : list){
      System.out.println(i);
    }
  }

}
