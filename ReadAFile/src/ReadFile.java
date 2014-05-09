import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
class FileRead 
{
	public int countWordsInSentence(String input) {
	    int wordCount = 0;
	    for (int i = 0; i < input.length(); i++) {
	        char ch = input.charAt(i);
	        String str = new String("" + ch);
	        if (i+1 != input.length() && str.equals(" ") && !(""+ input.charAt(i+1)).equals(" ")) {
	            wordCount++;
	        }
	    }

	    return wordCount;
	 }
	public void FindDuplicates(ArrayList<String> list){
		TreeMap<String,Integer> counts = new TreeMap<String, Integer>();
	    Collection<String> keys=counts.keySet();
		for (String str : list) {
		    if (counts.containsKey(str)) {
		        counts.put(str, counts.get(str) + 1);
		    } else {
		        counts.put(str, 1);
		    }
		}
		for (Map.Entry<String, Integer> entry : counts.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		for(String e:keys){
			System.out.println(e);
		}
	for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		ArrayList<String> tempList=new ArrayList<>();
	    tempList.addAll(list);
		for(String word: tempList){
			System.out.println(word);
			System.out.println(tempList.indexOf(word));
		}
		System.out.println("first Key is"+counts.get(counts.firstKey()));
		
		System.out.println(Collections.max(tempList));
		ArrayList<String> subList = new ArrayList<>();
		subList.addAll(list);
		subList.subList(34, 189);
		for(String sub: subList){
		System.out.println("sublist element at"+subList.indexOf(sub)+"is"+sub);
		}
		
	}
	public void treeSetExample(ArrayList<String> arrayList){
		TreeSet<String> set=new TreeSet<>();
		  set.addAll(arrayList);
		  TreeSet<String> tailSet= new TreeSet<>();
		  tailSet.tailSet(arrayList.get(30));
		  Iterator<String> iterator;
		  iterator= tailSet.iterator();
		  while(iterator.hasNext()){
			  System.out.println(iterator.next());
		  }
	}
 public static void main(String args[])
  {
	 FileRead fileRead=new FileRead();
  try{
  File sample=new File("c://Users/Sujith/Desktop/g.txt");
  FileInputStream fileInputStream = new FileInputStream(sample);
  DataInputStream dataInputStream = new DataInputStream(fileInputStream);
  BufferedReader br = new BufferedReader(new InputStreamReader(dataInputStream));
  String input=br.readLine();
  String strLine;
  while ((strLine = br.readLine()) != null) {
  System.out.println (strLine);
  }
  String input1=input.replace(",","");
  String input2=input1.replace(".", " ");
  ArrayList<String> arrayList=new ArrayList<>(Arrays.asList(input2.split(" ")));
  //HashSet<String> Words = new HashSet<String>(arrayList);
  for (String word : arrayList) {
      System.out.println(word + ": " + Collections.frequency(arrayList, word));
  }
  System.out.println("The word count is:"+fileRead.countWordsInSentence(input));
  System.out.println(input);
  fileRead.FindDuplicates(arrayList);
  fileRead.treeSetExample(arrayList);
  dataInputStream.close();
  }catch (Exception e){
  System.err.println("Error: " + e.getMessage());
  }
  
  }
}