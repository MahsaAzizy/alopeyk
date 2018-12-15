package test.azizi.alopeyk.ui.main.activity;

import javax.inject.Inject;

import test.azizi.alopeyk.ui.base.BasePresenter;
import test.azizi.alopeyk.ui.base.mvp.MvpView;
import test.azizi.alopeyk.ui.main.fragment.cart.CartMvpPresenter;
import test.azizi.alopeyk.ui.main.fragment.cart.CartMvpView;

/**
 * Created by MahtabAzizi on 12/11/2018.
 */
public class MainActivityPresenterImpl <V extends MainActivityView> extends BasePresenter<V>
        implements MainActivityPresenter<V> {


    @Inject
    public MainActivityPresenterImpl() {
        super();
    }



}
