import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);	

		while (sc.hasNext()) {    
            Stack stack = new Stack();
			String input = sc.next();

            // System.out.println("Input: " + input);
            
            boolean exit = false;

            for(char c: input.toCharArray()){
                if(
                    c == '{' ||
                    c == '[' ||
                    c == '('
                )
                    stack.push(c);
                else if (c == '}'){
                    if (stack.empty()){
                        System.out.println("false");
                        exit = true;
                    }
                    else if (stack.pop() != '{') {
                        System.out.println("false");
                        exit = true;
                    }
                }
                else if (c == ']'){
                    if (stack.empty()){
                        System.out.println("false");
                        exit = true;
                    }
                    else if (stack.pop() != '[') {
                        System.out.println("false");
                        exit = true;
                    }
                }
                else if (c == ')'){
                    if (stack.empty()){
                        System.out.println("false");
                        exit = true;
                    }
                    else if (stack.pop() != '(') {
                        System.out.println("false");
                        exit = true;
                    }
                }

                if(exit)
                    break;
            }

            if(!exit) {
                if (stack.empty())
                    System.out.println("true");
                else
                    System.out.println("false");
            }
            
            // if (sc.hasNext())
            //     sc.nextLine();
		}
        sc.close();
		
	}
}




