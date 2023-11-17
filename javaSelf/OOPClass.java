package javaSelf;

import fastcampus.fcjava-master.fcjava-master.src.fc.java.model.Student;
import javaSelf.OOPClass.Car;
import javaSelf.OOPClass.Child;
import javaSelf.OOPClass.Parent;

public class OOPClass {
    /* 클래스(class) 구성 */

    public /* (접근 권한) */ class /* (클래스 선언) */ Cicle /* (클래스 이름) */ {
        // 필드(변수)
        public int radius; // 원의 반지름 필드
        public String name; // 원의 이름 필드
        // 메소드

     public Circle() { // 원의 생성자 메소드 }

        public double getArea() { // 원의 면적 계산 메소드
            return 3.14 * radius * radius;
        }
    }

    /*
     * 클래스 : 객체 데이터를 만드는 템플릿(설계도)
     * 객체 : 클래스(템플릿)과 new연산자를 통해 만든 실 데이터가 들어있는 변수
     * 인스턴스 : 어떤 객체가 어떤 클래스의 객체인지 관계를 설명할때 (객체 선언 == 클래스 인스턴스화)
     * 클래스 필드 / 멤버 / 속성 : 클래스 안에 변수를 지정
     * 메서드 : 클래스 안에 있는 함수(function)를 지정
     * 생성자: 클래스로 객체를 만들 때 각 객체의 멤버 데이터 (변수) 들의 값을 초기 생성해줄수 있는 특수 메서드
     */

    /*
     * 객체(object) / 인스턴스(instance)
     * 클래스가 어떤 데이터의 구조 설계도라면 객체는 설계도를 이용해 찍어낸 실 데이터다.
     * 그리고 클래스에 의해서 만들어진 객체를 인스턴스 라고도 한다.
     * Animal cat = new Animal() -> 이렇게 만들어진 cat은 객체다.
     * 이 객체는 Animal의 인스턴스이다.
     * 인스턴스란 말은 특정 객체가 어떤 클래스의 객체 인지를 관계위주로 설명할 때 사용된다.
     */
    // 클래스
    class Animal { ... }

    public class Sample {
        public static void main(String[] args) {
            // 변수 cat은 객체
            // 변수 catd은 Animal 클래스의 인스턴스
            Animal cat = new Animal(); // 클래스라는 설계도를 통해 객체 데이터를 new 생성
        }
    }

    /* 필드 (field) : 클래스에 포함된 변수 (variable). 멤버 (member) 라고도 불리운다. */
    class Field {
        static int classVar = 10; // 클래스/스태틱 변수 선언
        int instanceVar = 20; // 인스턴스 변수 선언

        int method() {
            int localVar = 30; // 지역 변수 선언
            return localVar;
        }
    }

    public class Member01 {
        public static void main(String[] args) {

            System.out.println(Field.classVar); // 클래스/스태틱 변수 참조

            Field myField1 = new Field(); // 인스턴스 생성

            System.out.println(myField1.instanceVar); // 인스턴스 변수 참조

            System.out.println(myField1.method()); // 메서드안의 지역변수 출력
        }

    }

    /*
     * 변수 , 생성시기 , 소멸시기 , 저장메모리
     * 클래스 변수 (static variable) , 클래스가 메모리에 올라갈 때 , 프로그램이 종료될 떄 , 메소드 영역
     * 인스턴스 변수 (instance variable) , 인스턴스가 생성될 때 , 인스턴스가 소멸할 때 , 힙 영역
     * 지역 변수 (local variable) , 블록 내에서 변수의 선언문이 실행될 때 , 블록을 벗어날 때 , 스택 영역
     */
    class Field {
        static int classVar = 0; // 클래스/스태틱 변수 선언
        int instanceVar; // 인스턴스 변수 선언
    }

    public class Member01 {
        public static void main(String[] args) {

            Field myField1 = new Field(); // 인스턴스 생성
            Field myField2 = new Field(); // 인스턴스 생성
            Field myField3 = new Field(); // 인스턴스 생성

            // 인스턴스 변수는 각 객체마다 개별적으로 저장된다
            myField1.instanceVar = 10;
            myField1.instanceVar = 20;
            myField1.instanceVar = 30;

            System.out.println(myField1.instanceVar); // 10
            System.out.println(myField2.instanceVar); // 20
            System.out.println(myField3.instanceVar); // 30

            // 클래스(스태틱) 변수는 하나의 클래스의 값으로 공유되어 고정으로 저장된다
            myField1.classVar = 100;
            myField2.classVar = 200;
            myField3.classVar = 300;

            System.out.println(myField1.classVar); // 300
            System.out.println(myField2.classVar); // 300
            System.out.println(myField3.classVar); // 300

            /* !! 위의 코드는 실행은 되지만 컴파일 경고를 내줄 것이다. !! */

            // 클래스 변수에 접근하려면 Field.classVar 식으로 클래스명으로 바로 접근 해야 된다
            System.out.println(Field.classVar); // 300
        }

    }

    /*
     * 메서드 (method) : 클래스 안에 있는 함수
     * 접근 제어자 / 지정자 : 해당 메소드에 접근할 수 있는 범위를 명시
     * 반환타입 (return type) : 메소드가 모든 작업을 마치고 반환하는 데이터의 타입을 명시
     * 메소드명 : 메소드를 호출하기 위한 이름을 명시
     * 매개변수 목록(parameters) : 메소드 호출 시에 전달되는 인수의 값을 저장할 변수들을 명시
     * 구현부 : 메소드의 고유 기능을 수행하는 명령문의 집합. 중괄호 {} 안에 표현됨
     */

    /*
     * 파라미터 / 아규먼트
     * 매개변수(파라미터) : 메소드를 정의할 때 입력으로 전달된 값을 받는 변수를 의미
     * 인수(아규먼트) : 메소드를 호출할 때 전달하는 입력값을 의미한다.
     */
    public class Sample {
        public static int sum(int a, int b) { // 메소드를 정의하는 입력값 a, b 는 매개변수(parameter)
            return a + b;
        }

        public static void main(String[] args) {
            sample.sum(3, 4); // 메소드를 사용하는 입력값 3, 4는 인수(argument)
        }
    }

    /*
     * 클래스 메소드 / 인스턴스 메소드
     * static 키워드를 가지는 메소드를 클래스 메소드(static method)라고 하며
     * static 키워드를 가지지 않는 메소드를 인스턴스 메소드(instance method)라고 한다.
     * 클래스 메소드는 인스턴스를 생성하지 않고도 바로 사용할 수 있다.
     * 클래스 메소드 내부에서는 인스턴스 변수를 사용할 수 없다.
     */
    class Method {
        static int x = 100, y = 200; // 클래스(static) 변수

        int a = 10, b = 20; // 인스턴스 변수

        int add() { // 인스턴스 메소드
            return this.a + this.b; // 인스턴스 변수끼리 합
        }

        static int addStatic() { // 클래스(static) 메소드
            return Method.x + Method.y; // 클래스 변수끼리 합
        }
    }

    public class Member {
        public static void main(String[] args) {
            System.out.println(Method.addStatic()); // 클래스 메소드의 호출 : 300

            Method myMethod = new Method(); // 인스턴스 생성
            System.out.println(myMethod.add()); // 인스턴스 메소드의 호출 : 30
        }
    }

    /*
     * 메서드 오버로딩(overloading) : 같은 이름의 메소드를 중복하여 정의해서 다양한 상황에서 사용하는 것을 의미한다.
     * 원래는 한 클래스 내에 같은 이름의 메소드를 둘 이상 가질 수 없다.
     * 하지만 매개변수의 개수나 타입을 다르게 하면, 하나의 이름으로 메소드를 작성할 수 있다.
     * 즉, 서로 다른 매서드 시그니처를 갖는 여러 메소드를 같은 이름으로 정의하는 것
     * -> 메소드 시그니처 (method signature) : 메소드 선언부에 명시되는 매개변수의 리스트를 가리킨다.
     */

    System.out.println(100); // 정수값을 넣어 메소드 호출
    System.out.println(0.4532); // 실수값을 넣어 메소드 호출
    System.out.println("안녕"); // 문자열값을 넣어 메소드 호출
    System.out.println(true); // 불리언값을 넣어 메소드 호출

    /* println 메소드 원형 */
    public static void println() { ... }

    public static void println(boolean x) { ... }

    public static void println(char x) { ... }

    public static void println(char[] x) { ... }

    public static void println(double x) { ... }

    public static void println(float x) { ... }

    public static void println(int x) { ... }

    public static void println(long x) { ... }

    public static void println(Object x) { ... }

    public static void println(String x) { ... }

    /*
     * 구현조건
     * 메소드의 이름이 같아야 한다.
     * 메소드의 시그니쳐, 즉 매개변수의 개수 또는 타입이 달라야한다.
     */

    class Test {
        // 메소드 원형
        void display(int num1) {
            System.out.println(num1);
        }

        // 메소드 오버로딩 : 매개변수 갯수가 다른 유형
        void display(int num1, int num2) {
            System.out.println(num1 * num2);
        }

        // 메소드 오버로딩 : 매개변수는 같지만, 매개변수 타입이 다른 유형
        void display(int num1, double num2) {
            System.out.println(num1 + num2);
        }

        // 매개변수는 같지만, 메서드 반환 타입이 다른 유형은 오버로딩이 되지 않는다.
        // 따라서 정수 타입을 반환하는 메서드를 작성하고 싶다면 그냥 새로 메서드를 만들면 된다.
        int display2(int num1, int num2) {
            return num1 + num2;
        }
    }

    public class Method {
        public static void main(String[] args) {
            Test myfunc = new Test();

            myfunc.display(10);

            myfunc.display(10, 20);

            myfunc.display(10, 3.14);
        }
    }

    /*
     * 생성자(constructor) : 객체가 생성될 때 동적으로 인스턴스 변수 최기화를 위해 실행되는 특수한 메소드
     * 생성자의 목적은 객체 초기화이다.
     * 생성자 이름은 클래스 이름과 반드시 동일해야 한다.
     * 생성자는 new 를 통해 객체를 생성할 때, 객체당 한 번 호출
     * 생성자는 객체가 생성될 때 반드시 호출됨.
     * 생성자는 리턴 타입을 지정할수 없음
     * 개발자가 생성자를 작성하지 않았으면 컴파일러가 자동으로 기본 생성자 삽입
     * 생성자는 여러 개 작성 가능 (오버로딩)
     */

    class Car {
        String modelName;
        int modelYear;
        String color;
        int maxSpeed;
        int currentSpeed;

        // 생성자 (인스턴스 변수 값 초기화)
        Car(String modelName, int modelYear, String color, int maxSpeed) {
            this.modelName = modelName; // 메서드의 입력값으로 인스턴스 변수의 값을 지정
            this.modelYear = modelYear;
            this.color = color;
            this.maxSpeed = maxSpeed;
            this.currentSpeed = 0; // 입력값 없이 디폴트 초기화
        }

        String getModel() {
            return this.modelYear + "년식 " + this.modelName + " " + this.color;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Car myCar1 = new Car("아반떼", 2016, "흰색", 250); // 생성자의 호출
            Car myCar2 = new Car("제네시스", 2020, "검은색", 500); // 생성자의 호출
            Car myCar3 = new Car("티코", 2003, "빨간색", 100); // 생성자의 호출

            System.out.println(myCar1.getModel()); // 2016년식 아반떼 흰색
            System.out.println(myCar2.getModel()); // 2020년식 제네시스 검은색
            System.out.println(myCar3.getModel()); // 2003년식 티코 빨간색
        }
    }

    /*
     * this 참조 변수 : 클래스 자기 자신을 뜻하는 키워드
     * 해당 인스턴스의 주소를 가리키고 있기 때문에 자기 자신에 접근이 가능하다.
     * 모든 인스턴스 메소드에는 this 참조 변수가 숨겨진 지역변수로 존재하고 있어 사용 가능하다.
     * this 키워드를 붙이지 않아도 자동으로 클래스의 인스턴스 변수로 인식하지만
     * 매개변수와 변수 이름이 같을 경우 매개변수와 인스턴스 변수명을 구분하기 위해서 붙여주어야 한다.
     * 객체자신의 래퍼런스를 반한 할 때 유용히 쓰인다.
     */
    class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    ...
    }

