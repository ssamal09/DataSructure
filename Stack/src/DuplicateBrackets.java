import java.util.Stack;

public class DuplicateBrackets {
    /*    youtube link
       https://www.youtube.com/watch?v=aMPXhEdpXFA&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=3

       Problem Discussion :
       You are given a string exp representing an expression.
       Assume that the expression is balanced i.e. the opening and closing brackets match with each other. There is always a closing bracket for each opening bracket.
       But, some of the pairs of brackets may be extra/needless. You are required to print true if you detect extra brackets and false otherwise.
       Example

       ((a + b) + (c + d)) -> false: There is no redundant or duplicate braces found
       (a + b) + ((c + d)) -> true: There is a pair of redundant or duplicate braces around c+d.

       */
    public static void main(String[] args) {
        String s = "(((a+b)+(c+d)))";
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(stack.peek()=='('){
                    System.out.println("Duplicate brackets are there"+"->True");
                    return;
                }else {
                    while (stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        System.out.println("Duplicate brackets are not there" + "-> FALSE");
    }
}


