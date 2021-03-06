package adapter;

/**
 * @author hyunyong.lee (hylee@sdt.inc)
 */
class WebClient {
    private WebRequester webRequester;

    public WebClient(WebRequester webRequester){
        this.webRequester = webRequester;
    }

    public void doWork(){
        webRequester.requestHandler();
    }
}
