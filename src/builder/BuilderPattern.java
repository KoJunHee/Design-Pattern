package builder;

public class BuilderPattern {
    public static void main(String[] args) {

        // 빌더 객체를 하나 만듭니다.
        UserInfoBuilder userInfoBuilder = new UserInfoBuilder();

        // 빌더 객체에 원하는 데이터를 입력합니다. 순서는 상관 없습니다.
        UserInfo result = userInfoBuilder
                .setFirstName("Junhee")
                .setLastName("Ko")
                // 마지막에 .build() 메소드를 호출해서 최종적인 결과물을 만들어 반환합니다.
                .build();

        // test
        System.out.println(result.getUserInfo());

    }
}
