package javaSelf;

import javaSelf.Array.User;

public class Array {
    /*
     * Array 배열 자료형
     * 하나의 블록안에 여러 데이터들을 모아 집합시켜 저장함으로써 데이터를 구조적으로 다루는데 도움을 준다.
     * 배열을 구성하는 각각의 값을 요소 (element)라고 하며,
     * 배열에서의 위치를 가리키는 숫자를 인덱스(index)라고 칭한다.
     */
    /*
     * 배열 선언 & 초기화
     * 자바는 배열을 선언할 때 미리 공간의 갯수(배열 길이)를 지정해야 한다.
     * 배열을 타입도 지정해 주어 저장할 데이터의 자료형을 명시해 주어야 한다.
     */

    // int 형 배열 선언 & 초기화
    int[] score = new int[5]; // int 타입의 값 5개가 저장될 빈 공간 생성
    score[0]=10; // 각 빈공간에 값을 초기화
    score[1]=20;score[2]=30;score[3]=40;score[4]=50;

    // for문으로 배열을 순차적으로 순회에 값을 넣어주는 방법도 있다.
    for(
    int i = 0;i<score.length;i++)
    {
        number[i] = i * 10;
    }

    // 처음부터 선언 + 초기화를 한번에 진행
    int[] score2 = { 10, 20, 30, 40, 50 };

    // String 형 배열 선언 & 초기화
    String[] name = new String[3]; // String 타입의 값 3개가 저장될 빈 공간 생성
    name[0]="wi"; // 각 빈공간에 값을 초기화
    name[1]="kim";name[2]="park"

    // 처음부터 선언 + 초기화를 한번에 진행
    String[] strArr2 = { "wi", "kim", "park" };

    /*
     * 배열 출력
     * System.out.println() 으로 출력시 주소값이 출력된다.
     * FOR문을 이용해 배열 각 원소들을 순회하여 출력하도록 하드코딩 하거나
     * Arrays.toString()메서드를 이용해서 배열을 문자열형식으로 만들어 출력할 수 있다.
     */

    int[] iArr = { 100, 95, 80, 70, 60
    };

    System.out.println(iArr); // [I@7ad041f3
    // [I : 배열 integer
    // @7ad041f3 : 주소값

    /* Arrays 클래스는 java.util 패키지에 속해있다. */

    int[] iArr = { 100, 95, 80, 70, 60 };

    // 루프문으로 직접 배열 원소 출력
    for(
    int i = 0;i<iArr.length;i++)
    {
        System.out.println(iArr[i]);
    }

    // Arrays.toString() 메서드 사용하여 심플하게 바로 출력
    System.out.println(Arrays.toString(iArr)); // [100, 95, 80, 70, 60]

    // 예외 : char형 배열은 println()으로 바로 출력이 가능하다.

    /*
     * 배열 복사
     * 배열을 만들고 나서 데이터를 적재하다보니 배열 공간이 부족해 질 경우
     * 따로 공간이 큰 배열을 새로 만들고 기존의 배열의 내용을 복사해 넣어 간접적으로 확장해야한다.
     * for문으로 한땀한땀 복사하도록 지정해주거나
     * System.arraycopy() , Arrays.copyOf() 메서드를 사용한다.
     */

    int[] arr1 = { 10, 20, 30, 40, 50 };

    int[] arr2 = new int[arr1.length * 2]; // 우선 초기 배열보다 길이가 두배인 새로운 배열을 선언

    // 루프문으로 순회하여 복사
    for(
    int i = 0;i<arr1.length;i++)
    { // arr1의 길이만큼 반복문 실행
        arr2[i] = arr1[i]; // arr1배열의 원소값을 순회하며 arr2배열에 저장
    }arr1=arr2; // 원래의 배열을 가리키고있던 참조변수 arr1이 새로 복사된 arr2 배열을 가리키도록 한다.

    int[] arr1 = { 10, 20, 30, 40, 50 };

    int[] arr2 = new int[arr1.length * 2]; // 우선 초기 배열보다 길이가 두배인 새로운 배열을 선언

    // System.arraycopy() 메서드 사용
    System.arraycopy(arr1,0,arr2,0,arr1.length); // arr1의 index 0부터 arr1.length 전체 길이 만큼 arr2의 index 0 부터 붙여넣는다.
    /*
     * - 첫번째 인자 : 복사할 배열
     * - 두번째 인자 : 복사를 시작할 배열의 위치
     * - 세번째 인자 : 붙여넣을 배열
     * - 네번째 인자 : 복사된 배열값들이 붙여질 시작위치 (차례대로 붙여 넣어진다)
     * - 다섯번째 인자 : 지정된 길이만큼 값들이 복사된다.
     */

    int[] arr1 = { 10, 20, 30, 40, 50 };

    int[] arr2 = new int[arr1.length * 2]; // 우선 초기 배열보다 길이가 두배인 새로운 배열을 선언

