import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Stack;

public class CalculatorService {
    public int calculate(String eval)  {
//
//        ScriptEngineManager mgr = new ScriptEngineManager();
//        ScriptEngine engine = mgr.getEngineByName("JavaScript");
//        Object result = engine.eval(eval);
//        if (result instanceof Number) {
//            return ((Number) result).doubleValue();
//        } else {
//            throw new IllegalArgumentException("Invalid expression");
//        }
//    }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < eval.length(); i++) {
            char c = eval.charAt(i);
            if (c == ' ') {
                continue;
            }

            else if (Character.isDigit(c)) {
                int n = 0;

                // Extract the characters and store it in num
                while (Character.isDigit(c)) {
                    n = n * 10 + (int) (c - '0');
                    i++;
                    c = eval.charAt(i);
                }
                i--;
                stack.push(n);// Push the number in stack
            }else{
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                        case '-':
                            stack.push(val2 - val1);
                            break;
                            case '/':
                                stack.push(val2 / val1);
                                break;
                            case '*':
                                stack.push(val2 * val1);
                                break;
                    }return stack.pop();
            }
        }
    }
}

