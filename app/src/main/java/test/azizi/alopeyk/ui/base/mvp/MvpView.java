package test.azizi.alopeyk.ui.base.mvp;

/**
 * Created by MahtabAzizi on 12/11/2018.
 */
public interface MvpView {
    void showProgress();
    void hideProgress();
    void onError(String error);
    void onMessage(String message);
}
