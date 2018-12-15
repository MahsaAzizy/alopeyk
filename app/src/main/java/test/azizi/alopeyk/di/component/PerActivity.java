package test.azizi.alopeyk.di.component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by MahtabAzizi on 12/11/2018.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
@interface PerActivity {
}
