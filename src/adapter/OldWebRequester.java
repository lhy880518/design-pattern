package adapter;

/**
 * @author hyunyong.lee (hylee@sdt.inc)
 */
class OldWebRequester implements WebRequester
{
    @Override
    public void requestHandler() {
        System.out.println("OldWebRequester is Running");
    }
}
