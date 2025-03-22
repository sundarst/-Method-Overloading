 class Person
{
	String name;
	int age;
	String address;
	public static void main(String args[])
	{
		Person person1=new Person("shunmuga");
		Person person2=new Person("kutty",25);
		Person person = new Person("sundar",25,"1/224 middle street tenkasi");
		System.out.println("Name:"+person1.name); //single constructor
		System.out.println("Name:"+person2.name+" "+"Age:"+person2.age);
		System.out.println("Name:"+person.name+" "+"Age:"+person.age+" "+"Address:"+person.address);
	}
	//overload constructor
	Person(String name)
	{
		this.name=name;
	}
	Person(String names,int age)
	{
		name=names;
		this.age=age;
	}
	Person(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
}