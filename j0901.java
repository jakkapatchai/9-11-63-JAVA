import java.io.*;
public class j0901 {
  public static void main (String args[]) throws IOException {
    int i = 0,t1,t2;
    String b,status;
    // same as String[] fields;
    String fields[]; 
    String[] recs1 = new String[15];
    String[] recs2 = {"A,Active","R,Retire"};
    String patternStr = ",";
    //
    FileReader fin = new FileReader("data.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {     
      recs1[i] = b;
      i = i + 1;
    }
    fin.close();
    t1 = i;
    t2 = recs2.length;
    //
    for(int j=0;j<t1;j++) {
      fields = recs1[j].split(patternStr);
      System.out.print(fields[0]+ " " + fields[1]+ " " + fields[2]+ " "+fields[3]);
      status = fields[3];
      for(int k=0;k<t2;k++) {
        fields = recs2[k].split(patternStr);
        if (fields[0].equals(status)) {
           System.out.println(fields[1]);
        }
      }
    }
  }
}