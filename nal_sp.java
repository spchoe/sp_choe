public class nal_sp{ 
    public static void main(String[] args) { 
        nal_s wd = new nal_s(); 
        wd.input(); //-- 입력 메소드 호출 
        String result = wd.week(); //-- 요일 산출 메소드 호출 
        wd.print(result); 
    } 
}

