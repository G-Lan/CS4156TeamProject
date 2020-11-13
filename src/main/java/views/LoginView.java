package views;

import io.dropwizard.views.View;

public class LoginView extends View {

    private final String welcomeWords;

    public LoginView(String welcomeWords){
        super("login.ftl");
        this.welcomeWords = welcomeWords;
    }

    public String getWelcomeWords(){
        return welcomeWords;
    }
}
