package javaSelf;

import java.math.BigDecimal;
import java.sql.Date;

public class Variable {
    /* 변수(variable)란 데이터를 저장하기 위해 프로그램에 의해 이름을 할당받은 메모리 공간을 의미한다. */
    /*
     * 데이터 타입(자료형)이란 변수에 적재할 데이터가 메모리에 어떻게 저장되고
     * 프로그램에서 어떻게 처리되어햐 하는지 명시적으로 알려주는 키워드이다.
     * -> 기본형 (primitive type): 계산을 위해 실제 값을 저장한다.
     * -> 참조형 (reference type): 객체의 주소를 저장한다.
     * null 또는 객체의 주소(4 byte, 0x0 ~ 0xffffffff)를 갖는다.
     */

    // 기본형 타입 (Primitive Type)
    int age = 25;
    double price = 100.5;
    char score = 'A';
    /*
     * 크게 논리형, 문자형, 정수형, 실수형으로 나뉜다.
     * 모두 소문자로 시작된다.
     * 비 객체 타입이므로 null을 가질 수 없다 (기본 값이 정해져 있다.)
     * 변수의 선언과 동시에 메모리 생성
     * 모든 값 타입은 메모리의 스택(stack)에 저장됨
     * 저장공간에 실제 자료값을 가진다.
     */

    /*
     * 논리형
     * -> boolean 1byte false (true, false)
     * 참 (true) 또는 거짓 (false)의 값을 갖는 자료형
     */
    boolean isSuccess = true;
    boolean isTest = false;

    // 논리형 자료 구조에 숫자 연산 대입시 결과값이 대입된다.
    boolean bool = (2 > 1); // true
    boolean bool = (1 == 2); // false
    boolean bool = (3 % 2 == 1); // true (3을 2로 나눈 나머지는 1이므로 참이다.)
    boolean bool = ("3".equals("2")); // false

    // 참 , 거짓 판단 if문에 애용된다.
    int base = 180;
    int height = 185;

    if(height>base)
    {
        System.out.println("키가 큽니다.");
    }

    /*
     * 정수형
     * -> byte 1byte 0 (-128 ~ 127)
     * -> short 2byte 0 (-32,768 ~ 32,767)
     * -> int(기본) 4byte 0 (-2,147,483,648 ~ 2,147,483,647)
     * -> long 8byte 0L (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
     */
    int age = 10;
    long countStar = 3147483647934L;
    // long 변수에 값을 대입할 경우 숫자값이 int 자료형의 최대값을 넘어가면 접미사 L을 붙여준다.
    // 누락시 컴파일 에러가 일어나고 소문자 l은 숫자 1과 유사하므로 잘 안쓴다.

    // 정수 오버 플로우 , 언더 플로우 오류
    byte max = 127;
    byte min = -128;
    // System.out.println(max+1000); // ERROR
    // System.out.println(min-1000); // ERROR
    /*
     * 정수형 데이터 타입을사용할 때에는 반드시 자신이 사용하고자 하는 데이터의 최소 / 최대 크기를 고여해야한다.
     * 만약 해당 타입이 표현할 수 있는 범위를 벗어난 데이터를 저장하게 되면 장못된 값이 저장된다.
     */

    // underscore 표기법
    int cost = 1000_000_000; // 1000000000
    /* jdk 7 부터 지원하는 문법, 콤마 자리를 밑줄로 대체하면 에러가 나지 않고 그냥 숫자로 읽힌다. */

    // 진수 구분법
    // 0(숫자 '0')으로 시작하면 8진수
    int octal = 023;
    // 0x(숫자 '0' + 알파벳 'x')로 시작하면 16진수
    int hex = 0xC;
    // 0b(숫자 '0' + 알파벳 'b')로 시작하면 2진수
    int binary 0b101;

