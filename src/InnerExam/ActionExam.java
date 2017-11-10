package InnerExam;

// 익명 중첩 클래스는 익명 클래스라고 보통 말하며, 내부 클래스이기도 하다.
public class ActionExam {

	public static void main(String[] args) {
		// Action action = new MyAction();
		// action.exec();
        
		Action action = new Action(){
            public void exec(){
                System.out.println("exec");
            }
        };
        action.exec();
	}

}
