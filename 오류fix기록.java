// 로컬에 존재하는 mariadb 데이터베이스를 vmware로 만든 리눅스 centos9에 옮기는법

/*
 * 시도 1. 
sudo mysqldump -u root \
    --databases neophoto \
    --single-transaction \
    --compress \
    --order-by-primary  \
    --routines=0 \
    --triggers=0 \
    --events=0 \
    -p1234 | mysql -u root \
        --port=3306 \
        --host=myinstance.123456789012.us-east-1.rds.amazonaws.com \
        -pqwe123!!

=> 실패 mysqldump: Got errno 32 on write
ERROR 2005 (HY000): Unknown server host 'myinstance.123456789012.us-east-1.rds.amazonaws.com' (-2)

1.1 호스트를 db 있는 컴ㅍ터 호스트로 바꿔줌 
sudo mysqldump -u root --databases neophoto     --single-transaction     --compress     --order-by-primary      --routines=0     --triggers=0     --events=0     -p1234 | mysql -u root         --port=3306         --host=192.168.0.33
=> ERROR 1045 (28000): Access denied for user 'root'@'192.168.0.38' (using password: NO)
mysqldump: Got errno 32 on write


시도 2. sql 파일을 옮겨서 improt 시도 ( sudo mysql -u root -p neophoto > photo.sql 입력 )

2.1. mysql -u root -p neophoto < media\data\public_html\dsphoto\photo.sql 
=> 아무 일도 일어나지 않았다.

2.2. mysql -u root -p 이 부분이 mysql 로그인시 이용되니까 이부분을 빼고
neophoto < media\data\public_html\dsphoto\photo.sql  로 시도
=> 아무일도 일어나지 않았다.

2.3. 로컬 경로로 변경해줌
mysql -u root -p neophoto < C:\Users\Administrator\Desktop\nox\photo.sql
=>
ERROR: Unknown command '\U'.
ERROR: Unknown command '\A'.
ERROR: Unknown command '\D'.
PAGER set to stdout
--------------
mysql -u root -p neophoto < C:\Users\Administrator\Desktopox

2.4.1. 대문자가 문제인가 싶어 경로를 소문자로 바꿔줌
 mysql -u root -p neophoto < C:\users\administrator\desktop\nox\photo.sql
=> ERROR 1049 (42000): Unknown database 'sersadministratordesktopnoxphoto.sql'

2.4.2 sql 파일 명만 남김
mysql -u root -p neophoto <  photo.sql
=> ERROR 1049 (42000): Unknown database 'neophoto'

시도 3. db가 unknown이라 db 만들어줌
Mariadb > create database neophoto;
mysql -u root -p neophoto <  photo.sql
=> enter password 단계에서 멈추는 걸로 보임

결국 데이터 베이스를 확인하니 이미 들어가 있었음.. 이미 들어간 디비를 계속 괴롭히니 오류를 뱉어냈던것.
아 근데 뭐가 유효했는지 모르겠네.. 더 좋은 방법도 알아냄 
물리적 접근이 가능하게 계정 생성해주고 윈도우에서 접근해서 임포트 하는게 더 쉬울듯
아직은 리눅스가 어렵다.
 * 
*/


/*
 * Globals.Url.mysql=jdbc:mysql://192.168.0.38:3306/NeoPhoto
#Globals.Url.mysql=jdbc:mysql://127.0.0.1:3306/NeoPhoto

Globals.UserName=root
Globals.Password=qwe123!!
 * 
 * 
 * DB 있는 것도 확인 했고
 * globals.properties도 수정해 줬건만
 * Unknown database 'NeoPhoto' 를 뱉는 너란 아이..
 * 
 * 
 * 시도 1. 안될건 알지만 혹시 모르니 Globals.Url.mysql=jdbc:mysql://192.168.0.38:3306/neophoto
 * 이렇게 소문자로 바꿔 봄
 * => Table 'neophoto.TN_COPYRIGHT_LICENSE' doesn't exist]을(를) 발생시켰습니다.
 * 당연하다는 듯이 엄청나게 많은 오류를 뱉어냄.. 애초에 이거에 맞춰진 db가 아니니까.
 * 물론 TN_COPYRIGHT_LICENS 테이블은 존재함. 얘도 소문자이긴 한데..?
 * 
 * 아니 원본이 소문자니까 이거 문제가 아닌거 같음...
 * 
 * 결론 마리아 db가 지멋대로 대소문자 구분하고 있어서 고장난거라 설정파일에서 바꿔줌
 * 
 * 
*/