    /*
     * 실수형
     * -> float 4byte 0.0F  ((3.4 X 10-38) ~ (3.4 X 1038) 의 근사값)
     * -> double(기본) 8byte 0.0 ((1.7 X 10-308) ~ (1.7 X 10308) 의 근사값)
     */
    float pi = 3.14F;
    double morePi = 3.14159265358979323846;
    /*
     * 실수의 표현 오차
     * 컴퓨터의 메모리는 한정적이기 때문에 정수를 표현할 수 있는 수의 제한이 있듯이
     * 실수의 소숫점을 표현할 수 있는 수의 제한이 존재한다.
     * 이러한 실수의 부정확한 연산의 한계를 최소화 하기 위해 소수를 이진법으로 표현할때
     * 고정 소수점 방식이 아닌 부동 소수점 방식을 이용하는데 그래도 오차는 방생한다.
     */
    double value1 = 12.23;
    double value2 = 34.45;
    // 기대값 : 46.68
    // System.out.println(value1+value2); // 46.68000000000001

    /* int, long을 정수형 타입으로 치환하거나 18자리를 초과할 경우 BigDecimal 클래스를 이용한다. */
    double a = 1000.0;
    double b = 999.9;
    // System.out.println(a - b); // 0.10000000000002274

    // 각 숫자에 10을 곱해서 소수부를 없애주고 정수로 형변환
    long a2 = (long) (a * 10);
    long b2 = (long) (b * 10);
    double result = (a2 - b2) / 10.0; // 그리고 정수끼리 연산을 해주고, 다시 10.0을 나누기 하여 실수로 변환하여 저장
    // System.out.println(result); // 0.1

    // BigDecimal 자료형을 사용
    BigDecimal bigNumber1 = new BigDecimal("1000.0");
    BigDecimal bigNumber2 = new BigDecimal("999.9");
    BigDecimal result2 = bigNumber1.subtract(bigNumber2); // bigNumber1 - bigNumber2
    // System.out.println(result2); // 0.1

    /*
     * 실수의 유효 자릿수 (정밀도)
     * 유효자릿수는 소수점 이하 자리수를 뜻하는 것이 아니라 좌측부터의 숫자 갯수를 의미한다.
     * 높른 확률로 정확히 표현할 수 있는 자리수를 의미한다.
     * -> float(6 ~ 7)
     * -> double(15 ~ 16)
     */
    // 짧은 실수 저장
    double var1 = 3.14;
    float var2 = 3.14f;

    // System.out.println("var1 : "+var1); // var1 : 3.14
    // System.out.println("var2 : "+var2); // var2 : 3.14

    // 긴 실수를 저장 (정밀도 테스트)
    double var3 = 3.14159265358979;
    float var4 = 3.14159265358979f;

    // System.out.println("var3 : "+var3); // var3 : 3.14159265358979 - 정확히 표현
    // System.out.println("var4 : "+var4); // var4 : 3.1415927 - 유효자리 제한때문에 잘리고 반올림
    // 됨 (정밀도 ↓)
    // 선택기준 : 연산속도 향상이나 메모리 절약하려면 float, 더 큰 값의 범위라던가 더 높은 정밀도를 필요로 하면 double

    /*
     * 실수 오버플로우 / 언더 플로우 오류
     * 정수와 달리 오버플로우가 발생하면 변수의 값이 무한대 (infinty)가 되고
     * 언더플로우가 발생하면 0이 된다.
     */

    // 지수 (e) 표기법
    double d2 = 1.234e2; // 1.234 x 10^2 = 123.4
    double e1 = 1.7e+3; // 1700.0
    double e2 = 1.7e-3; // 0.0017

    /*
     * 문자형
     * -> char 2byte (유니코드) '\u0000' (0 ~ 65,535)
     */
    char aa1 = 'a'; // 문자값을 ''(단일 인용부호)러 감싸주어야한다. "" 사용시 에러
    char aa2 = 97; // 아스키코드로 표현
    char aa3 = '\u0061'; // 유니코드로 표현

    // System.out.println(a1); // a 출력
    // System.out.println(a2); // a 출력
    // System.out.println(a3); // a 출력

    char aa = 'C' - 2; // 103 - 2
    // System.out.println(a); // 'A'

