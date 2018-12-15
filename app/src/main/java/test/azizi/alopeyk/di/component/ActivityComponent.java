package test.azizi.alopeyk.di.component;

import dagger.Component;
import test.azizi.alopeyk.di.module.ActivityModule;
import test.azizi.alopeyk.ui.main.activity.MainActivity;
import test.azizi.alopeyk.ui.main.adapter.CategoriesAdapter;
import test.azizi.alopeyk.ui.main.adapter.ProductAdapter;
import test.azizi.alopeyk.ui.main.fragment.cart.CartFragment;
import test.azizi.alopeyk.ui.main.fragment.category.CategoriesFragment;
import test.azizi.alopeyk.ui.map.MapActivity;

/**
 * Created by MahtabAzizi on 12/11/2018.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
    void inject(CategoriesFragment categoriesFragment);
    void inject(CartFragment cartFragment);
    void inject(ProductAdapter productAdapter);
    void inject(MapActivity mapActivity);
    void inject(CategoriesAdapter.CategoriesViewHolder categoriesViewHolder);



}
