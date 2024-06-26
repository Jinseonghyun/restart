public class while_ {
  public static void main(String[] args) {
    // 반복문
    // while : ~ 할 때 동안 계속
    // 반복문 조건식이 false이면 반복문을 종료한다.
    // 반복문은 조건식이 true인 경우에 실행된다.

    // 오름차순
    int i1 = 1;    // 시작값
    while (i1 <= 10) {   // 끝값      조건식은 11번 실행되는거 11과 같을 때 조건과 달라서 멈춤
      System.out.println(i1); // 1, 2, 3, 4, 5 ... 10         안쪽 반복문은 10번 실행
      i1++;
      // i += 2; // 보폭
    }

    //내림차순
    int j = 10;    // 시작값
    while (j >= 1) {   // 끝값      조건식은 11번 실행되는거 11과 같을 때 조건과 달라서 멈춤
      System.out.println(j); // 10, 9, 8, 7, 6, 5 ... 1   안쪽 반복문은 10번 실행
      j--;
      // i += 2; // 보폭
    }
// --------------------------------------문제---------------------------------------------
    // 문제 : 아래와 같이 출력해 주세요.
    // 문제 : 단을 * 1000까지 출력해주세요.

    int dan = 8;
    int i  = 1;
    while (i <= 1000) {
      System.out.println(dan + " * " + i + " = " + dan * i);
      i = i + 1;
    }
// --------------------------------------문제2---------------------------------------------
    // 문제 : 1부터 5까지 출력해주세요
    int x = 1;
    while ( x <= 5 ) {
      System.out.println(x);
      x++;
    }
// --------------------------------------문제3---------------------------------------------
    // 문제 : -100부터 25까지 출력해주세요.
    int q = -100;
    while (q <= 25) {
      System.out.println(q);
      q++;
    }
// --------------------------------------문제3---------------------------------------------
    // 서식지정자
    // %d : 4바이트 이하의 대역폭을 가진 10진수 정수를 출력할 수 있는 서식지정자

    // long : 8
    // %ld

    // 단 만들어보기
    int r = 9;
    int e = 1;

    while (e <= 10) {     //  서식지정자 사용하기 위해 souf > printf   (println 아니다)
      // \n 으로 구분할 수 있도록 하자
      System.out.printf("%d * %d = %d\n", r, e, r * e); // 뒤의 변수 3개가 순서대로 %d 로 치환된다.
      e++;
    }
// --------------------------------------문제3---------------------------------------------
    // 1부터 5까지의 합을 더한 결과를 출력해주세요.

    int sum = 0;
    int a = 1;
    while ( a <=5 ) {
      sum += a;   //sum = sum + a;
      a++;
    }
    System.out.printf("sum : %d\n", sum);  // 서식연산자 사용에 따른 printf 주의
// --------------------------------------문제4---------------------------------------------
    // 문제 : 1부터 3까지 출력하는 작업을 3번 해주세요.
    // 문제 : 위의 작업을 총 3번 다시 반복해보세요.
    // 이중 반복문
    // 다중 반복문

    int s = 1;
    while (s <= 3) {
      System.out.println("s : " + s);
      int z = 1;
      while (z <=3 ) {
        int k = 1;
        while (k <=3 ) {
          System.out.println("반복중");
          k++;
        }
        z++;
      }
      s++;
    }
// --------------------------------------문제5---------------------------------------------
    // 문제 : 1부터 3까지 출력하는 반복문을 10번 해주세요.

    int t = 1;
    while (t <= 10) {
      System.out.println("t : " + t);
      int y = 1;
      while (y <=3 ) {
        System.out.println(y);
        y++;
      }
      t++;
    }
//  ---------------------------------------잘 안쓰지만 있는 개념-------------------------
    // do ~ while
    // 무조건 do 안에 있는 코드를 한번 실행시킴 그 다음 while 조건을 확인해서 반복

    int p = 1;
    do { // 조건을 체크하기 전에 무조건 처음에 한번 실행!
      System.out.println(p);
      p++;
    }
    while ( p <= 10 );
//-------------------------------------------while 문 break, continue--------------------------------------------------
  // 반복문의 특정 시점에서 빠져나오기

    // break : 반복문을 빠져나가는 문법
    int res = 9;
    int u = 1;
    while (true) {
      System.out.printf("%d * %d =%d\n", res, u, res * u);

      if ( u == 100 ) {
        break; // 반복문 안에서만 사용가능하고, 반복문을 빠져나간다.
      }
      u++;
    }
//-------------------------------------------while 문 break, continue--------------------------------------------------
    // 특정 결과값을 생략하고 싶다.

    int resss = 9;
    int uuuu = 1;
    while ( uuuu <= 9 ) {

      if (uuuu == 4) {
        uuuu++;  // 안해주면 4에서 무한반복에 빠지기에 증감을 걸어놓는다.
        continue;  // 다음 실행 될 코드를 skip 해준다.  (uuuu 가 4에 한해서 제일 아래 원래 uuuu++ 작동 안하고 다시  while 문으로 올라감)
      }          //  4 결과 지나치기에 안나옴

      System.out.printf("%d * %d =%d\n", resss, uuuu, resss * uuuu);

      uuuu++;
    }

  }
}