    // 참조형 타입 (Reference Type)
    String name = "홍길동";
    String[] hobby = new String() {"독서", "게임", "등산"};
    Date date = new Date();
    /*
     * 기본형과 달리 실제 값이 저장되지 않고, 자료가 저장된 공간의 주소를 저장한다.
     * 즉, 실제값은 다른 곳에 있으며 값이 있는 주소를 가지고 있어서 나중에는 그 주소를 참조해서 값을 가져온다.
     * 메모리의 힙(heap)에 실제 값을 저장하고, 그 참조값(주소값)을 갖는 변수는 스텍에 저장
     * 참조형 변수는 null로 초기화 시킬 수 있다.
     * 배열(Array), 열거(Enumeration), 클래스(Class), 인터페이스(Interface) 4byte null
     */

    // 문자열 자료형 : 글자의 집합, 쌍 따옴표로 감싼다.
    /*
     * String 클래스
     * public final class String implements java.io.Serializable, Comparable {
     * priave char[] value; // String 데이터 생김새는 사실 char 배열로 이루어져 있다.
     * // ...
     * }
     */
    String aaa = "Happy Java"; // 리터럴 방식
    String bbb = new String("Happy Java"); // 생성자 방식
    /*
     * String 인스턴스는 한번 생성되면 그 값을 읽기만 할 수 있고 변경 할 수는 없다.
     * 이러한 객체를 불변객체 (immutable object)라고 한다.
     * 덧셈 연산자로 문자열을 결합할 시 기존 문자열이 변경되는 것이 아닌
     * 내용이 합쳐진 새로운 String 인스턴스가 생성된다.
     */
    String s = "ABC";s+="DEF";

    // 문자열 내장 메소드

    // 문자열 비교
    String a = "hello";
    String b = "java";
    String c = "hello";

    System.out.println(a.equals(b)); // false 출력
    System.out.println(a.equals(c)); // true 출력

    // 문자열 순서 비교 (오츰차순 또는 내림차순으로 어떤 문자열이 앞이나 뒤에 있는지 확인할때)
    int value = "abc".compareTo("jzis"); // -9 (의미 abc가 더 앞이다)

    int value = "jzis".compareTo("abc"); // 9 (의미 abc가 더 앞이다)

    int value = "aa".compareTo("aaa"); // -1 (의미 aa가 더 앞이다)

    String a = "Hello Java";

    // 문자열에서 특정 문자열이 포함되어 있는지의 여부
    a.contains("Java"); // true 출력

    // 문자열 앞부분과 돌일 여부
    a.startWith("Java"); // true 출력

    // 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴
    // 만일 문자열이 포함되어 있지 않으면 -1을 반환
    a.indexOf("Java"); // 6 출력

    // 문자열에서 특정 위치의 문자(char)를 리턴
    a.charAt(6); // "J" 출력

    String a = "Hello Java";

    // 문자열 중 특정 부분을 뽑아내고 싶을 때 (시작위치 <= a < 끝위치)
    a.substring(0,4); // Hell 출력
    a.substring(4); // o Java 출력

    // 문자열을 합칠 때
    a.concat(" World"); // Hello Java World 출력

    // 첫번째 매개 변수로 전달된 문자열을 모두 찾아, 두 번째 매개변수로 치환
    a.replaceAll("Java","World") // Java를 World 로 replace → Hello World 출력

    String text = "카페라떼, 녹차라떼, 코드라떼";text.replace("라떼","AA"); // "카페AA, 녹차AA, 코드AA"

    String a = "a:b:c:d";

    // 문자열을 특정 구분자로 분리하여 배열로 만듬
    String[] str = a.split(":"); // result는 {"a", "b", "c", "d"}

    // 배열을 다시 하나의 문자열로 합침. 이때 배열 원소들을 . 구분자를 넣어 결합한다
    str.join("."); // "a.b.c.d"

    String a = "Hello Java";

    // 문자열을 모두 대문자로 변경
    a.toUpperCase(); // HELLO JAVA 출력

