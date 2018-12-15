package test.azizi.alopeyk.ui.main.fragment.category;

import android.content.Context;

import java.util.List;

import javax.inject.Inject;

import test.azizi.alopeyk.data.product.CategoriesImpl;
import test.azizi.alopeyk.data.product.CategoriesInteractor;
import test.azizi.alopeyk.model.CategoryModel;
import test.azizi.alopeyk.ui.base.BasePresenter;
import test.azizi.alopeyk.ui.base.mvp.MvpPresenter;
import test.azizi.alopeyk.ui.base.mvp.MvpView;
import test.azizi.alopeyk.ui.main.fragment.cart.CartMvpPresenter;
import test.azizi.alopeyk.ui.main.fragment.cart.CartMvpView;

/**
 * Created by MahtabAzizi on 12/11/2018.
 */
public class CategoriesPresenter<V extends CategoriesMvpView> extends BasePresenter<V>
        implements CategoriesMvpPresenter<V> ,CategoriesImpl.OnFinishedListener {
    @Inject
    public CategoriesPresenter() {
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

    @Override
    public void onCategoriesFinished(List<CategoryModel> response) {
        getMvpView().categoryData(response);

    }

    @Override
    public void onCategoriesError(String error) {
        getMvpView().onError(error);


    }

    @Override
    public void getData(CategoriesImpl categories) {
        categories.findCategoriesData(this);
    }
}
