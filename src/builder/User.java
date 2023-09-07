package builder;

import lombok.Data;

@Data
public class User {

    private String firstName;
    private String lastName;

    public User(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
    }

    public static class Builder {

        private String firstName;
        private String lastName;

        public Builder() {
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
