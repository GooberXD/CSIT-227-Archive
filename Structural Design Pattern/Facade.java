class SocialSharing {
  public void shareUrl(String url) {
    facebookApi.share(url);
    twitterClient.post(url);
    linkedInClient.createPost(url);
  }
}

class Client {
  // ...
  socialSharing.shareUrl("http://medium.com");
  // ...
}