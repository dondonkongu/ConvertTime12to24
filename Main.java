package Interface;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Main {

    static String convertPHour(char a, char b){
        String d = ""+a+b;

        int n = Integer.parseInt(d);
        int rs =0;
        if(n<12){
            rs = 12+n;
            return ""+rs;
        }
        return d;

    }
    static String convertAHour(char a, char b){
        String d = ""+a+b;
        int n = Integer.parseInt(d);
        int rs = 0;
        if(n>=12){
            rs = n-12;
            return "0"+rs;
        }
        return d;


    }    public static String timeConversion(String s) {

        //07:05:45PM => 19:05:45
        //12:01:00AM => 00:01:00
        //14:02:05AM => 02:02:05
        char[] charArray = s.toCharArray();
        String cv ="";
        if(charArray[charArray.length-2]=='P'){
           cv = convertPHour(charArray[0],charArray[1]);
        }
        if(charArray[charArray.length-2]=='A'){
           cv =convertAHour(charArray[0],charArray[1]);
        }
        String rs = "";
      for(int i =2; i<charArray.length;i++){
          if(charArray[i]=='P'||charArray[i]=='A'){
              return cv+rs;
          }
          rs+=charArray[i];
      }

        return cv+rs;
    }



    public static void main(String[] args) {

        String ko = "04:59:59AM";
        System.out.println(timeConversion(ko));;

    }
}
