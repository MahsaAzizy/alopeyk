package test.azizi.alopeyk.data.product;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import test.azizi.alopeyk.model.CategoryModel;
import test.azizi.alopeyk.tools.Utility;

/**
 * Authors:
 * Mahtab Azizi <mahtab.azizy@gmail.com>
 * Copyright © 2017
 */
public class CategoriesImpl implements CategoriesInteractor {
    List<CategoryModel> categoryModels;

    public CategoriesImpl(Context context) {
        String data = Utility.getAssetJsonData(context,"data/category.json");
        Gson gson = new Gson();
        categoryModels = gson.fromJson(data, new TypeToken<List<CategoryModel>>(){}.getType());

    }

    @Override
    public void findCategoriesData(OnFinishedListener listener) {
        listener.onCategoriesFinished(categoryModels);

    }
}
