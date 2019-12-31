class DisplayStudData
{
	String name,branch,usn;
	int phnNum;
	
	DisplayStudData(String usn,String name,String branch,int phnNum)
	{
		this.usn=usn;
		this.name=name;
		this.branch=branch;
		this.phnNum=phnNum;
	}
	
	void disp()
	{
		System.out.println("user name of student is ="+usn);
		System.out.println("name of student is ="+name);
		System.out.println("branch of student is ="+branch);
		System.out.println("phn num of student is ="+phnNum);
	}
	
	public static void main(String args[])
	{
		DisplayStudData dd1=new DisplayStudData("a1","niku","IT",902177);
		DisplayStudData dd2=new DisplayStudData("a2","chetan","IT",902179);
		DisplayStudData dd3=new DisplayStudData("a3","sandip","MECH",90217);
		DisplayStudData dd4=new DisplayStudData("a4","niku","BCA",90217);
		
		System.out.println("first user information");
		dd1.disp();
		
		System.out.println();
		
		System.out.println("second user information");
		dd2.disp();
		
		System.out.println();
		
		System.out.println("third user information");
		dd3.disp();
		
		System.out.println();
		
		System.out.println("fourth user information");
		dd4.disp();
	}
}