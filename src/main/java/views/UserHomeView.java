package views;

import io.dropwizard.views.View;
import models.InfluencerProfile;
import models.UserProfile;

import java.util.ArrayList;

public class UserHomeView extends View {

    private final UserProfile userProfile;
    private final ArrayList<InfluencerProfile> influencers;
    private ArrayList<String> followingChannelIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param userProfile
     * the profile of the user
     * @param influencers
     * the list of influencers
     */
    public UserHomeView(UserProfile userProfile, ArrayList<InfluencerProfile> influencers) {
        super("user_home.ftl");
        this.userProfile = userProfile;
        this.influencers = influencers;
        for (InfluencerProfile influencer: userProfile.getFollowingChannels()) {
            this.followingChannelIds.add(influencer.getChannelId());
        }
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public ArrayList<InfluencerProfile> getInfluencers() {
        return influencers;
    }

    public ArrayList<String> getFollowingChannelIds() { return followingChannelIds;}
}
