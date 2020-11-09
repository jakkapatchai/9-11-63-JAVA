import java.io.*;
public class j0902 {
  public static void main (String args[]) throws IOException {
    int i = 0,t1,t2;
    String b,status;
    String[] fields;
    String[] recs1 = new String[15];
    String[] recs2 = new String[2];
    FileReader fin = new FileReader("data.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      recs1[i] = b;
      i = i + 1;
    }
    fin.close();
    t1 = i;
    i = 0;
    //
    FileReader fin2 = new FileReader("datas.txt");
    BufferedReader bin2 = new BufferedReader (fin2);
    while ((b =  bin2.readLine()) != null) {
      recs2[i] = b;
      i = i + 1;
    }
    fin2.close();
    t2 = i;
    myclass myprint = new myclass();
    int tot = 0 , A = 0 , R = 0;
    for(int j=0;j<t1;j++) {
      fields = recs1[j].split(",");
      
      System.out.print(myprint.printout(fields));
      status = fields[3];
      tot = tot + Integer.parseInt(fields[2]);
      if (fields[3].equals("A")){
          A++;
      }
      else{
          R++;
      }
      for(int k=0;k<t2;k++) {
        fields = recs2[k].split(",");
        if (fields[0].equals(status)) {
           System.out.println(fields[1]);
        }
      }
    }
    System.out.println("Total = "+tot);
    System.out.println("A = "+A);
    System.out.println("R = "+R);
  }
}
