package com.designpattern.statepattern.system;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class AppContext {

    public static final UserState STATE_LOGIN = new LoginState();
    public static final UserState STATE_UNLOGIN = new UnLoginState();

    private UserState currUserState = STATE_UNLOGIN;

    {
        STATE_LOGIN.setContext(this);
        STATE_UNLOGIN.setContext(this);
    }

    public void setState(UserState userState) {
        this.currUserState = userState;
    }

    public UserState getState() {
        return this.currUserState;
    }

    public void favorite(){
        this.currUserState.favorite();
    }

    public void comment(String comment){
        this.currUserState.comment(comment);
    }
}
