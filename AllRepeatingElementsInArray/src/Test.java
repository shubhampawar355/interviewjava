import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Integer arr[]= {1,2,3,4,1,5,6,2,5,3,4,1,3,4,5,6};
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					if(!map.containsKey(arr[i]))
						map.put(arr[i], 1);
					else
						map.put(arr[i], map.get(arr[i])+1);				
				}
			}
		}
		
		Set<Entry<Integer, Integer>> set = map.entrySet();
		
		for (Entry<Integer, Integer> entry : set) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}

}
