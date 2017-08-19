package com.ragdroid.dahaka.activity.home.profile;

/**
 * Created by garimajain on 16/08/17.
 */

public class ProfileModel {

    public String imageUrl;
    public String name;
    public int weight;
    public int height;
    public int experience;

    private ProfileModel(Builder builder) {
        imageUrl = builder.imageUrl;
        name = builder.name;
        weight = builder.weight;
        height = builder.height;
        experience = builder.experience;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String imageUrl;
        private String name;
        private int weight;
        private int height;
        private int experience;

        private Builder() {
        }

        public Builder imageUrl(String val) {
            imageUrl = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder weight(int val) {
            weight = val;
            return this;
        }

        public Builder height(int val) {
            height = val;
            return this;
        }

        public Builder experience(int val) {
            experience = val;
            return this;
        }

        public ProfileModel build() {
            return new ProfileModel(this);
        }
    }
}
