/*
 * https://open.kattis.com/problems/timeloop
Last night when you went to sleep, you had a strange feeling that you may see the same day again. And your strange feeling came to bewhen you woke up, everyone seemed to think that it was yesterday morning! The same strange feeling came back in the evening.

When this pattern continued for days, you looked for help from a time wizard. The wizard says he can break you out of the time loop, but you must chant his spell. The wizard gives you a magic number, and you must count up to that number, starting at 1, saying “Abracadabra” each time.

Input
Input consists of a single integer N (1≤N≤100).

Output
Output the entire wizard’s spell by counting from 1 to N, giving one number and “Abracadabra” per line.

Sample Input 1	
5

Sample Output 1
1 Abracadabra
2 Abracadabra
3 Abracadabra
4 Abracadabra
5 Abracadabra

Sample Input 2
10

Sample Output 2
1 Abracadabra
2 Abracadabra
3 Abracadabra
4 Abracadabra
5 Abracadabra
6 Abracadabra
7 Abracadabra
8 Abracadabra
9 Abracadabra
10 Abracadabra

 */
package Difficulty1_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Timeloop {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        for(int i = 1; i <= N; i++){
            System.out.println(i + " Abracadabra");
        }
    }
}
