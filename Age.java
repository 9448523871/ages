class Age{
	public static void main(String [] args )
	{
		int snehalAge=24;
		int tusharAge=22;
		int sohamAge=22;
		
		int[] ages={snehalAge,tusharAge,sohamAge};
		int total=ages.length;
		System.out.println(ages.length);
		int ref=ages[2];
		System.out.println(ref);
		
	}
}