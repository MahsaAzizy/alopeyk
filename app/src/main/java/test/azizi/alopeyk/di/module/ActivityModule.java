package test.azizi.alopeyk.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import test.azizi.alopeyk.R;
import test.azizi.alopeyk.model.CategoryModel;
import test.azizi.alopeyk.model.ProductDto;
import test.azizi.alopeyk.ui.main.activity.MainActivityPresenter;
import test.azizi.alopeyk.ui.main.activity.MainActivityPresenterImpl;
import test.azizi.alopeyk.ui.main.activity.MainActivityView;
import test.azizi.alopeyk.ui.main.adapter.CartAdapter;
import test.azizi.alopeyk.ui.main.adapter.CategoriesAdapter;
import test.azizi.alopeyk.ui.main.adapter.ProductAdapter;
import test.azizi.alopeyk.ui.main.fragment.cart.CartFragment;
import test.azizi.alopeyk.ui.main.fragment.cart.CartMvpPresenter;
import test.azizi.alopeyk.ui.main.fragment.cart.CartMvpView;
import test.azizi.alopeyk.ui.main.fragment.cart.CartPresenter;
import test.azizi.alopeyk.ui.main.fragment.category.CategoriesFragment;
import test.azizi.alopeyk.ui.main.fragment.category.CategoriesMvpPresenter;
import test.azizi.alopeyk.ui.main.fragment.category.CategoriesMvpView;
import test.azizi.alopeyk.ui.main.fragment.category.CategoriesPresenter;
import test.azizi.alopeyk.ui.map.MapMvpPresenter;
import test.azizi.alopeyk.ui.map.MapMvpView;
import test.azizi.alopeyk.ui.map.MapPresenter;

/**
 * Created by MahtabAzizi on 12/11/2018.
 */
@Module
public class ActivityModule {
    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    FragmentPagerItemAdapter fragmentPagerItemAdapter(AppCompatActivity mActivity) {
        return new FragmentPagerItemAdapter(mActivity.getSupportFragmentManager(), FragmentPagerItems.with(mActivity)
                .add(mActivity.getString(R.string.categories), CategoriesFragment.class)
                .add(mActivity.getString(R.string.cart), CartFragment.class)
                .create());
    }

    @Provides
    CategoriesAdapter categoriesAdapter() {
        return new CategoriesAdapter(new ArrayList<CategoryModel>());
    }

    @Provides
    ProductAdapter productAdapter() {
        return new ProductAdapter(new ArrayList<ProductDto>());
    }

    @Provides
    CartAdapter cartAdapter() {
        return new CartAdapter(new ArrayList<ProductDto>());
    }


    @Provides
    CartMvpPresenter<CartMvpView> cartMvpPresenter(
            CartPresenter<CartMvpView> presenter) {
        return presenter;
    }
    @Provides
    CategoriesMvpPresenter<CategoriesMvpView> categoriesMvpPresenter(
            CategoriesPresenter<CategoriesMvpView> presenter) {
        return presenter;
    }
    @Provides
    MapMvpPresenter<MapMvpView> mapMvpPresenter(
            MapPresenter<MapMvpView> presenter) {
        return presenter;
    }
    @Provides
    MainActivityPresenter<MainActivityView> mainActivityPresenter(
            MainActivityPresenter<MainActivityView> presenter) {
        return presenter;
    }

}
