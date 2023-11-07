package javaSelf;

public class TypeConversion {
    /*
     * 타입 변환 (Type Conversion)
     * 하나의 타입을 다른 타입으로 바꾸는 것.
     * 값의 대입이나 연산시 필요.
     * 바이트의 크기가 큰 타입에서 작은 타입으로 변환할 경우 데이커의 손실과 컴파일러의 오류로 이어진다.
     */

    short small_bowl; // 작은 그릇
    int big_bowl; // 큰그릇

    big_bowl=200000000; // 2억
    small_bowl=(short)big_bowl; // 큰 그릇을 작은 그릇에 강제로 물을 옮긴다.
    System.out.println(small_bowl); // -15872 물이 넘쳐(데이터 손실) 이상한 값이 되었다.

    small_bowl=1000;big_bowl=(int)small_bowl; // 작은 그릇의 물을 큰 그릇에 담는다.
    System.out.println(big_bowl); // 1000 데이터 손실 없이 물을 잘 옮겨 담았다.

    // 낮은 자료형으로 맞출시 낮은 자료형으로 강제(명시적) 형 변환
    // 높은 자료형으로 맞출 시 높은 자료형으로 자동(묵시적) 형 변환

    /* 자동 형변환 (Promotion) */
    byte small_bowl = 10; // 작은 그릇
    int big_bowl = 10000; // 큰그릇

    int result = big_bowl - small_bowl; // small_bowl이 int형으로 자동 형변환 되어 int 끼리 계산된다.
    System.out.println(result); // 9990
    byte a = 32;

    // 1 byte로 저장된 값을 2 byte로 변환
    short b = a;

    // 2 byte로 저장된 값을 4 byte로 변환
    int c = b;

    // 4 byte로 저장된 값을 8 byte로 변환
    long d = c;
    int a = 1234;
    float b = a; // 작은 범위의 타입을 큰 타입으로 넣을 때는 자동으로 형변환을 컴파일러가 해줌

    float c = 3.14f;
    int d = c; // 에러!!! - 큰 범위의 타입을 작은 타입으로 하려면 자동 형변환 해주지 않는다. 값 손실 발생

    char ch1 = 'a';
    int charNumber = ch1; // 문자형은 int 타입으로 자동 형변환

    System.out.println("charNumber : "+charNumber); // charNumber : 97

    /*
     * long과 float 타입 크기
     * long은 8바이트 이고 float는 4바이트지만 정수 타입보다 실수 타입이 더 크게 되어 있다.
     * float에서는 부동소수점 방식을 쓰기 때문이다.
     */
    double a = 9223372036854775808.0; // 비교를 위해 실수로 표현
    double b = 3.4 * (Math.pow(10, 38)); // 3.4 x 10^38

    System.out.println(a); // 9.223372036854776 x 10^18
    System.out.println(b); // 3.4 x 10^38
    System.out.println(a<b); // true

    /*
     * char와 byte타입 크기
     * char는 아스키 코드를 저장하고 byte타입보다 크기가 크니 담을 수 있을 것 같지만
     * char타입은 음수를 표현할 수 없기 때문에 담을 수 없다.
     */

    /*
     * 연산식 자동 형변환 : 데이터의 연산은 기본적으로 같은 타입의 피 연산자 간에만 수행되기 때문에
     * 서로 다른 타입 연산자가 있을 경우 두 피연산자중 크기가 큰 타입으로 자동 형변환된 후 연산을 수행한다.
     */

    int num1 = 10;
    double num2 = 11.52;
    // num1이 double형으로 자동 변환되어 계산됨
    double result = num1 + num2; // 21.52

    char ch1 = 'A';
    char ch2 = 'B';
    int result1 = ch1 + ch2; // 'A'의 유니코드 값과 'B'의 유니코드 값을 더한 값 저장
    // char result2 = ch1 + ch2; - 에러 발생 !!!

    char ch1 = 'A';
    char ch2 = 'B';
    int result1 = ch1 + ch2; // 'A'의 유니코드 값과 'B'의 유니코드 값을 더한 값 저장
    // char result2 = ch1 + ch2; - 에러 발생 !!!

    /* 장제 형변환 (Casting) */
    int num = 60000;
    byte value = (byte) num; // 데이터 손실 발생
    System.out.println(value); // 96

    int num2 = 10;
    byte value2 = (byte) num2; // 데이터 손실 발생하지 않음
    System.out.println(value2); // 10

    byte b = 100;
    byte b = (byte) 100; // byte의 범위는 -128 ~ 127이기 때문에 데이터 손실 없이 대입이 가능하고 컴파일러가 자동 형변환을 해준다.

    ---------------------------------------

    int i = 100;
    byte b = i; // 에러, 변수이기 떄문에 상수일 때랑 다르다. 컴파일러는 변수 안에 값을 알지 못하기 때문에
    byte b = (byte) i;

    ---------------------------------------

    byte b = 1000; // 에러, byte 타입의 범위를 넘었기 때문에 자동 형변환 x
    byte b = (byte) 1000; // b에 -24가 대입된다.

    double dbNum = 12.3456;
    int num = (int) dbNum; // 12

    /* float와 int 형변환 주의점: 정밀도 손실 */
    int num1 = 123456780;
    int num2 = 123456780;

    float num3 = num2;System.out.println(num3); // 1.23456784 * E8

    num2=(int)num3;System.out.println(num2); // 123456784

    int result = num1 - num2;System.out.println(result); // -4

    int num1 = 123456780;
    int num2 = 123456780;

    double num3 = num2;System.out.println(num3); // 1.2345678 * E8

    num2=(int)num3;System.out.println(num2); // 123456780

    int result = num1 - num2;System.out.println(result); // 0

    /*
     * 형변환 안전장치: 최대값 최소값 상수 제공
     * byte
     * Byte.MAX_VALUE
     * Byte.MIN_VALUE
     * short
     * Short.MAX_VALUE
     * Short.MIN_VALUE
     * int
     * Integer.MAX_VALUE
     * Integer.MIN_VALUE
     * long
     * Long.MAX_VALUE
     * Long.MIN_VALUE
     * float
     * Float.MAX_VALUE
     * Float.MIN_VALUE
     * double
     * Double.MAX_VALUE
     * Double.MIN_VALUE
     */

    int i = 128;

    if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE))
    {
        System.out.println("byte 타입으로 변환 할 수 없음"); // 실행 (byte의 최대 크기는 127)
    }else
    {
        byte b = (byte) i;
        System.out.println(b);
    }

}
