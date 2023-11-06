package fastcampus;

public class Calculator {
    public static void main(String[] args) {
        int a, b, sum;
        a = 1;
        b = 1;
        sum = a + b;
        System.out.println(sum);
    }
}

// 자바 컴파일 명령어 : javac.exe , 자바 실행 명령어 : java.exe

// 변수 : 데이터를 저장하는 메모리 공간의 이름 (Symbol)
/*
 * 변수 이름 짓는 Rule
 * 변수의 이름은 숫자로 시작할 수 없다.
 * 대소문자가 구분디며 길이에 제한이 없다
 * $와 _ 이외의 특수문자는 사용할 수 없다.
 * 키워드는 변수 이름으로 사용할 수 없다. (ex - int, double, if ...)
 */
/*
 * 변수의 종류
 * 멤버변수 (인스턴스 변수 = instance variable)
 * 클래스변수 (스태틱변수 = static variable)
 * 지역변수 (local variable)
 * 매개변수 (parameter, argument)
 */
/*
 * 변수만들기
 * 크기와 데이터 종류를 고려해 선언
 * ex) 4 byte 정수형 변수 a = int a
 */
// 자료형 : 변수의 크기와 어떤 종류의 데이터를 저장할 것인지 결정하는 것
/*
 * 자료형의 종류
 * 기본 자료형 (PDT) : 프로그램에서 기본적으로 제공해주는 자료형
 * 사용자 정의 자료형 (UDDT) : 사용자가 만들어서 사용하는 자료형
 */
/*
 * 기본 자료형의 종류
 * byte 1byte 정수
 * short 2byte 정수
 * int 4byte 정수
 * long 8byte 정수
 * float 4byte 실수
 * double 8byte 실수
 * char 2byte 문자
 * boolean 1byte 참, 거짓
 */
/*
 * 사용자 정의 자료형
 * string 문자열
 * class
 * 예시 Lecture 강의 , Book 책 , Movie 영화 ...
 */
// 할당 : 변수에 데이터를 저장하는것
/*
 * int a = 10; //상수
 * int b = a; //변수
 * int c = b*10 //연산식
 * int d = even(c); //메서드 호출문
 */
// 초기화 : 변수를 만들고 난 후 연산을 하기 전 값을 저장하는 행위

// 형 변환 (Casting) : 값의 타입(Data Type)을 다른 타입(Data Type)으로 변환 하는 것
// 자동 형 변환 (묵시적) : 작은 type이 큰 type에 자장되는 경우
// ex) byte -> int
// 강제 형 변환 (명시적) : 큰 type이 작은 type에 저장되는 경우
// ex) int -> byte (손실발생)
