package com.moussi.lambdaexpression;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * @author moussiaymen First Lambda Expression Example
 */
public class FirstLambda {

  public static void main(String[] args) {
    FileFilter filter = new FileFilter() {

      public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
      }
    };

    FileFilter lambdaFilter = (File pathname) -> pathname.getName().endsWith(".java");
    System.out.println("**** Show Files by standard filter ****");
    showFilesByFilter(filter);
    System.out.println("**** Show Files by lambda expression filter ****");
    showFilesByFilter(lambdaFilter);

  }

  private static void showFilesByFilter(FileFilter filter) {
    File dir = new File("/home/moussiaymen/tmp");
    File[] files = dir.listFiles(filter);

    for (File f : files) {
      System.out.println(f.getName());
    }
  }
}
