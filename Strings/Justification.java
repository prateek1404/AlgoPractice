import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;
public class Justification
{
	ArrayList<String> justified;

	public static void main(String args[])
	{
		String text = "Prateek Jain Prateek Jain. I dont know what to do. I dont know what to do. I dont know what to do";
		int limit =25;
		Justification js = new Justification();
		js.justified = new ArrayList<String>();
		js.justify(text,limit);	
	}

	public void justify(String text, int limit)
	{
		String ar[] = text.split(" ");
		ArrayList<String> arl = new ArrayList<String>(Arrays.asList(ar));
		justifyList(arl,limit);
					
	}
	public void justifyList(ArrayList<String> ar,int limit)
	{
		if(ar.size()==0)
		{
			return;
		}
		int i =0;
		int size=0;
		StringBuffer br = new StringBuffer("");
		while(i<ar.size())
		{
			if(br.length()+ar.get(i).length()<=limit)
			{
				br = br.append(ar.get(i));
				br = br.append(" ");
				ar.remove(0);
				
			}
			else
			{
				String line =addSpaces(br,limit);
				justified.add(line);
				if(i!=ar.size()-1)
				{
					justifyList(ar,limit);
				}
				else
				{
					br.setLength(0);
					br = br.append(ar.get(i));
					justified.add(br.toString());
				}	
			}
		}
	
	}
	public String addSpaces(StringBuffer br,int limit)
	{
		while(br.charAt(0)==' ')
		{
			br.deleteCharAt(0);
		}
		while(br.charAt(br.length()-1)==' ')
		{
			br.deleteCharAt(br.length()-1);
		}
		int spacesCount = limit- br.length();
		String ar[] = br.toString().trim().split(" ");
		int spacePerWord = spacesCount/(ar.length-1);
		int remaining = spacesCount%(ar.length-1);
		StringBuffer spaceString = new StringBuffer("");
		for(int i=0;i<spacePerWord;i++)
		{
			spaceString.append(" ");
		}
		StringBuffer output = new StringBuffer("");
		for(int i=0;i<=ar.length-2;i++)
		{
			output.append(ar[i]);
			output.append(" "+spaceString);
			if(remaining>0)
			{
				output.append(" ");
				remaining--;
			}
			
		}
		output.append(ar[ar.length-1]);
		
		return output.toString();
	}

}
