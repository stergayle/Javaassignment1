package training;

public class question9 {

	public static void main(String[] args) {

		for(int i = 0 ; i < 100 ; i++)
		{
			boolean prime = true;
			for(int j = i ; j > 1 ; j--)
			{
				if(i % j == 0 && j != 1 && j != i)
				{
					prime = false;
				}
			}
			if(prime)
			{
				System.out.println(i);
			}
		}
		
	}

}
