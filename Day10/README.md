## Generic

제네릭(generic)을 직역하면 '일반적인'이라는 뜻이며, 데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법이다.

제네릭을 사용해야하는 이유는 제네릭 타입을 사용함으로써 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있기 때문이다.

더불어서 제네릭 코드를 사용하면 타입을 국한하기 때문에 요소를 찾아올 때 타입 변환을 할 필요가 없어 프로그램 성능이 향상되는 효과를 얻을 수 있다.

```java
ArrayList list = new ArrayList(); //제네릭을 사용하지 않을경우
list.add("test");
String temp = (String) list.get(0); //타입변환이 필요함
        
ArrayList<String> list2 = new ArrayList(); //제네릭을 사용할 경우
list2.add("test");
temp = list2.get(0); //타입변환이 필요없음
```

* 제네릭(generic) 사용법

​       제네릭 타입은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다. 제네릭 타입은 클래스 또는 인터페이스 이름 뒤에 < > 부호가 붙고 사이에 타입 파라미터가 위치한다.

  ```java
  public class 클래스명<T> {...}
  public interface 인터페이스명<T> {...}
  ```

* 자주 사용하는 타입 인자

| 타입인자 |  설명   |
| :------: | :-----: |
|  \<T\>   |  Type   |
|  \<E\>   | Element |
|  \<K\>   |   Key   |
|  \<N\>   | Number  |
|  \<V\>   |  Value  |
|  \<R\>   | Result  |
## 리스트(List)

리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있다.

배열은 크기가 정해져 있다. 예를 들어 배열의 크기를 10개로 정했다면 10개이상의 값은 담을 수 없다.

이렇게 동적으로 자료형의 갯수가 가변하는 상황이라면 List를 사용하는 것이 유리하다.

## add

박찬호 선수가 총 3번의 투구를 138, 129, 142(km) 의 속도록 던졌다면 다음과 같이 코드를 작성할 수 있다.

```java
ArrayList pitches = new ArrayList();
pitches.add("138");
pitches.add("129");
pitches.add("142");
```

add 라는 메소드를 이용하여 투구 스피드를 저장했다.

만약 첫번째 위치에 "133"이라는 투구 스피드를 삽입하고 싶다면 아래와 같이 코드를 작성하면 된다.

```java
pitches.add(0, "133");    // 첫번째 위치에 133 삽입.
```

만약 2번 째 위치에 133을 삽일 할 경우에는 다음과 같이 코드를 작성하면 된다.

```java
pitches.add(1, "133");
```

## get

박찬호 선수의 2번째 투구 스피드를 알고 싶다면 다음과 같이 하면 된다.

```java
System.out.println(pitches.get(1));
```

ArrayList의 get 메소드를 이용하면 특정 인덱스의 값을 추출할 수 있다.

## size

size 메소드는 ArrayList의 갯수를 리턴한다.

```java
System.out.println(pitches.size());
```

현재 pitches에 담긴 갯수에 해당되는 값이 출력될 것이다.

## contains

contains 메소드는 리스트 안에 항목값이 있는지를 판별하여 그 결과를 boolean으로 리턴한다.

```java
System.out.println(pitches.contains("142"));
```

142라는 값을 포함하고 있으므로 true가 출력될 것이다.

## remove

remove 메소드에는 2개의 방식이 있다. (이름은 같지만 입력파라미터가 다르다)

1. remove(객체)
2. remove(인덱스)

remove(객체)의 경우는 리스트에서 객체에 해당되는 항목을 삭제하고 삭제한 결과를 리턴한다.

```java
System.out.println(pitches.remove("129"));
```

수행결과는 다음과 같다.

```java
true
```

"129"라는 항목이 성공적으로 삭제되고 true를 리턴한다.

remove(인덱스)의 경우는 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴한다.

```java
System.out.println(pitches.remove(0));
```

수행결과는 다음과 같다.

```java
138
```

pitches의 첫번째 항목은 "138"이므로 "138"이 삭제된 후 "138"을 리턴했다.

## HashMap

HashMap은 Map의 일종으로 key와 value의 쌍으로 이루어진 데이터를 보관한다.

HashMap은 다음과 같은 특징이 있다.

- null key와 null value를 모두 허용한다.
- 내부적으로 데이터에 접근할 때 동기화를 보장하지 않는다.
- 데이터의 순서를 보장하지 않는다.
- 중복된 key값을 허용하진 않지만, 중복된 값은 갖을 수 있다.

HashMap은 대표적으로 다음과 같은 API들을 제공한다.

- put()
- get()
- remove()
- replace()

## put()

`put()`은 인자로 key와 value를 받습니다. 전달된 인자는 HashMap에 key-value 관계로 저장이 됩니다.

```java
public V put(K key, V value)
```

## get()

`get()`은 인자로 전달된 key에 해당하는 value를 리턴해 줍니다. key가 존재하지 않으면 `null`을 리턴합니다.

```java
public V get(Object key)
```

## remove()

`remove()`는 인자로 전달된 key에 해당하는 데이터를 삭제합니다. 삭제가 되면 value가 리턴됩니다. 존재하지 않는 데이터라면 `null`이 리턴됩니다.

```java
public V remove(Object key)
```

## replace()

`replace()`는 인자로 전달된 key의 value를 인자로 전달된 value로 교체해 줍니다. 교체되어 삭제되는 value는 리턴됩니다. 존재하지 않는 key가 인자로 전달되면 `null`이 리턴됩니다.

```java
public V replace(K key, V value)
```
