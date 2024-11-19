
public class StringtoConvert {

	public static void main(String[] args) {
		// 문자열을 정수로 변환
		String intString = " 123 ";
		int intValue = Integer.parseInt(intString.trim());
		System.out.println("정수 값: " + intValue); // 출력: 정수 값: 123

		// 문자열을 실수로 변환
		String doubleString = " 123.45 ";
		double doubleValue = Double.parseDouble(doubleString.trim());
		System.out.println("실수 값: " + doubleValue); // 출력: 실수 값: 123.45
	}

}
