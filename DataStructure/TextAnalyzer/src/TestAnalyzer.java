import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

/*************************
 *  This 
 *
 *
 *
 ************************/
public class TestAnalyzer {
    private int lineCount;
    private int wordCount;
    private final int[] frequencies = new int[26];

    public int getLineCount() {
        return lineCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int[] getFrequencies() {
        return frequencies;
    }

    public void analyzeText(String fileName){

        Scanner scanner;
        try{
//            Word Count
            scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()){
                scanner.next();
                wordCount++;
            }
        }catch (FileNotFoundException e){
            System.out.println("The name of file is not correct.");
        }


//        try {
//            scanner = new Scanner(new File(fileName));
//            while (scanner.hasNextLine()) {
//                lineCount++;
//                String tempString = scanner.nextLine();
//                for (int i = 0; i < tempString.length(); i++) {
//                    char character = tempString.toLowerCase().charAt(i);
//                    if(character > 'a' && character < 'z'){
//                        frequencies[character - 'a']++;
//                    }
//
//                }
//            }
//            scanner.close();
//        }catch (FileNotFoundException e){
//            System.out.println("The name of file is not correct.");
//        }


//        try{
//            scanner = new Scanner(new File(fileName));
//        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;
//        int h = 0, ii = 0, j = 0, k = 0, l = 0, m = 0, n = 0;
//        int o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0;
//        int v = 0, w = 0, x = 0, y = 0, z = 0;
//
////        Counting occurrence of each character
//            while (scanner.hasNextLine()){
//                lineCount++;
//                String tempString = scanner.nextLine();
//                char[] characters = tempString.toLowerCase().toCharArray();
//                for (char character : characters) {
//                    switch (character) {
//                        case 'a' -> {
//                            a++;
//                            frequencies[0] = a;
//                        }
//                        case 'b' -> {
//                            b++;
//                            frequencies[1] = b;
//                        }
//                        case 'c' -> {
//                            c++;
//                            frequencies[2] = c;
//                        }
//                        case 'd' -> {
//                            d++;
//                            frequencies[3] = d;
//                        }
//                        case 'e' -> {
//                            e++;
//                            frequencies[4] = e;
//                        }
//                        case 'f' -> {
//                            f++;
//                            frequencies[5] = f;
//                        }
//                        case 'g' -> {
//                            g++;
//                            frequencies[6] = g;
//                        }
//                        case 'h' -> {
//                            h++;
//                            frequencies[7] = h;
//                        }
//                        case 'i' -> {
//                            ii++;
//                            frequencies[8] = ii;
//                        }
//                        case 'j' -> {
//                            j++;
//                            frequencies[9] = j;
//                        }
//                        case 'k' -> {
//                            k++;
//                            frequencies[10] = k;
//                        }
//                        case 'l' -> {
//                            l++;
//                            frequencies[11] = l;
//                        }
//                        case 'm' -> {
//                            m++;
//                            frequencies[12] = m;
//                        }
//                        case 'n' -> {
//                            n++;
//                            frequencies[13] = n;
//                        }
//                        case 'o' -> {
//                            o++;
//                            frequencies[14] = o;
//                        }
//                        case 'p' -> {
//                            p++;
//                            frequencies[15] = p;
//                        }
//                        case 'q' -> {
//                            q++;
//                            frequencies[16] = q;
//                        }
//                        case 'r' -> {
//                            r++;
//                            frequencies[17] = r;
//                        }
//                        case 's' -> {
//                            s++;
//                            frequencies[18] = s;
//                        }
//                        case 't' -> {
//                            t++;
//                            frequencies[19] = t;
//                        }
//                        case 'u' -> {
//                            u++;
//                            frequencies[20] = u;
//                        }
//                        case 'v' -> {
//                            v++;
//                            frequencies[21] = v;
//                        }
//                        case 'w' -> {
//                            w++;
//                            frequencies[22] = w;
//                        }
//                        case 'x' -> {
//                            x++;
//                            frequencies[23] = x;
//                        }
//                        case 'y' -> {
//                            y++;
//                            frequencies[24] = y;
//                        }
//                        case 'z' -> {
//                            z++;
//                            frequencies[25] = z;
//                        }
//                    }
//                }
//            }
//        scanner.close();
//        }catch (FileNotFoundException e){
//            System.out.println("The name of file is not correct.");
//        }



    }
}