    // 문자열을 모두 소문자로 변경
    a.toLowerCase(); // hello java 출력

    // 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백 문자를 제거
    String a2 = " Hello Java ";a2.trim(); // Hello Java (앞뒤 공백 제거)

    /*
     * String(String s)
     * 문자열 s에 대한 String 인스턴스 생성
     * 
     * String(char[] value)
     * 문자 배열 value를 갖는 String 인스턴스 생성
     * 
     * String(StringBuffer buf)
     * StringBuffer 인스턴스 buf와 같은 내용의 String 인스턴스 생성
     * 
     * char charAt(int index)
     * 지정된 위치 index(0부터시작하는 위치)의 문자를 리턴합니다.
     * 
     * int compareTo(String anotherString)
     * 두 문자열을 사전식 순서로 비교하여 결과를 리턴합니다. 같다면 0, 호출한 문자열이 작으면 음수, 크면 양수 값을 리턴합니다.
     * 
     * boolean endsWith(String suffix)
     * 문자열이 지정한 문자열로 끝나는지 검사하여 결과를 리턴합니다.
     * 
     * boolean equals(Object obj)
     * 두 문자열의 내용이 같은지 검사하여 결과를 리턴합니다.
     * 
     * boolean startsWith(String prefix)
     * 문자열이 지정한 문자열로 시작하는지 검사하여 결과를 리턴합니다.
     * 
     * int indexOf(String str)
     * 문자열에서 지정한 문자열이 시작되는 첫 번째 위치를 리턴합니다. 없으면 -1을 리턴합니다.
     * 
     * int length()
     * 문자열의 길이를 리턴합니다.
     * 
     * String replace(char oldChar, char newChar)
     * 문자열에서 oldChar를 찾아 newChar로 변경한 문자열을 리턴합니다.
     * 
     * String toLowerCase()
     * 문자열의 모든 문자를 소문자로 변환한 문자열을 리턴합니다.
     * 
     * String toUpperCase()
     * 문자열의 모든 문자를 대문자로 변환한 문자열을 리턴합니다.
     * 
     * String substring(int beginIndex)
     * 문자열에서 지정된 위치(beginIndex)부터 끝까지의 모든 문자를 포함하는 문자열을 리턴합니다.
     * 
     * String substring(int beginIndex, int endIndex)
     * 문자열에서 지정된 범위(beginIndex부터 endIndex까지)의 문자들을 포함하는 문자열을 리턴합니다. endIndex는 포함되지
     * 않습니다.
     * 
     * String[] split(String regex)
     * 문자열을 주어진 정규표현식(regex)을 기준으로 분리하여 문자열 배열로 리턴합니다.
     * 
     * String trim()
     * 문자열 양 끝의 공백을 제거한 문자열을 리턴합니다.
     * 
     * byte[] getBytes()
     * 문자열을 바이트 배열로 변환하여 리턴합니다. 보통 인코딩 작업 시 사용됩니다.
     * 
     * boolean contains(CharSequence s)
     * 문자열이 주어진 문자열(s)을 포함하는지 확인하여 결과를 리턴합니다.
     * 
     * String[] split(String regex, int limit)
     * 문자열을 지정한 정규표현식(regex)을 기준으로 최대 limit 개수만큼 분할하여 문자열 배열로 리턴합니다.
     * 
     * int lastIndexOf(String str)
     * 문자열에서 지정한 문자열이 시작되는 마지막 위치를 리턴합니다. 없으면 -1을 리턴합니다.
     * 
     * String join(CharSequence delimiter, CharSequence... elements)
     * 여러 개의 문자열을 주어진 구분자(delimiter)로 이어 붙여 하나의 문자열로 리턴합니다.
     * 
     * boolean isEmpty()
     * 문자열이 비어있는지(길이가 0인지) 확인하여 결과를 리턴합니다.
     * 
     * int codePointAt(int index)
     * 지정한 위치(index)의 문자의 Unicode 코드 포인트를 리턴합니다.
     */

}}