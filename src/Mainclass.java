import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Mainclass {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		TradeBO tradeBO=new TradeBO();
		Trade t1 =new Trade();
	String tradeFilename="C:\\Users\\reshma.gadhave\\Downloads\\trades.txt";
	List<TradeBO> h1=t1.readFile(tradeFilename);	
	System.out.println(h1);
		
	Instruction t2 =new Instruction();
	String instructionFilename="C:\\Users\\reshma.gadhave\\Downloads\\inst.txt";
	List<InstrumentBO> h2=t2.readFile(instructionFilename);	
	System.out.println(h2);
	
// 	Scanner input = new Scanner(System.in);
// 	System.out.println("Enter FromDate ");
// 	String fromDate1= input.next();
	
		
// 	System.out.println("Enter ToDate ");
// 	String todate1= input.next();
	 SimpleDateFormat sdfo = new SimpleDateFormat("dd/MM/yyyy"); 
	 // Get the two dates to be compared 
    Date fromDate = sdfo.parse("10/11/2017"); 
    Date toDate = sdfo.parse("03/12/2017");
		
    //List<TradeBO> tradeListResult=t1.readFile(tradeFilename);
    List<TradeBO> result = trades.stream().filter(x -> (x.getTradeDtTime().after(fromDate) && x.getTradeDtTime().before(toDate))).collect(Collectors.toList());
    result.forEach(System.out::println);
    
    List<TradeBO> result2 = trades.stream().filter(x -> !(x.getTradeDtTime().after(fromDate) && x.getTradeDtTime().before(toDate))).collect(Collectors.toList());
    System.out.println("------------------------------------------------------ ");
    
	result2.forEach(System.out::println);
//     while(tradeBO.getTradeDtTime().after(fromDate) && tradeBO.getTradeDtTime().before(toDate))
//     {
//     	System.out.println("True");
//     }
  
//	if (calen1.after(calen2)) { 
//		  
//        // When Date d1 > Date d2 
//        System.out.println("Date1 is after Date2"); 
//    } 
//
//    else if (calen1.before(calen2)) { 
//
//        // When Date d1 < Date d2 
//        System.out.println("Date1 is before Date2"); 
//    } 
	
    
    
	}
}
		
