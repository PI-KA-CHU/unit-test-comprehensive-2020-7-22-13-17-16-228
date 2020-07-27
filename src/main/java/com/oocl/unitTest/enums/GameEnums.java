package com.oocl.unitTest.enums;

public enum GameEnums {

    WRONG_INPUT("Wrong Input，Input again"),
    WIN_GAME("you are win!"),
    FAIL_GAME("you are fail"),
    ;
    private String message;

    GameEnums(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
