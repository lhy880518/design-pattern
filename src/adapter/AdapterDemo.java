package adapter;

/**
 * @author hyunyong.lee (hylee@sdt.inc)
 */
class AdapterDemo {
    public static void main(String[] args) {
        WebAdapter webAdapter = new WebAdapter(new FancyRequester());
        WebClient webClient = new WebClient(webAdapter);
        webClient.doWork();
    }
}
