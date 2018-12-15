package test.azizi.alopeyk.ui.map;

import javax.inject.Inject;

import test.azizi.alopeyk.ui.base.BasePresenter;
import test.azizi.alopeyk.ui.base.mvp.MvpView;
import test.azizi.alopeyk.ui.main.fragment.cart.CartMvpPresenter;
import test.azizi.alopeyk.ui.main.fragment.cart.CartMvpView;
import test.azizi.alopeyk.ui.main.fragment.category.CategoriesMvpPresenter;
import test.azizi.alopeyk.ui.main.fragment.category.CategoriesMvpView;

/**
 * Created by MahtabAzizi on 12/12/2018.
 */
public class MapPresenter<V extends MapMvpView> extends BasePresenter<V>
        implements MapMvpPresenter<V> {
    @Inject
    public MapPresenter() {
        super();


    }


    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onPause() {

    }


}
