package test.azizi.alopeyk.ui.base;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import javax.inject.Inject;
import javax.net.ssl.HttpsURLConnection;

import test.azizi.alopeyk.ui.base.mvp.MvpPresenter;
import test.azizi.alopeyk.ui.base.mvp.MvpView;

/**
 * Created by MahtabAzizi on 12/11/2018.
 */
public class BasePresenter <V extends MvpView> implements MvpPresenter<V>  {

    private V mMvpView;

    @Inject
    public BasePresenter() {

    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
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


    public boolean isViewAttached() {
        return mMvpView != null;
    }

    public V getMvpView() {
        return mMvpView;
    }







}
