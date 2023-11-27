package seleniumNew2;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;
//import org.junit.Test;

public class JavaStreams {
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//@Test
	public void regular(){
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hema");
		list.add("HAritha");
		list.add("madhu");
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			String name=list.get(i);
			if(name.startsWith("H"))
			{
				count++;
			}
		}
		System.out.println(count);	

	}
	
	//@Test
	
	public void stramfilter()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hema");
		list.add("HAritha");
		list.add("madhu");
		//int count=0;
//		long k=list.stream().filter(s->s.startsWith("H")).count();
//		System.out.println(k);
		System.out.println(list.stream().filter(s->s.startsWith("H")).count());
		
		
		
	}
	
	//@Test
	public void uppercase()
	{
		long d=Stream.of("ravi","kaveri","suma","lochan","jai","binu").filter(s->
		{
			s.startsWith("s");
			
			return true;
		}).count();
		//System.out.println(d);
		
		//Stream.of("ravi","rajareddy","somureddy").filter(s->s.length()>4).forEach(s->System.out.println(s));		
		//Stream.of("ravi","rajareddy","somureddy").filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		ArrayList<String> listnew=new ArrayList<String>();
		listnew.add("hema");
		listnew.add("nani");
		listnew.add("chinna");
		listnew.add("vinu");
		System.out.println(listnew);
		Long c=listnew.stream().filter(s->
		{
			s.startsWith("c");
			return true;
		}).count();
		System.out.println(c);
		
		
	}
	@Test
	public void streamMap() {
		//Stream.of("hema","latha","bujji","hem").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//names start with h and sorting order
		//Stream.of("hema","latha","bujji","hem").filter(s->s.startsWith("h")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		List<String> list1=Arrays.asList("hema","latha","bujji","hem");
		List<String> list2=Arrays.asList("suma","priya","bujji","vani");
		//mergin lists
		Stream<String> newstream=Streams.concat(list1.stream(),list2.stream());
		//newstream.distinct().sorted().forEach(s->System.out.println(s));
		boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("vani"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
		
		
		@Test
		public void streamcollect()
		{
			List<String> ls=Stream.of("abc","def","ghi").map(s->s.toUpperCase()).collect(Collectors.toList());
			System.out.println(ls);		//we can use limit as well to print 1st word or ls.get(0)
			
			
			List<Integer> numbers=Arrays.asList(9,9,6,3,6,1,4,8);
			//print unique numbers
			//sort array
			numbers.stream().distinct().forEach(s->System.out.println(s));
			List sort=numbers.stream().sorted().collect(Collectors.toList());
			System.out.println(sort);
			
		}
	}

