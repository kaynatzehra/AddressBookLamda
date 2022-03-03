package com.BridgeLabz.AddBookLambda;

public class ExpectedException {
    public static ExpectedException none() {
        return null;
    }

    public void expect(Class<InvalidUserException> invalidUserExceptionClass) {
    }
}
