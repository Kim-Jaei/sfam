//import java.util.*;
//
//class Solution
//{
//    public int solution(String s)
//    {
//        Queue<Character> queue = new LinkedList<>();
//        for(char e : s.toCharArray()) {
//            queue.add(e);
//        }
//        int cycle = 0;
//        while(!queue.isEmpty()) {
//            if (cycle == queue.size()) {
//                break;
//            }
//            char a = queue.poll();
//            char b = queue.peek();
//            if(a == b) {
//                queue.remove();
//                cycle = 0;
//            } else {
//                queue.add(a);
//                cycle++;
//            }
//        }
//        return queue.isEmpty() ? 1 : 0;
//    }
//}

 import java.util.*;

 class Solution {
     public int solution(String s) {
         Stack<Character> stack = new Stack<>();

         for (char c : s.toCharArray()) {

             if (!stack.isEmpty() && stack.peek() == c) {
                 stack.pop();
             } else {
                 stack.push(c);
             }
         }

         return stack.isEmpty() ? 1 : 0;
     }
 }