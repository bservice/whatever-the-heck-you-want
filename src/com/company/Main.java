package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sf = new Scanner(new File("src/NerdData.txt"));
        String sdf[] = new String[5];
        for (int i = 0; i>sdf.length; i++)
        {
            sdf[i]= sf.nextLine();
        }
        for (int j = 0; j>sdf.length; j++)
        {
            if (sdf[j].substring(0,3).equalsIgnoreCase("the"))
            {
                System.out.println(sdf[j]);
            }
        }
        sf.close();
    }
}
