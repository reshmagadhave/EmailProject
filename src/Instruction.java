import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Instruction {
		 List<InstrumentBO> readFile(String instrumentFilename)
	{
	  List<InstrumentBO> records = new ArrayList<InstrumentBO>();
	  try
	  {
	    BufferedReader reader = new BufferedReader(new FileReader(instrumentFilename));
	    String line;
	    int cnt = 0;
	    while ((line = reader.readLine()) != null)
	    {
	    	cnt++;
	    	if (cnt != 1 ){
	    		String [] data = line.split(",");
	    		
	    		InstrumentBO instrumentBO = new InstrumentBO();    		
	    		instrumentBO.setInstid(data[0]);
	    		instrumentBO.setInstname(data[1]);
	    		records.add(instrumentBO);
	    	}
	      
	    }
	    
	    reader.close();
	    return records;
	  }
	  catch (Exception e)
	  {
	    System.err.format("Exception occurred trying to read '%s'.",instrumentFilename);
	    e.printStackTrace();
	    return null;
	  }
	
}
}
//public static void main(String args[])
//		{
//	Instruction t2 =new Instruction();
//	String instructionFilename="C:\\Users\\reshma.gadhave\\Downloads\\inst.txt";
//	List<String> h2=t2.readFile(instructionFilename);	
//	System.out.println(h2);}
//}

