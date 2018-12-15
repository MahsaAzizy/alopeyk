package test.azizi.alopeyk.ui.main.fragment.category;

import android.content.Context;

import test.azizi.alopeyk.data.product.CategoriesImpl;
import test.azizi.alopeyk.ui.base.mvp.MvpPresenter;

/**
 * Created by MahtabAzizi on 12/11/2018.
 */
public interface CategoriesMvpPresenter<V extends CategoriesMvpView>
        extends MvpPresenter<V> {
    void getData(CategoriesImpl categories);
}
