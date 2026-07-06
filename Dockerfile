FROM openjdk:17

WORKDIR /app

COPY src .

RUN javac SimpleInterestCalculator.java

CMD ["java","SimpleInterestCalculator"]
Build
docker build -t simpleinterest .
Run
docker run simpleinterest
