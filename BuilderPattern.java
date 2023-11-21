public class BuilderPattern {

    private String userId;

    private String token;

    private BuilderPattern() {}

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public static Builder newBuilder() {
        return new BuilderPattern().new Builder();
    }

    public class Builder {

        private Builder() {}

        public Builder setUserId(String userId) {
            BuilderPattern.this.userId = userId;
            return this;
        }

        public Builder setToken(String token) {
            BuilderPattern.this.token = token;
            return this;
        }

        public BuilderPattern build() {
            return BuilderPattern.this;
        }
    }
}

/*
public class AccountTest {
    @Test
    public void simpleTest() {
        BuilderPattern pattern = BuilderPattern.newBuilder()
                .setToken("lorem")
                .setUserId("ipsum")
                .build();
        System.out.println(account.getToken());
    }
}
 */
