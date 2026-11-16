# TDD – Prime Numbers (ISEP TP4)

`PrimeChecker` in Java, built test-first with the **Red → Green → Blue** cycle.
Each step has its own commit (`RED:` / `GREEN:` / `BLUE:`). Commits marked `TEST:` add a test that already passes, so another red test is needed.

The first steps (0, 1 and 2) follow the code shown on the TP slides exactly. The later steps continue in the same style.

## Run the tests

```bash
mvn test
```

Or open the project in Eclipse and run `PrimeCheckerTest` as a JUnit test.

## Cycle history

| Step | Red (failing test) | Green (code that makes it pass) | Blue (refactor) |
|---|---|---|---|
| 0 | `test0IsNotPrime` | `return false;` | no refactor needed |
| 1 | `test1IsNotPrime`: already green | – | – |
| 2 | `test2IsPrime` | `if (number == 2) return true;` | 0 and 1 → `testNumbersLessThan2AreNotPrime` |
| 3 | `test3IsPrime` | `number == 2 \|\| number == 3` | 2 and 3 → `testPrimeNumbers` |
| 4 | `test4IsNotPrime`: already green | – | – |
| 5 | `test5IsPrime` | 2 or any odd number | 4 → `testCompositeNumbersAreNotPrime`, 5 → `testPrimeNumbers` |
| 6–8 | 6, 7, 8: already green | – | – |
| 9 | `test9IsNotPrime` | divide by every number below n | divide only up to √n; 6–9 grouped |
| 0–100 | every number up to 100 | already green | – |
