import java.util.StringTokenizer;
import java.io.*;

public class test
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileReader file= new FileReader("rock_jars.txt");
        BufferedReader bf= new BufferedReader(file);
        
        String st = bf.readLine();
        
        int sum=0;
        int count=0;
        while((st=bf.readLine())!=null)
        {
            StringTokenizer stn = new StringTokenizer(st);
            String rn = stn.nextToken();
            String name = stn.nextToken();
            int phy = Integer.parseInt(stn.nextToken());
            int chem = Integer.parseInt(stn.nextToken());
            int bio = Integer.parseInt(stn.nextToken());
            int math = Integer.parseInt(stn.nextToken());
            sum = sum+phy+chem+bio+math;
            count}++;
            System.out.println("Roll number="+rn);
            System.out.println("Name="+name);
            System.out.printf("Total marks=%d\n", sum);
            System.out.println("--------------------------------------------------------------------------");
	   }
	}