    // Array.copyOf() 메서드 사용
    arr2=Arrays.copyOf(arr1,arr1.length); // arr1 배열을 arr1.length 전체 길이만큼 전체 복사해서 arr2에 할당
    System.out.println(Arrays.toString(arr2)); // [10, 20, 30, 40, 50]

    arr2=Arrays.copyOfRange(arr1,1,3); // 배열요소 시작점, 끝점 지정. 1, 2 만 복사해서 반환
    System.out.println(Arrays.toString(arr2)); // [10, 20, 30, 40, 50]

    /* 배열 정렬 Arrays.sort() : 자기 자신을 정렬시킨다. */
    int[] arr = { 3, 2, 0, 1, 4 };

    // 오름차순 정렬
    Arrays.sort(arr); // 자기 자신 배열을 정렬 시킴 (정렬된 배열을 반환하는 것이 아니다)
    System.out.println(Arrays.toString(arr)); // [0,1,2,3,4]

    // 내림차순 정렬
    Arrays.sort(arr,Collections.reverseOrder()); // 배열을 내림차순으로 정렬할 때는 Collections 클래스의 reverseOrder() 함수를 사용
    System.out.println(Arrays.toString(arr)); // [4,3,2,1,0]

    // 배열 일부부만 정렬
    int[] arr = { 3, 2, 0, 1, 4 };Arrays.sort(arr,0,3); // 배열 요소 0, 1, 2 만 정렬
    System.out.println(Arrays.toString(arr)); // [0, 2, 3, 1, 4]

    /* 배열 비교 Arrays.equals */
    String[] arr1 = { "홍길동", "임꺽정", "박혁거세", "주몽", "고담덕" };
    String[] arr2 = { "홍길동", "임꺽정", "박혁거세", "주몽", "고담덕" };
    String[] arr3 = { "홍길동", "임꺽정", "박혁거세", "주몽" };

    System.out.println("arr1 == arr2 : "+Arrays.equals(arr1,arr2)); // arr1 == arr2 : true

    System.out.println("arr1 == arr3 : "+Arrays.equals(arr1,arr3)); // arr1 == arr3 : false

    // 다차원 배열 : 2차원 이상의 배열.

    // 2차원배열
    // 배열을 선언하고 따로따로 데이터를 적재
    int[][] score = new int[4][3];score[0][1]=10;score[0][1]=20;...score[1][0]=10;score[1][1]=20;...score[2][0]=10;score[2][1]=20;...score[3][0]=10;score[3][1]=20;

    // 혹은 한번에 2차원 배열을 지정하여 선언할 수 있다.
    int[][] arr2 = {
                    {10,20,30},
                    {10,20,30},
                    {10,20,30},
                    {10,20,30}
                    }

    // 2차원 배열 출력
    // for문
    int[][] arr2 = {
            { 10, 20, 30 },
            { 40, 50, 60 },
            { 70, 80, 90 },
            { 100, 200, 300 }
    };

    for(
    int i = 0;i<number.length;i++)
    { // 먼저 열 부분을 순회하고
        for (int j = 0; j < number[i].length; j++) { // 행 부분을 순회하며 각 원소를 출력
            System.out.print(number[i][j]);
        }
    }

