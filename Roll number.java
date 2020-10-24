import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         int n, query;
        Scanner br = new Scanner(System.in);
        n = br.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = br.nextInt();
        }
        query = br.nextInt();
        while(query > 0)
        {
            int rol = br.nextInt();
            int sum = 0, roomNo = 0;
            for(int i = 0; i < n; i++)
            {
                sum = sum + a[i];
                if(rol <= sum)
                {
                    roomNo = i + 1;
                    break;
                }
            }
            query--;
            System.out.println(roomNo);
        }
    }
}
    