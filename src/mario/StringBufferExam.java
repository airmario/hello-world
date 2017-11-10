package mario;

import java.util.Random;

public class StringBufferExam{
  public String randomName(){
    StringBuffer sb = new StringBuffer();
    String[] firstNames = {"Tod", "John", "Michael"};
    String[] lastNames = {"Smith", "Brown", "Davis"};

    //0~3 사이의 임의의 숫자를 골라서
    int random1 = new Random().nextInt(3);
    //랜덤하게 이름을 뽑는다.
    String firstName = firstNames[random1];

    
    //0~3 사이의 임의의 숫자를 골라서
    int random2 = new Random().nextInt(3);
    //랜덤하게 성을 뽑는다.
    String lastName = lastNames[random2];

    //sb에 이름(fistName) 공백(" ") 성(lastname) 순으로 append해 보세요.
    
    String str = sb.append(firstName).append(" ").append(lastName).toString();
    //단 메소드 체이닝을 이용해야 합니다.
    return str;
  }
  public static void main(String[]args){
	  StringBufferExam exam = new StringBufferExam();
	  String str1 = exam.randomName();
	  System.out.println(str1);
  }
}