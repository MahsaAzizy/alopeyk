package test.azizi.alopeyk.ui.main.fragment.category;

import java.util.List;

import test.azizi.alopeyk.model.CategoryModel;
import test.azizi.alopeyk.ui.base.mvp.MvpView;

/**
 * Created by MahtabAzizi on 12/11/2018.
 */
public interface CategoriesMvpView extends MvpView{
    void categoryData(List<CategoryModel> categoryModels);
    void openMapActivity();

}
