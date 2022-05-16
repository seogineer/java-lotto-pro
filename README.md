# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

# 기능 목록
- 로또구매금액
    - 로또 구매 가격보다 큰 금액을 입력해야 함
    - 구매 가능 개수를 반환
- 로또발급기
    - 전달받은 개수만큼 로또를 생성
- 로또 (로또 자동생성)
    - 1-45 사이의 중복되지 않은 숫자 6개 반환
- 당첨번호 (로또 수동생성)
    - 1-45 사이의 중복되지 않은 숫자 6개 입력받음
    - 범위 외 숫자 입력 시, 오류 발생
    - 숫자 외 문자 입력 시, 오류 발생
- 내 로또들!
    - 발급된 로또들, 당첨번호로 당첨 통계 계산 기능
      - 일치 개수별 집계
      - 수익률 계산. (당첨금합계 / 로또구매금액 * 100)