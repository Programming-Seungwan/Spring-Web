# Spring concept and Study

## 2 - way binding
1. Java와 템플릿 엔진을 이용해서 웹 페이지를 만들 때 동일 URL에 여러 메서드로 요청을 할 수 있다. 이때 매번 url 파라미터에 연결하기보다 Todo와 같은 bean 객체에 매핑하기 위한 방법이다.
2. 기존에는 @RequestParams 애너테이션을 메서드 단에서 이용했으나 이제는 그냥 Todo 타입의 객체를 넣어주면 알아서 들어감
3. form에서는 modelAttribute 라는 속성을 이용해서 양방향 바인딩을 함
4. GET 메서드에서 해당 Todo를 생성하고 POST 메서드에서 해당 bean 객체를 받아다가 씀