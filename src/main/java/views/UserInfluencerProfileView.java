package views;

import io.dropwizard.views.View;
import models.UserInfluencerProfile;

public class UserInfluencerProfileView extends View {

    private final UserInfluencerProfile userInfluencerProfile;

    public UserInfluencerProfileView(UserInfluencerProfile userInfluencerProfile) {
        super("user_influencer_profile.ftl");
        this.userInfluencerProfile = userInfluencerProfile;
    }

    public UserInfluencerProfile getUserInfluencerProfile() {
        return userInfluencerProfile;
    }
}
