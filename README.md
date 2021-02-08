# java-racingcar
자동차 경주 게임 미션 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 문자열 계산기
### 기능 구현 목록

- [x] 숫자로만 이루어진 문자열을 전달하는 경우, 그대로 숫자를 바로 반환  (예 : "1" => 1)
- [x] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우, 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예 : "1,2:3" => 6)
- [x] 빈 문자열("")인 경우, 0을 반환 (예 : "" => 0)
- [x] null을 전달하는 경우, 0을 반환 (예 : null => 0)
- [x] 커스텀 구분자는 문자열 앞부분의 “//”와 “\\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
- [x] 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
- [x] 숫자 이외의 값을 전달하는 경우 RuntimeException 예외를 throw한다.

## 자동차 경주 게임
### 기능 구현 
- [x] 경주할 자동차 이름 입력받기
    - [x] [예외처리] 이름은 1글자 이상 5글자 이하만 가능하다. 
    - [x] [예외처리] 문자열의 양끝에 있는 공백을 제거한 글자 수가 5글자 이하여야 한다.
    - [x] [예외처리] 이름은 null 또는 빈 문자열을 사용할 수는 없다.
    - [x] [예외처리] 경주할 자동차가 2대 이상이어야 한다.
    - [x] [예외처리] 경주할 자동차의 이름이 중복되면 안 된다. (문자열의 양끝에 있는 공백 제거 후 비교하기)
- [x] 시도할 횟수 입력받기
    - [x] [예외처리] 숫자여야 한다.
    - [x] [예외처리] 1 이상의 숫자여야 한다.
    - [ ] [예외처리] int 범위를 벗어나면 안 된다.
- [x] 1번의 시도 때마다 0~9 사이의 random의 값에 따라서 이동하기
    - [x] random 값이 4 이상일 경우 전진 (3 이하의 값일 경우 가만히 있음)
- [x] 1번의 시도가 끝날 때마다 실행 결과 출력하기
- [x] 우승자 출력하기
    - [x] 우승자가 1명 이상일 수 있다.