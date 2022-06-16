package com.syntax.class16;

public class InstanceDemo{
    String str="instance";

    void changeInstanceValue(){
        str="Captain Marvel";
    }
    void printInstanceValue(){
        System.out.println(str);

    }

    public static void main(String[] args) {
      InstanceDemo id=new InstanceDemo();
        System.out.println(id.str); // prints the value of the str which is instance
        id.printInstanceValue(); // method prints the value of str which is still instance
        id.changeInstanceValue(); // this method changes the instance variable value which will be not captain Marvel.
        id.printInstanceValue(); // method once simple prints the value of str which is now instance captain Marvel
    }

  }
