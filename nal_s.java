import java.util.Scanner; 
class nal_s { // 주요 변수 선언(속성 구성)
    private int y, m, d; //-- 사용자가 입력한 년, 월, 일을 담을 변수 // 메소드 정의(입력받기) 
    void input() { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("년 월 일 입력(공백구분) : ");
        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();
    } 
    //메소드 정의(요일 산출하기) 
    String week() { 
        // 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성 
        int[] months ={31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        // 요일명에 대한 배열 구성 
        String[] weekNames = {"일","월","화","수","목","금","토"}; 
        // 날수를 종합할 변수, 루프 변수, 요일 변수 
        int nalsu, i, w; 
        // 윤년 2월의 날 계산 
        if(y%4==0&&y%100!=0||y%400==0)// 입력 년도가 윤년이면
        { // 2월의 마지막 날짜 29
            months[1] = 29; 
        }
        else 
        {
            months[1] = 28; 
        } // ① 1년 1월 1일 부터 입력받은 년도의 이전 년도 12월 31일까지의 날 수 계산 
            nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400; 
            // ② 입력받은 월의 이전 월 까지의 날 수 계산
            // 1번 결과에 더함
            for(i=0;i<(m-1);i++) nalsu += months[i]; 
            // ③ 입력받은 일의 날짜만큼 날 수 계산 후 
            // 2번 결과에 더함
            nalsu +=d; //-------------------------------------------여기까지 날 수 연산 끝~!!! 
            // 무슨 요일인지 확인하기 위한 연산 
            w = nalsu%7; // 전체날수 %7 == 0 ->일요일 
            // 전체날수 %7 == 1 ->월요일 
            // 전체날수 %7 == 2 ->화요일 
            return weekNames[w]; 
    }
    void print(String day) 
        {
            System.out.printf("\n>> %d년 %d월 %d일 -> %s\n",y,m,d,day); 
        }
} 