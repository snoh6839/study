package fastcampus;

public class Book {
    public String title;
    public int price;
    public String company;
    public String author;
    public int page;
    public String isbn;

    Book b = new Book();
    // Book b;
    // b = new Book();
}

// 연산자의 종류
/*
 * 단항연산자
 * 이항연산자
 * 삼항 연산자
 * (조건) ? 참 : 거짓
 * 증가 연산자 ++
 * ++a (전위) , a++ (후위)
 * 감소 연산자 --
 * --a (전위) , a-- (후위)
 * 산술 연산자
 * + , - , * , / , % (나머지)
 * 관계 연산자
 * > , < , >= , <= , == , != , instanceof
 * 논리 연산자
 * && , || , !
 * 복합대입 연산자
 * += , -= , *= , /= , %=
 */
// 명령문의 종류
/*
 * 조건문
 * if , if ~ else
 * 선택문
 * switch ~ case
 * 반복문
 * for , foreach , while, do ~ while
 * 제어문
 * break, continue
 */

// 메서드
/*
 * 객체가 가지고 있는 동작(기능)을 메서드(함수)라고 한다.
 * 반복적인 동일 작업을 메서드를 만들어 사용하면 편리합니다.
 * 객체지향프로그램은 객체가 가지고있는 메서드를 통해서 데이터를 서로 주고 받으며 상호작용을 한다.
 * 메서드는 크게 API에서 제공해 주는 메서드와 사용자 정의 메서드릐 두 종류로 분류할 수 있다.
 * 메서드는 정의하고 호출되어 사용되어 진다.
 */

// 접근 제어 (Access Modifier)
/*
 * 객체의 상태 정보는 중요하기 때문에 접근을 못하게 해야 한다.
 * 객체의 행위 정보는 상호작용을 해야되기 빼문에 접근을 허용한다.
 * public : 모든 패키지에서 접근가능
 * private : 자기 자신만 접근 가능
 * protected : 상속 관계에서 하위 클래스가 상위 클래스 접근 가능
 * default(단어로 존재하지 않는 기본값) : 동일한 패키지에서만 접근가능
 */
// 패키지 (package)
/*
 * 서로 기능이 비슷한 클래스들 끼리 모아서 관리를 쉽게 하기 위해서 사용 (폴더 개념)
 * 패키지 외부에서 클래스의 접근을 할 수 없도록 하기 위해서 사용 (보안 측면)
 * 자바에서 제공하는 API
*/
//자바 제공 대표 패키지
/*
 * java.lang (default package) : String, System ...
 * java.io : 입출력 관현 클래스 (InputStream ...)
 * java.net : 네트워킹 관련 클래스
 * java.util : 도움을 주는 클래스 (Scanner ...)
 * java.sql : 데이터베이스 관련 클래스, SQL
 * java.math : 수학관련 클래스
*/
// 클래스 접근 방법 
// 클래스 전체 이름 (class full name) or import


