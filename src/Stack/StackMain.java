package Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.contains(1));
        stack.clear();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

//        verify if the string has the pattern 0^n1^n
        String test = "0001111";
        System.out.println(verifyPattern(test));
        test = "0011";
        System.out.println(verifyPattern(test));

    }

    public static boolean verifyPattern(String s) {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0')
                stack.push(1);
            if(s.charAt(i) == '1'){
                if(stack.isEmpty())
                    return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
