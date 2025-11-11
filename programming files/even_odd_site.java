//Edited by LS

import java.io.*;

public class even_odd_site {
    public static void main(String[] args) throws IOException {
    //Creating new file
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        //Writing numbers to the files
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            else {
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        //ending line
        file.write("</table>\n</body>\n</html>");
        //closing file
        file.close();
        //reading file
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        String line;
        //printing out contents of file
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
