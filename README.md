# 🔁 FlowChart FlowCount

**FlowChart로 반복 구조(while)를 설계하고, 1부터 10까지 숫자를 출력하는 로직을 설계하고 Java로 구현한 연습 프로젝트입니다.**

---

## ✅ 시나리오: 숫자 출력 시스템

- 프로그램이 시작 시 count를 1로 초기화한다.  
- count가 10 이하이면 현재 값을 출력한다.  
- 출력 후 count를 1 증가시키고 다시 조건 판단으로 돌아간다.  
- count가 10보다 커지면 반복을 종료하고 프로그램을 끝낸다.  
---

## 🧩 FlowChart

![21](https://github.com/user-attachments/assets/adfb7dcb-0285-4697-9ef3-423e71b87b10)

---

## 📌 입력 / 출력 정리

### 입력(Input)
- 없음

### 출력(Output)
- 1부터 10까지 숫자 순서대로 출력

### 상태(State)
- count (현재 출력할 숫자)

---

## 🔎 조건 정리

### 종료 조건
- count가 10보다 커지면 종료

### 분기 조건
- count <= 10

### 예외 / 에러 조건
- 없음

---

## 🔁 로직 흐름 설계

1. 시작 시 한 번만 실행
   - count = 1 초기화

2. 반복
   1) count 값을 출력한다.  
   2) count <= 10 인지 확인한다.  
      - 예 → 계속 반복  
      - 아니오 → 반복 종료  
   3) count = count + 1 로 상태를 업데이트한다.  

3. 종료 시
- 모든 숫자 출력 완료  
- 프로그램 종료  

---

## 🛠️ 실행 방법

```bash
# 컴파일
javac Main.java Calculator.java

# 실행
java Main
