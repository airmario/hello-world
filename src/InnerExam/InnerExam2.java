package InnerExam;

// •두번째는 내부 클래스가 static으로 정의된 경우, 정적 중첩 클래스 또는 static 클래스라고 한다. 
public class InnerExam2{
    static class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }

    public static void main(String args[]){
        InnerExam2.Cal cal = new InnerExam2.Cal();
        cal.plus();
        System.out.println(cal.value);

    }
}
