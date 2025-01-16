// setter and getter
class Setget{
    int age;
    String name;
    void Setterage(int age1){
        age = age1;
    }
    void Settername(String name1){
        name = name1;
    }
    int Getterage(){
        return age;
    }
    String Gettername(){
        return name;
    }
}

public class Settergettter
{
	public static void main(String[] args) {
		Setget s = new Setget();
		s.Setterage(21);
		s.Settername("Vanshaj");
		
		System.out.println(s.Gettername());
		System.out.println(s.Getterage());
	}
}