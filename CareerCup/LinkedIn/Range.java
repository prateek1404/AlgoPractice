import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Range
{
	static class Interval
	{
		int start;
		int end;
		public Interval(int start, int end)
		{
			this.start= start;
			this.end = end;
		
		}
	}

	public static int interval(ArrayList<Interval> intervals)
	{
		Collections.sort(intervals,new Comparator<Interval>(){
		
		public int compare(Interval in1, Interval in2)
		{
			return in1.start-in2.start;
	
		}

		});
		
		int range=0;
		Interval first = intervals.remove(0);
		range = first.end-first.start;
		int start = first.start;
		int end = first.end;
		
	
		for(Interval inter:intervals)
		{
			if(inter.start>end)
			{
				range += (inter.end-inter.start);
				start = inter.start;
				end = inter.end;

			}
			else
			{
				range+= inter.end-end;
				start = inter.start;
				end = inter.end;	
			}
		}
		
		
	return range;	
	}

	public static void main(String args[])
	{
		ArrayList<Interval> list = new ArrayList<Interval>();
		for(int i=0;i<args.length;i=i+2)
		{
			list.add(new Interval(Integer.parseInt(args[i]),Integer.parseInt(args[i+1])));			

		}
		System.out.println(interval(list));

	}


}
