package com.company;

import com.comsumer.NetClientGet;
import java.util.Scanner;

public class Main {
  int myAge =0;
  
  Scanner age = new Scanner(System.in);
  System.out.println("Introduce your age");
  myAge = age.nextInt();
  
  Scanner name = new Scanner(System.in);
  System.out.println("Introduce your age");
  myName = name.newLine();
  
  System.out.println("Hey "+myName+"!"+" your are"+myAge);
  
  NetClientGet.main();
}