    // Arrays.deeptoString()
    // 1차원 배열 한방 출력
    int[] arr = { 0, 1, 2, 3, 4 };System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]

    // 2차원 배열 한방 출력
    int[][] arr2 = {
            { 10, 20, 30 },
            { 40, 50, 60 },
            { 70, 80, 90 },
            { 100, 200, 300 }
    };System.out.println(Arrays.deepToString(arr2)); // [[10, 20, 30], [40, 50, 60], [70, 80, 90], [100, 200, 300]]

    // 2차원 배열 비교 Arrays.deepEquals()

    String[][] arr1 = {
            { "홍길동", "임꺽정" },
            { "박혁거세", "주몽", "고담덕" }
    };
    String[][] arr2 = {
            { "홍길동", "임꺽정" },
            { "박혁거세", "주몽", "고담덕" }
    };
    String[][] arr3 = {
            { "홍길동" },
            { "주몽", "고담덕" }
    };

    System.out.println("arr1 == arr2 : "+Arrays.deepEquals(arr1,arr2)); // arr1 == arr2 : true

    System.out.println("arr1 == arr3 : "+Arrays.deepEquals(arr1,arr3)); // arr1 == arr3 : false

    // 가변 배열 : 각 요소로 들어가는 배열의 길이가 각기 다른 배열
    int[][] score = {
	{100, 100, 100, 100},
    {20, 20, 20},
    {30, 30},
    {40, 40},
    {50, 50, 50}
    }

    // 객체배열 : 객체도 하나의 자료형으로 취급하기 때문에 배열에 담을 수 있다.
    // myObject 클래스
    class myObject {
        int id;
        String description;

        myObject(int id, String description) {
            this.id = id;
            this.description = description;
        }
    }

    // myObject 클래스를 담을 수 있는 공간 3개 크기의 객체 배열 생성
    myObject[] arrayObj = new myObject[3];

    // 객체 배열 초기화
    arrayObj[0]=new myObject(101,"first");arrayObj[1]=new myObject(102,"second");arrayObj[2]=new myObject(103,"third");

    // 객체 배열 사용
    System.out.println(arrayObj[0].description); // "first array, John"

    /* ************************************ */

    // 객체 배열 선언 + 초기화 한번에
    myObject[] arrayObj2 = {
            new myObject(101, "first"),
            new myObject(101, "second"),
            new myObject(101, "third")
    };

    // 객체 배열 복사 - 일반 배열 처럼 복사 할 경우
    class myObject {
        int id;
        String description;

        myObject(int id, String description) {
            this.id = id;
            this.description = description;
        }
    }

    myObject[] arrayObj = {
            new myObject(101, "first"),
            new myObject(101, "second"),
            new myObject(101, "third")
    };System.out.println(Arrays.toString(arrayObj)); // [main$1myObject@251a69d7, main$1myObject@7344699f,
                                                     // main$1myObject@6b95977]

    myObject[] arrayObj2; // 복사할 배열

    arrayObj2=arrayObj.clone(); // 배열을 복사해도 내용물 객체의 주소는 똑같다.
    System.out.println(Arrays.toString(arrayObj2)); // [main$1myObject@251a69d7, main$1myObject@7344699f,
                                                    // main$1myObject@6b95977]

    System.out.println(arrayObj[0].id); // 101
    arrayObj2[0].id=999; // 복사한 arrayObj2의 첫째 객체의 멤버를 변경
    System.out.println(arrayObj2[0].id); // 999
    System.out.println(arrayObj[0].id); // 999 : arrayObj1 의 첫째 겍체의 멤버도 변경됨

    // 따라서 for문으로 수동으로 해줘야한다.
    class myObject {
        int id;
        String description;

        myObject(int id, String description) {
            this.id = id;
            this.description = description;
        }
    }

    myObject[] arrayObj = {
            new myObject(101, "first"),
            new myObject(102, "second"),
            new myObject(103, "third")
    };System.out.println(Arrays.toString(arrayObj)); // [main$1myObject@251a69d7, main$1myObject@7344699f,
                                                     // main$1myObject@6b95977]

    myObject[] arrayObj2 = new myObject[3];for(
    int i = 0;i<arrayObj.length;i++)
    {
        arrayObj2[i] = new myObject(arrayObj[i].id, arrayObj[i].description);
    }

    // 배열 내용물 객체의 @주소가 달라짐을 볼 수 있다.
    System.out.println(Arrays.toString(arrayObj2)); // [main$1myObject@7e9e5f8a, main$1myObject@8bcc55f,
                                                    // main$1myObject@58644d46]

    System.out.println(arrayObj[0].id); // 101
    arrayObj2[0].id=999; // 복사한 arrayObj2의 첫째 객체의 멤버를 변경
    System.out.println(arrayObj2[0].id); // 999
    System.out.println(arrayObj[0].id); // 101

    // 객체 배열 정렬
    class User {
        String name;
        int age;

        User(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    User[] users = {
            new User("홍길동", 32),
            new User("김춘추", 64),
            new User("임꺽정", 48),
            new User("박혁거세", 14),
        }

    // Comparable 사용 : 같은 타입의 인스턴스를 서로 비교해야 할때
    // 클래스에 Comparable<> 인터페이스를 구현한다
    class User implements Comparable<User> {
        String name;
        int age;

        User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(User user) {
            // 비교 로직을 구현
            if (this.age < user.age) {
                return -1;
            } else if (this.age == user.age) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    User[] users = {
            new User("홍길동", 32),
            new User("김춘추", 64),
            new User("임꺽정", 48),
            new User("박혁거세", 14),
    };

    Arrays.sort(users); // 나이순 정렬
    // Arrays.sort(users, Collections.reverseOrder()); // 역순 정렬

    for(
    User u:users)
    { // 출력
        System.out.println(u.name + " " + u.age + "세");
    }

    // Comparator 사용
    // Arrays.sort(배열, new Comparator<>() { ... });
    Arrays.sort(users,new Comparator<User>(){

    @Override
    public int compare(User u1, User u2) {
        return Integer.compare(u1.age, u2.age); // Integer 클래스에 정의된 compare 함수로 두 가격 정수 원시값을 비교
    }});

    // java8 람다식으로 다음과 같이 축약이 가능
    Arrays.sort(users,(u1,u2)->Integer.compare(u1.age,u2.age)); // 나이순 정렬
    Arrays.sort(users,(u1,u2)->u1.name.compareTo(u2.name)); // 이름순 정렬

    // 출력
    for(

    User u:users)
    {
        System.out.println(u.name + " " + u.age + "세");
    }

    // 여러 조건 비교 comparing / thenComparing
    Arrays.sort(users,Comparator.comparing(User::getAge).thenComparing(User::getName)); // 먼저 나이순 정렬하고 나이가 같으면 따로 이름순 정렬
    for(
    User u:users)
    {
        System.out.println(u.name + " " + u.age + "세");
    }

}
