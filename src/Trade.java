import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.text.SimpleDateFormat; 

import java.util.List;


public class Trade
{
	
	List<TradeBO> readFile(String tradeFilename)
	{
	  List<TradeBO> records = new ArrayList<TradeBO>();
	  try
	  {
	    BufferedReader reader = new BufferedReader(new FileReader(tradeFilename));
	    String line;
	    int cnt = 0;
	    SimpleDateFormat sdfo = new SimpleDateFormat("dd-MM-yyyy"); 
	    while ((line = reader.readLine()) != null)
	    {
	    	cnt++;
	    	if (cnt != 1 ){
	    		String [] data = line.split(",");
	    		
	    		TradeBO tradebo = new TradeBO();    		
	    		tradebo.setTradeId(data[0]);
	    		tradebo.setTradeDtTime(sdfo.parse(data[1]));
	    		tradebo.setInID(data[2]);
	    		tradebo.setQty(Integer.parseInt(data[3]));
	    		tradebo.setPrice(Integer.parseInt(data[4]));
	    		tradebo.setAmount(Integer.parseInt(data[5]));
	    		tradebo.setTrader(data[6]);
	    		records.add(tradebo);
	    	}
	      
	    }
	    reader.close();
	    return records;
	  }
	  catch (Exception e)
	  {
	    System.err.format("Exception occurred trying to read '%s'.", tradeFilename);
	    e.printStackTrace();
	    return null;
	  }
	
}
}
//public static void main(String args[])
//		{
//	Trade t1 =new Trade();
//	String tradeFilename="C:\\Users\\reshma.gadhave\\Downloads\\trades.txt";
//	List<String> h1=t1.readFile(tradeFilename);	
//	System.out.println(h1);}
//}