    /*
     * this() 메서드: 같은 클래스의 다른 생성자를 호출할 때 사용하는 메서드이다.
     * 생성자 내부에서만 사용할 수 있다. 이 메서드에 인수를 전달하면, 정의되어 있는 다른 생성자를 찾아 호출해 준다.
     * 한 생성자에서 다른 생성자를 호출할 때는 반드시 해당 생성자의 첫 줄에서 this()를 호출해야 한다.
     */
    class Car {
        private String modelName;
        private int modelYear;
        private String color;
        private int maxSpeed;
        private int currentSpeed;

        Car(String modelName, int modelYear, String color, int maxSpeed) {
            this.modelName = modelName;
            this.modelYear = modelYear;
            this.color = color;
            this.maxSpeed = maxSpeed;
            this.currentSpeed = 0;
        }

        Car() {
            this("소나타", 2012, "검정색", 160); // 해당 아규먼트가 일치하는 다른 생성자를 호출함.
        }

        public String getModel() {
            return this.modelYear + "년식 " + this.modelName + " " + this.color;
        }
    }

    public class Main {
        public static void main(String[] args) {
            // 초기화 인수를 보내주지 않아 Car() 생성자가 호출되지만, 안에서 this() 메서드가 호출되어
            // 결과적으로 Car(String modelName, int modelYear, String color, int maxSpeed) 생성자가
            // 호출되는 결과를 얻는다.
            Car tcpCar = new Car();
            System.out.println(tcpCar.getModel()); // 2012년식 소나타 검정색
        }
    }

