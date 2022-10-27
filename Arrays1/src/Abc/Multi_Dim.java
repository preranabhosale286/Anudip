package Abc;
public class Multi_Dim {
public static void main(String[] args) {
	int [][][] a= {{{1,2},{4,6},{2,3},{5}}};
	for(int x[][]:a)
	{
		for(int y[]:x)
		{
			for(int z:y)
			{
				System.out.println(z);
			}
		}
	}
}
}
