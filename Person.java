public class Person {
	
    // 속성(필드)
    private String name; // 이름
    private int age; // 나이

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드: 이름을 반환하는 메서드
    public String getName() {
        return name;
    }

    // 메서드: 나이를 반환하는 메서드
    public int getAge() {
        return age;
    }

    // 메서드: 나이를 1살 증가시키는 메서드
    public void haveBirthday() {
        age += 1;
        System.out.println(name + "의 생일입니다! 새로운 나이: " + age);
    }

    // 메서드: 사람의 정보를 출력하는 메서드
    public void showInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
} 