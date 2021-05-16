package adapter;

/**
 * @author hyunyong.lee (hylee@sdt.inc)
 */
class WebAdapter implements WebRequester{
    private FancyRequester fancyRequester;

    public WebAdapter(FancyRequester fancyRequester){
        this.fancyRequester = fancyRequester;
    }

    @Override
    public void requestHandler() {
        fancyRequester.FancyRequestHandler();
    }
}
