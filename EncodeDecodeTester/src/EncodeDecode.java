public class EncodeDecode {

//    Invariant of the EncodeDecode Class:
//    1. The originalList is the list passed by the user of the class
//    2. The encodedList is the list of letter and number character array
//    3. The decodedList is the list two index up in the array for example:
//          if you pass 'A' you will receive 'C' which is two index up the Array

    private final String[] originalList;
    private final String[] encodedList;
    private final String[] decodedList ;

/**********************************************
 *  The constructor passes String Array as a parameter and instantiate to originalList
 *  The originalList is passed to encodedList and decodedList
 * @param oL
 *      the new String list that is assigned to originalList
 * @postcondition
 *      The lists are created through passed parameter
 *
 **********************************************/
    public EncodeDecode(String[] oL){
        originalList = oL;

        encodedList = new String[originalList.length];
        decodedList = new String[originalList.length];
        for (int i = 0; i < originalList.length; i++) {
            encodedList[i] = encode(originalList[i]);
            decodedList[i] = decode(encodedList[i]);
        }
    }

    /**********************************************
     * Accessor method to get the encodedList
     * @param -none
     * @return
     *      the list of encodedList is returned
     **********************************************/
    public String[] getEncodedList() {
        return encodedList;
    }


    /**********************************************
     * Accessor method to get the decodedList
     * @param -none
     * @return
     *      rhe list of decoded list is returned
     **********************************************/
    public String[] getDecodedList() {
        return decodedList;
    }


    /**********************************************
     *  The String parameter is passed, so it can increase their unicode value.
     * @param originalWord
     *      the string that gets seperated into smaller chunk
     * @return
     *      the string which is two level up is returned. Ex: if 'a' was passed 'c' would be returned
     **********************************************/
    /************************************************* Encode ***************************************************/
    public String encode(String originalWord){

        String tempString = "";

        for (int i = 0; i < originalWord.length(); i++) {
            //Converting string into int and checking if it's lowerCase letter
            tempString += forwardMap(originalWord.charAt(i));
        }
        return tempString;
    }


    /**********************************************
     *  The String parameter is passed, so it can decrease their unicode value
     * @param codeWord
     *      the string that gets seperated into smaller chunk
     * @return
     *      the string which is two level down is returned. Ex: if 'Z' was passed 'X' would be returned
     **********************************************/
    /************************************************* Decode ***************************************************/
    public String decode(String codeWord){

        String tempString = "";
        for (int i = 0; i < codeWord.length(); i++) {
            tempString +=  backMap(codeWord.charAt(i));
        }
        return tempString;
    }

    /*************************************************
     *  If the char ch is letter or number, the passed character is move forward to two level up and returned.
     * @param ch
     *      a character that is going to levelup
     * @return
     *      the leveled up character with two level up. Ex: if 'a' was passed 'c' would be returned
     **************************************************/

    /************************************************* ForwardMap ***************************************************/
    public char forwardMap(char ch){
        char tempChar;
        int charValue = ch;
        if(Character.isLetterOrDigit(ch)) {
            if (charValue >= 48 && charValue <= 57) {
                if (charValue == 56)
                    return '0';
                else if (charValue == 57)
                    return '1';

                tempChar = (char)(charValue + 2);
                return tempChar;
            }
            else if (charValue >= 65 && charValue <= 90) {
                if (charValue == 89)
                    return 'A';
                else if (charValue == 90)
                    return 'B';

                tempChar = (char)(charValue + 2);
                return tempChar;
            }
            else if (charValue >= 97 && charValue <= 122) {
                if (charValue == 121)
                    return 'a';
                else if (charValue == 122)
                    return 'b';

                tempChar = (char) (charValue + 2);
                return tempChar;
            }
        }
        return ch;
    }


     /****************************************************
      * If the char ch is letter or number, the passed character will go two level down and returned.
      * @param ch
      *     a character that is going to level down
      * @return
      *     the leveled down character with two level down. Ex: if 'z' was passed 'x' would be returned
      ******************************************************/
    /************************************************* BackMap ***************************************************/
    public char backMap(char ch) {

        char tempChar;
        int charValue = ch;
        if (Character.isLetterOrDigit(ch)) {
            if (charValue >= 48 && charValue <= 57) {
                if (charValue == 48)
                    return '8';
                else if (charValue == 49)
                    return '9';
                tempChar = (char) (charValue - 2);

                return tempChar;
            }
            else if (charValue >= 65 && charValue <= 90) {
                if (charValue == 65)
                    return 'Y';
                else if (charValue == 66)
                    return 'Z';
                tempChar = (char) (charValue - 2);
                return tempChar;
            }
            else if (charValue >= 97 && charValue <= 122) {
                if (charValue == 97)
                    return 'y';
                else if (charValue == 98)
                    return 'z';

                tempChar = (char) (charValue - 2);
                return tempChar;

            }

        }
        return ch;
    }



}
