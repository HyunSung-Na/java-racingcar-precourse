## 기능 요구 사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
- 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.
- 사용자가 잘못된 값을 입력할 경우 “[ERROR]”로 시작하는 에러 메시지를 출력 후 입력을 다시 받는다.

## 실행 결과
<pre><code>경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과 
pobi : - 
crong : 
honux : -

pobi : -- 
crong : - 
honux : --

pobi : --- 
crong : -- 
honux : ---

pobi : ---- 
crong : --- 
honux : ----

pobi : ----- 
crong : ---- 
honux : -----

최종 우승자는 pobi,honux 입니다.
</code></pre>

## 요구사항1 - 제약 사항
- 자동차 경주 게임을 실행하는 시작점은 src/main/java 폴더의 racinggame.Application의 main()이다.
- 자동차 경주 게임은 JDK 8 버전에서 실행가능해야 한다. JDK 8에서 정상 동작하지 않을 경우 0점 처리한다.
- JDK에서 기본 제공하는 Random, Scanner API 대신 nextstep.utils 패키지에서 제공하는 Randoms, Console API를
  활용해 구현해야 한다.
    - Random 값 추출은 nextstep.utils.Randoms의 pickNumberInRange()를 활용한다.
    - 사용자가 입력하는 값은 nextstep.utils.Console의 readLine()을 활용한다.
- 프로그램 구현을 완료했을 때 src/test/java 폴더의 racinggame.ApplicationTest에 있는 2개의 Test Case가 성공해 야 한다.
    - ApplicationTest에서 제공하는 2개의 Test Case는 자동차 경주 게임을 위한 최소한의 Test Case이다.
    - 필수 요구사항은 아니지만 제공하는 소스 코드를 참고해 자동차 경주 게임을 위한 모든 Test Case를 추가해 보는 것 도 테스트에 대한 좋은 연습이 될 수 있다.

## 요구사항2 - 1주차와 동일한 기준
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    - https://naver.github.io/hackday-conventions-java/
- indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다. 1까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 자바 8에 추가된 stream api를 사용하지 않고 구현해야 한다. 단, 람다는 사용 가능하다.
- else 예약어를 쓰지 않는다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
- 함수(또는 메소드)의 길이가 10라인을 넘어가지 않도록 구현한다.
    - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.

## 요구사항2 - 2주차 추가
- 일급콜렉션을 활용해 구현한다.
    - 참고문서: https://developerfarm.wordpress.com/2012/02/01/object_calisthenics_/
- 모든 원시값과 문자열을 포장한다.
    - 참고문서: https://developerfarm.wordpress.com/2012/01/27/object_calisthenics_4

## 요구사항3 - 단위 테스트
- 도메인 로직에 단위 테스트를 구현해야 한다. 단, UI(System.out, System.in, Scanner) 로직은 제외
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 분리해 구현한다.
    - 힌트는 MVC 패턴 기반으로 구현한 후 View, Controller를 제외한 Model에 대한 단위 테스트를 추가하는 것에 집중한다.
- JUnit5와 AssertJ 사용법에 익숙하지 않은 개발자는 첨부한 "학습테스트를 통해 JUnit 학습하기.pdf" 문서를 참고해 사용법을 학습한 후 JUnit5 기반 단위 테스트를 구현한다.

## 구현 기능 목록
- [x] Car : 자동차
    - [x] CarName(이름)을 갖는다.
    - [x] Distance(이동거리)를 갖는다.
    - [x] 0 ~ 9 사이의 Random 값으로 전진 여부를 결정한다.
    - [x] 4 이상이면 한칸 전진한다.
    - [x] 3 이하는 멈춘다.

- [x] Name : 자동차이름
    - [x] 이름은 1~5글자로 제한한다.
    - [x] 잘못된 자동차 이름은 5글자 초과 여부를 확인한다.
    - [x] 잘못된 이름은 예외처리 한다.

- [x] Distance : 이동거리
  - [x] 한칸 이동한다.

- [x] Cars : 자동차 여러대
    - [x] 자동차 여러대를 갖는다.
    - [x] 자동차 여러대를 전진시킨다.
    - [x] 이동 수 만큼 반복한다.
    - [x] 가장 멀리 이동한 거리를 구한다.

- [x] RacingCarController : 사용자는 게임 진행을 위한 정보를 입력한다.
    - [x] 자동차 이름을 입력한다.
        - [x] 이름은 5글자 이하로 제한한다.
        - [x] 여러대는 , 로 구분한다.
        - [x] 경주를 하려면 최소한 자동차 2대는 필요하다.
        - [x] 잘못된 값이면 [ERROR]문구를 노출하는 예외를 발생하고 재입력한다.
    - [x] 이동 횟수를 입력한다
        - [x] 숫자로 입력한다.
        - [x] 잘못된 값이면 [ERROR]문구를 노출하는 예외를 발생하고 재입력한다.
        
- [x] RacingResultView : 게임 결과를 보여준다.
    - [x] 경주 진행 상황을 보여준다.
    - [x] 동시 우승이면 ','를 붙여 노출한다.