    /* 생성자 오버로딩 */
    class Student {

        public int studentID; // 학번
        public String studentName; // 이름
        public String address; // 주소

        public Student(int id, String name, String address) {
            this.studentID = id;
            this.studentName = name;
            this.address = address;
        }

        public Student(int id, String name) {
            this.studentID = id;
            this.studentName = name;
            this.address = "대한민국"; // 주소를 정하지 않으면 대한민국 으로 설정
        }

        public Student(String name) {
            this.studentID = 0; // 학번을 정하지 않으면 0으로 설정
            this.studentName = name;
            this.address = "대한민국"; // 주소를 정하지 않으면 대한민국 으로 설정
        }

        public Student() {
            // 아무것도 입력값이 없다면 디폴트로 설정
            this.studentID = 0;
            this.studentName = "이름없음";
            this.address = "대한민국";
        }
    }

    public class Main {
        public static void main(String[] args) {
            Student studentPark = new Student(20219712, "박혁거세", "미국"); // public Student(int id, String name, String
                                                                       // address) 생성자 호출
            Student studentKim = new Student(20127721, "김종국"); // public Student(int id, String name) 생성자 호출
            Student studentJames = new Student("제임스"); // public Student(String name) 생성자 호출
            Student studentJames = new Student(); // public Student() 생성자 호출

            // 정의되어 있지 않은 오버로딩 생성자는 호출 할 수 없음
            Student studentJeff = new Student(20221024); // 학번만 입력값으로 보내 초기화 - 불가능 !!
        }
    }

