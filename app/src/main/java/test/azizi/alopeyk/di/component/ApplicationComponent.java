package test.azizi.alopeyk.di.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import test.azizi.alopeyk.di.module.AppModule;
import test.azizi.alopeyk.ui.base.BaseApplication;

/**
 * Created by MahtabAzizi on 12/11/2018.
 */
@Singleton
@Component(modules = AppModule.class)
public interface ApplicationComponent {

    void inject(BaseApplication app);


}