package cs520.hw5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import cs520.hw5.Senator;

public class SenatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	
			Map< String, Senator > senatorMap = new HashMap< String, Senator >();

			Senator e0 = new Senator( null, null, null, 0 );
			Senator e1 = new Senator( null, null, null, 0 );
			Senator e2 = new Senator( null, null, null, 0 );
			Senator e3 = new Senator( null, null, null, 0 );
			Senator e4 = new Senator( null, null, null, 0 );
			Senator e5 = new Senator( null, null, null, 0 );

			senatorMap.put( e0.toString(), e0 );
			senatorMap.put( e1.toString(), e1 );
			senatorMap.put( e2.toString(), e2 );
			senatorMap.put( e3.toString(), e3 );
			senatorMap.put( e4.toString(), e4 );
			senatorMap.put( e5.toString(), e5 );

			Iterator< String > myIterator = senatorMap.keySet().iterator();

			while( myIterator.hasNext() )
			{
				String info = myIterator.next();
				System.out.println( senatorMap.get( info ) );
			}
			
		
			//here is where it reads
			String inputFileName = "data.txt";
			FileReader fileReader = null;
			// Create the FileReader object
			try {
				fileReader = new FileReader(inputFileName);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			BufferedReader reader = new BufferedReader(fileReader);
			String input;
			// Read one line at a time until end of file
			try {
				input = reader.readLine();
				while (input != null)
				{
					processInputData(input);
					input = reader.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			// Close the input
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	static //private static void processInputData(String input) {
		// TODO Auto-generated method stub
		
	//}
	//private static void processInputData(String data)
	void processInputData(String data) {
		StringTokenizer st = new StringTokenizer(data, ",");
		String name 		= st.nextToken();
		String yearsInOffice 	= st.nextToken();
		String party 	= st.nextToken();
		String state 	= st.nextToken();
		
		Senator currentSenator = 
		new Senator(name, state, party, Integer.parseInt(yearsInOffice) );
		System.out.println(currentSenator.toString());
	Queue<String> senatorQueue = new LinkedList<String>();
	// Create an empty queue

	// inserting elements
	senatorQueue.add(name); 
	senatorQueue.add(party);
	senatorQueue.offer(state);
	senatorQueue.offer(yearsInOffice);
	System.out.println(senatorQueue);
	

	
			
		}
	}