    /* 기본 생성자 */
    class Car {
        private String modelName = "소나타";
    }

    public class Method03 {
        public static void main(String[] args) {
            Car myCar = new Car(); // 오류 안남 == 자바 컴파일러가 기본 생성자를 제공해 주기 때문
        }
    }

    class Car {
        private String modelName = "소나타";
        private int modelYear = 2016;
        private String color = "파란색";

        /*
         * 다음 기본 생성자가 생략되어 있음
         * Car() {
         * }
         */

        public String getModel() {
            return this.modelYear + "년식 " + this.color + " " + this.modelName;
        }
    }

    public class Method03 {
        public static void main(String[] args) {
            Car myCar = new Car(); // 기본 생성자의 호출
            System.out.println(myCar.getModel()); // 2016년식 파란색 소나타
        }
    }

    /*
     * 클래스 상속 (extends)
     * 연관있는 클래스에 대해 공통적인 구성 요소를 정의하고 , 이를 대표하는 클래스를 정의하는 것.
     * 상위 클래스의 특징을 하위 클래스에서 상속받아 코드의 중복 제거, 코드 재사용성 증대 효과도 누릴 수 있다.
     * 클래스 간의 관계 형성을 명시해 줌으로써 코드의 가독성을 높일 수 있다.
     * 자주 사용되는 코드를 공통으로 사용하여 불필요한 중복을 제거하고 일관성을 유지할 수 있다.
     * 공통으로 사용하는 코드만 수정하면 되므로 생산성을 높이고 유지보수를 쉽게 만들어 준다.
     * 단일 상속만 가능하다.
     */

