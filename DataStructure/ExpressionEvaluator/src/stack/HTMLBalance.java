package stack;

/************************************************
 * @author: Adesh Rai
 * Class: CSC205
 * Prof: Dr. E.K. Iskrenova-Ekiert
 * Assignment: Lab 9
 * @since: April/14/2022
 * File: HTMLBalance.jave
 ************************************************/

/**
 * Checks if the string is HTML tag or not
 **/

public class HTMLBalance extends TokenBalanceChecker{

    /**
     * Check open and closed HTML tag
     * @param open
     *      Opening tag of HTML ex: <h1>
     * @param closed
     *      Closing tag of HTML ex: </h1>
     * @return
     *      true if it contains both opening and closing tag
     **/
    @Override
    public boolean matches(String open, String closed) {
        if(open.equals("<html>") && closed.equals("</html>") || open.equals("<body>") && closed.equals("</body>") || open.equals("<title>") && closed.equals("</title>") ||
                open.equals("<strong>") && closed.equals("</strong>") || open.equals("<head>") && closed.equals("</head>") || open.equals("<h1>") && closed.equals("</h1>")||
                open.equals("<h2>") && closed.equals("</h2>") || open.equals("<h3>") && closed.equals("</h3>") || open.equals("<p>") && closed.equals("</p>") ||
                open.equals("<em>") && closed.equals("</em>") || open.equals("<center>") && closed.equals("</center>" )){
            return true;
        }else {
            return false;
        }
    }


    /**
     * Check opening tag of HTML tag
     * @param token
     *      Opening tag of HTML ex: <h1>
     * @return
     *      true if it's opening tag
     **/
    @Override
    public boolean isOpenTag(String token) {
        if(token.equals("<html>") || token.equals("<head>") || token.equals("<body>") || token.equals("<title>")
                || token.equals("<strong>") || token.equals("<h1>") || token.equals("<h2>") || token.equals("<h3>")
                || token.equals("<p>") || token.equals("<em>") || token.equals("<center>")
        ){
                return true;
        }
        return false;
    }

    /**
     * Check open and closed HTML tag
     * @param token
     *      Closing tag of HTML ex: </h1>
     * @return
     *      true if it's closing tag
     **/
    @Override
    public boolean isClosedTag(String token) {
        if(token.equals("</html>") || token.equals("</head>") || token.equals("</body>") || token.equals("</title>")
                || token.equals("</strong>") || token.equals("</h1>") || token.equals("</h2>") || token.equals("</h3>")
                || token.equals("</p>") || token.equals("</em>") || token.equals("</center>")
        ){
            return true;
        }
        return false;
    }
}
