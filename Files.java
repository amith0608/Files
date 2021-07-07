import java.io.*;
public class Files
{
  public static void main(String[] args)throws Exception
  {
	  //To write in a file
	  try {
	      FileWriter myWriter = new FileWriter("E:\\Amith\\amith.txt");
	      myWriter.write("This is File handling in Java");
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  
	  //To read from a file
  File file = new File("E:\\Amith\\amith.txt");
  
  BufferedReader br = new BufferedReader(new FileReader(file));
  
  String st;
  while ((st = br.readLine()) != null)
    System.out.println(st);
  
  
  	//To append to a file
  try {
      String data = " Java is the best language";
      File f1 = new File("E:\\Amith\\amith.txt");
      if(!f1.exists()) {
         f1.createNewFile();
      }

      FileWriter fileWritter = new FileWriter(f1.getName(),true);
      BufferedWriter bw = new BufferedWriter(fileWritter);
      bw.write(data);
      bw.close();
      System.out.println("Append Done");
   } catch(IOException e){
      e.printStackTrace();
   }
  }
}