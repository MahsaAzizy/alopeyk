package test.azizi.alopeyk.data.product;

import android.content.Context;

import java.util.List;

import test.azizi.alopeyk.model.CategoryModel;

/**
 * Authors:
 * Mahtab Azizi <mahtab.azizy@gmail.com>
 * Copyright © 2017
 */
public interface CategoriesInteractor {
    interface OnFinishedListener {
        void onCategoriesFinished(List<CategoryModel> response);
        void onCategoriesError(String error);
    }

    void findCategoriesData(OnFinishedListener listener);
}
