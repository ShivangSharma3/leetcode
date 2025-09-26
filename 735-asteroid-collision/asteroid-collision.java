import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int a : asteroids) {
            boolean destroyed = false;
            
            // only when a is negative and top is positive, collision happens
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                if (stack.peek() < -a) {
                    stack.pop(); // top destroyed, keep checking
                    continue;
                } else if (stack.peek() == -a) {
                    stack.pop(); // both destroyed
                }
                destroyed = true;
                break;
            }
            
            if (!destroyed) {
                stack.push(a);
            }
        }
        
        // convert stack to array
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}