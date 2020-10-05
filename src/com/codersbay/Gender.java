package com.codersbay;

public enum  Gender {
    MALE(1),
    FEMALE(2);

    public int genderCode;

    Gender (int genderCode) {
        this.genderCode = genderCode;
    }

    public static Gender fromCode(int genderCode) {
        return switch (genderCode) {
            case 1 -> Gender.MALE;
            case 2 -> Gender.FEMALE;
            default -> throw new IllegalStateException("Unexpected value: " + genderCode);
        };
    }

}

