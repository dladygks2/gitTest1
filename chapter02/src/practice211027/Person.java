package practice211027;

public class Person {

	double height;
	double weight;
	String name;
	int age;
	String sex;
	
	public Person(double height, double weight, String name, int age, String sex) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
		this.sex = sex;
		
	}
	
	public String showInfo() {
		return "Ű�� " + height + "cm�̰�, \n�����԰� " + weight + "kg�� \n" + sex + "�� �ֽ��ϴ�.\n�̸��� " 
	+ name + "�̰�, \n���̴� " + age + "�� �Դϴ�." ;
	}
	
	
}

