package A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	public class Thread {

		public static void main(String[] args) 
		{
			List<Agent> data = new ArrayList<>();
			data.add(new Agent(102,"Priti","Nanded"));
			data.add(new Agent(104,"Shri","Pune"));
			data.add(new Agent(103,"Shweta","Mumbai"));
			data.add(new Agent(101,"Sonam","Nashik"));
			Collections.sort(data);
			for (Agent i:data)
			{
				System.out.println(i.getId()+" "+i.getName()+" "+i.getArea());
			}

		}

	}

	class Agent implements Comparable<Agent>
	{
		private int id;
		private String name;
		private String area;
		public Agent(int id, String name, String area) {
			super();
			this.id = id;
			this.name = name;
			this.area = area;
		}

}
