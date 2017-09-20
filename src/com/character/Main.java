package com.character;
//
//import java.util.*;
//
//public class Main{
//
// public static void primeFactor() {
//    long mainNum = 600851475143l;
//    List<Long> prime = new ArrayList<Long>();
//prime.add(2l);
//
//
//     for(long i = 2;i<=mainNum;i++){
//      //collect prime numbers
//          if(i%2!=0){
//
//
//              while(mainNum %i == 0){
//                  prime.add(i);
//                  System.out.println(i);
//                  mainNum /= i;
//              }
//          }
//
//    }
//
//  System.out.println(prime);
//
// }
//
// public static boolean iPalindrome(int number){
//     int palindrome = number;
//     int reverse = 0;
//     int remainder;
//
//     while(palindrome != 0 ){
//         remainder = palindrome % 10;
//         //System.out.println("remander = "+remainder);
//
//         reverse = reverse * 10 + remainder;
//         //System.out.println("reverse = "+reverse);
//
//         palindrome = palindrome /10;
//         //System.out.println("pal = "+palindrome);
//     }
//     if(number==reverse){
//         return true;
//     }
//     return false;
// }
//
// public static void plaindromeFinder(){
//
//    List<Integer> pals = new ArrayList<>();
//     Set<Integer> palsHash = new HashSet<>();
//     for(int i = 999; i>=100; i--){
//         for(int x = 999; x>=100;x--){
//             int number= i*x;
//             boolean test = iPalindrome(number);
//             if(test){
//                 pals.add(number);
//                 System.out.println("i = "+i+" x = "+x+" in array = "+number);
//             }
//         }
//     }
//
//     palsHash.addAll(pals);
//     pals.clear();
//     pals.addAll(palsHash);
//     Collections.sort(pals);
//     System.out.println(pals);
//
// }
//
// public static List<Long> findPrime(int max){
//
//     int x =2;
//     long n = 3l;
//     List<Long> primeArray = new ArrayList<>();
//     primeArray.add(2l);
//     System.out.print("(1: 2 )\n");
//     while(n<=max) {
//
//
//
//             boolean isPrimeNumber = true;
//
//             for (int i = 3; i < n; i+=2) {
//
//
//                 //System.out.println(n+" is n "+i+" is i");
//                 //testing n verses every number up to itself.
//                 if (n % i == 0) {
//
//                     isPrimeNumber = false;
//
//                     break; // exit the inner for loop
//
//                 }
//
//             }
//
//             if (isPrimeNumber) {
//
//                 primeArray.add(n);
//                 System.out.print("(" + x + ": " + n + " )\n");
//                     if(x==max) {
//
//
//                     }
//                 x += 1;
//             }
//             if(x>=max+1){
//                 break;
//             }
//         n+=2;
//
//
//
//     }
//     return primeArray;
//
// }
//
// public static void addPrimes(){
//     int max = 2000000;
//     long sum = 0l;
//        List<Long> primes = findPrime(max);
//       Iterator ite = primes.iterator();
//       while(ite.hasNext()){
//           long x = (Long) ite.next();
//
//           if(x > max){
//               ite.remove();
//           }
//           if(x <=max){
//               System.out.println(sum+"+"+x+"\n");
//               sum += x;
//           }
//
//       }
//     System.out.println("\nsum = "+sum+"\n");
//     //System.out.println("all Primes = "+primes);
// }
//
//    public static void main(String[] args){
//     long sum = 2l;
//        for(int i = 1; i<=15; i++){
//            sum = sum * 2;
//            System.out.println(i);
//        }
//        System.out.println(sum);
//        System.out.println(Math.pow(2,15));
//    }
//
//}
public class Main{
    public static void main(String args[]){
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        System.out.println("initial hp: player 1 = "+player1.getHp()+" and player 2 = "+player2.getHp());

        Weapons.weapons(player1);
        Weapons.weapons(player2);
        System.out.println("initial damage: player 1 = "+player1.getDamageBase()+" and player 2 = "+player2.getDamageBase());
        System.out.println("player 1 -> str: "+player1.getStr()+" dex: "+player1.getDex());
        System.out.println("player 2 -> str: "+player2.getStr()+" dex: "+player2.getDex());
        System.out.println("---------------------start fight----------------------------");
        Combat.combat(player1, player2);


    }


}
