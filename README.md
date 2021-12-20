==============   ajax 호출   ================================
1. 스프링부트 서버측 어블리케이션 프로젝트를 생성하고 포트를 8081로 변경한 후 실행하세요.
2. POST 형식으로 http://localhost:8081/hello/list 를 브라우저에서 실행하면 아래 json array을 리턴하는 java 코드를 작성하고 실행하세요.
[
	{seq:1, typeCd:'001', content:'콘텐츠1' },
	{seq:2, typeCd:'001', content:'콘텐츠2' },
	{seq:3, typeCd:'003', content:'콘텐츠3' },
	{seq:4, typeCd:'001', content:'콘텐츠4' }
]
3. html페이지를 작성해서 http://localhost:8081/hello/list 을 ajax로 실행하고, ul에 li목록으로 출력하세요.
4. http://localhost:8081/hello/save 를 실행하면 {seq, typeCd, content} 형식의 json을 파라메터로 받아 로그에 출력하는 java코드를 작성하세요.
5. 3번 목록에서 li를 클릭하면 해당 index에 json객체를 ajax로 전송(url:http://localhost:8081/hello/save)하여 로그로 출력하세요.
