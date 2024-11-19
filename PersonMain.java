public class PersonMain {

	public static void main(String[] args) {
		// Person 객체 생성
		Person person = new Person( "Alice", 25 );
		
		int age = person.getAge() ;
        System.out.println( "age = " + age );
        
        String name = person.getName();
        System.out.println( "name = " + name );
        
        person.showInfo();
        
        // 생일을 맞이함.
        person.haveBirthday();
        
        person.showInfo();
	}

}