    class Dog {
        int teethCount; // 중복된 속성들
        int legCount; // 중복된 속성들
        int tailCount; // 중복된 속성들

        void bark();
    }

    class Cat {
        int teethCount; // 중복된 속성들
        int legCount; // 중복된 속성들
        int tailCount; // 중복된 속성들

        void meow();
    }

    class Lion {
        int teethCount; // 중복된 속성들
        int legCount; // 중복된 속성들
        int tailCount; // 중복된 속성들

        void roar();
    }

    // 자주 사용 되는 기능 클래스화

    class Animal {
        int teethCount;
        int legCount;
        int tailCount;
    }

    class Dog extends Animal { // 상속을 통해 중복 코드를 제거
        void bark();
    }

    class Cat extends Animal { // 상속을 통해 중복 코드를 제거
        void meow();
    }

    class Lion extends Animal { // 상속을 통해 중복 코드를 제거
        void roar();
    }

    /* 상속 클래스의 생성자 */
    /* super 키워드 : 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는데 사용하는 참조 변수이다. */
    class Parent {
        int a = 10; // 부모 인스턴스 변수
    }

    class Child extends Parent {
        int a = 20; // 자식 인스턴스 변수

        void display() {
            System.out.println(a); // 자식 인스턴스 변수 a 출력
            System.out.println(this.a); // 자식 인스턴스 변수 a 출력
            System.out.println(super.a); // 부모 인스턴스 변수 a 출력
        }
    }

    public class Inheritance02 {
        public static void main(String[] args) {
            Child ch = new Child();
            ch.display();
            /*
             * 실행 결과 :
             * 20
             * 20
             * 10
             */
        }
    }

    /*
     * super() 메서드 : 부모 클래스의 생성자를 호출할 때 사용된다.
     * 원래 자식 클래스 생성자의 첫줄에서 super() 메서드가 항상 실행되도록 정해져 있지만
     * 개발 편의성을 위해 생략이 되어도 자동으로 인식된다.
     */
    class Parent {
        int a;
        int b;
    }

    class Child extends Parent {
        int c;

        Child() {
            // super(); 가 생략되어 있다
            c = 20;
        }

        void display() {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child ch = new Child();
            ch.display();
        }
    }

    /*
     * 부모 클래스의 멤버를 초기화 하기 위해서는 자식 클래스의 생성자에서 부모 클래스의 생성자를 직접 호출해야 된다.
     * 만일 부모클래스에 직접 생성자를 정의해 추가했다면,
     * 부모 클래스의 디폴트 생성자는 없어진다.
     * 그리고 부모 디폴트 생성자가 사라진다는 말은 곧, super()가 동작하지 않는다는 말이고
     * 이는 곧 컴파일 에러를 일으키게 된다.
     */
    public class Employee {
        private String name;

        // 생성자를 직접 지정 → 디폴트 생성자는 작동치 않음
        public Employee(String name) {
            this.name = name;
        }
    }

    public class Developer extends Employee {
        private double salary;

        public Developer(String name) {
            // 원래는 자식 생성자 가장 첫번째 행에 super() 기본 생성자가 실행된다.
            // 하지만 부모 클래스에는 Employee(String name) 밖에 없기 때문에 super()는 실행이 안되고 결과적으로 컴파일 에러가
            // 뜬다
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }
    }

    // 따라서 자식 클래스 생서아에서 부모 클래스 생성자의 메서드 시그니처에 맞는 super(name)를 직접 호출해야 된다.
    public class Employee {
        private String name;

        // 생성자를 직접 지정 → 디폴트 생성자는 작동치 않음
        public Employee(String name) {
            this.name = name;
        }
    }

