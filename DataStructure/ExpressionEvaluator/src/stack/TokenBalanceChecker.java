package stack;
/************************************************
 * @author: Adesh Rai
 * Class: CSC205
 * Prof: Dr. E.K. Iskrenova-Ekiert
 * Assignment: Lab 9
 * @since: April/14/2022
 * File: TokenBalanceChecker.jave
 ************************************************/

/**
 * Class that checks if the list is balance
 **/

import java.util.ArrayList;

public abstract class TokenBalanceChecker implements IBalanceChecker{
    public abstract boolean matches(String open, String closed);
    public abstract boolean isOpenTag(String token);
    public abstract boolean isClosedTag(String token);


    /**
     * Method that checks if the list is balance
     * @param tokenList
     *      the list of html tags
     * @return
     *      true if the list is balance
     **/
    @Override
    public boolean isBalanced(ArrayList<String> tokenList) {

            ArrayStack<String> stack = new ArrayStack<String>(20);
            HTMLBalance htmlBalance = new HTMLBalance();

            for(int k = 0; k < tokenList.size(); k++)
            {
                String string = tokenList.get(k);
                if (htmlBalance.isOpenTag(string)) { //Check if the string is opening tag
                    stack.push(string);
                }
                else if(htmlBalance.isClosedTag(string)) //Check if the string is closing tag
                {
                    if(stack.isEmpty())
                        return false;
                    String ch1 = stack.top();
                    if(!matches(ch1,string)) //Check if opening and closing tag matches
                        return false;
                    stack.pop();
                }

            }

            if (!stack.isEmpty()) //There is extra tag
                return false;
            return true;
    }
}
