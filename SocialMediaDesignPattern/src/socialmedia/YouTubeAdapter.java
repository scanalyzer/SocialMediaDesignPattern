/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author admin
 */
public class YouTubeAdapter implements SocialMediaEntry {
    public YouTubeVideo video;

    YouTubeAdapter(YouTubeVideo video) {
        this.video = video;
    }
    
    public String getUser() {
        return video.getAuthor();
    }
    
    public String getPostText() {
        return video.getTitle() + ": " + video.getDescription();
    }
}
