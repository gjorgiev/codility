package com.company;

import java.util.Stack;

public class Brackets {

    public int solution(String S){

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            Character character = S.charAt(i);
            // if we approach closing bracket and the stack is empty return 0 right away
            if ((character.equals(')')
                    || character.equals(']')
                    || character.equals('}'))
                    && stack.empty()){
                return 0;
            }
            // if we have opening bracket then just push it into the stack
            if (character.equals('(')
                    || character.equals('[')
                    || character.equals('{')){
                stack.push(character);
            }
            // if we have a closing bracket, check the last item, if it is complementary then pop it out
            if (character.equals(')') && stack.peek().equals('(')
                    || character.equals(']') && stack.peek().equals('[')
                    || character.equals('}') && stack.peek().equals('{')){
                stack.pop();
            }
        }
        return stack.empty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        System.out.println(brackets.solution("{[()()]}"));
    }
}
