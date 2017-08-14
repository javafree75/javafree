public class Console {

	public static void main(String[] args) {
		
/*	Scanner scanner = new Scanner(System.in);
        // 값 입력 전에 Console에 표시할 내용. println()이 아니고 print()임.
		System.out.print("VALUE : ");
				
        String value = scanner.nextLine();
        System.out.println(value);
        scanner.close();*/
        
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // 값 입력 전에 Console에 표시할 내용. println()이 아니고 print()임.
            System.out.print("VALUE : ");
             
            // 값 받기
            String value = scanner.nextLine();
             
            // 종료 문자면 break
            if ("q".equals(value)) break;
             
            System.out.println(value);
        }
             
        scanner.close();

	}

}