    public class Developer extends Employee {
        private double salary;

        public Developer(String name) {
            super(name); // 자식 생성자의 입력값 name을 받아 부모 생성자 public Employee(String name) 를 호출
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }
    }

    /*
     * 메서드 오버라이딩 (overriding) : 상속 받은 메서드의 내용만 변경하여 덮어씌움
     * 메서드의 선언부는 기존 메소드와 완전히 같아야 한다. (리턴값, 매개변수 등)
     * 메소드의 반환 타입은 부모 클래스의 반환 타입으로 타입 변환할 수 있는 타입이라면 변경할 수 있다.
     * 부모 클래스의 메소드 보다 접근 제어자를 더 좁은 범위로 변경할 수 없다.
     * 예를 들어 부모 메서드에 protected void display() 라고 정의되어있는걸 오버라이딩 했을때 같은 protected 나
     * public 으로 설정해야 오버라이딩이 된다. 만일 private 나 default 제어자로 오버라이딩을 하려고 하면 컴파일 에러가
     * 생긴다.
     */
    class Parent {
        void display() {
            System.out.println("부모 클래스의 display() 메소드입니다.");
        }
    }

    class Child extends Parent {
        int count;

        // 오버라이딩(overriding)된 display 메소드
        void display() {
            count++; // 자식의 인스턴스 변수를 증가시키고
            System.out.println("자식 클래스의 display() 메소드입니다."); // 출력 내용도 다르게 한다.
        }

        // 오버로딩(overloading)된 display() 메소드
        void display(String str) {
            System.out.println(str); // 문자열을 입력값으로 받으면 그대로 출력
        }

        void display(int c) {
            this.count += c;
            System.out.println(count); // 정수를 입력값으로 받으면 자식 인스턴스 변수를 더해주고 더한 값을 출력
        }

        void display(boolean b) {
            if (b == true) {
                super.display(); // 만약 true를 입력값으로 받으면 부모 클래스의 메서드를 출력
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child ch = new Child();

            // 오버라이딩(overriding) 된 자식 메서드 출력
            ch.display(); // "자식 클래스의 display() 메소드입니다."

            // 오버로딩(overloading) 된 자식 메서드 출력
            ch.display("Hello World"); // "Hello World" 출력
            ch.display(900); // 901
            ch.display(true); // "부모 클래스의 display() 메소드입니다." - 오버라이딩 되었던 부모 메서드를 출력
        }
    }

    /* 패키지(package) : 관련있는 클래스 파일(컴파일된 .class)을 저장하는 디렉터리를 칭한다. */
    // package com.oracle.util;
    // 해당 클래스가 속해있는 패키지 선언하여 그 패키지에 들어있는 다른 클래스들도 따로 선언없이 바로 사용 가능

    /* import문 : 코드 상단에 명시해 두면 , 그 패키지 안의 모든 클래스파일을 바로 사용할 수 있게 된다. */
    // import java.util.Date; // java.util 패키지(폴더) 에 있는 Date클래스 만 가져와 사용
    // import java.util.*; // java.util 패키지(폴더) 에 있는 클래스 소스 파일들을 모두 사용

    // 와일드 카드를 사용하면 모든 클래스를 포함 시켜주지만 아위 패키지의 클래스는 포함이 안됨
    /*
     * java 패키지에 있는 모든 파일과 그 하위에 있는 java.util 과 java.awt패키지 파일 포함시키려면
     * import java.*;
     * import java.awt.*;
     * import java.util.*;
     * 이런 식으로 import를 세개 다 해주어야 함.
     */

    /*
     * import static 문을 사용하면 정적 메소드나 필드를 클래스명 없이 사용할 수 있다.
     * 예를들어 우리가 자바를 코딩하는데 있어 정말 많이 사용하는 정적 메소드인 System.out.println() 을 static
     * import로 가져오면 다음과 같이 out.println() 만으로 사용도 가능하다.
     * import static java.lang.System.out;
     * 
     * public class Test {
     * public static void main(String[] args){
     * out.println("hello world");
     * }
     * }
     */

     /* 제어자 (modifier) */

}
