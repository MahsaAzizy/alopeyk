package test.azizi.alopeyk.di.module;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by MahtabAzizi on 12/11/2018.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface ActivityContext {
}
