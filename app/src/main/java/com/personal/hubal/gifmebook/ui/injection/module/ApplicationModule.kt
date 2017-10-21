package com.personal.hubal.gifmebook.ui.injection.module

import android.app.Application
import android.content.Context
import com.personal.hubal.gifmebook.ui.injection.component.AuthActivitySubComponent
import com.personal.hubal.gifmebook.ui.injection.component.SignInFragmentSubComponent
import dagger.Module
import dagger.Provides
import org.buffer.android.boilerplate.ui.injection.scopes.PerApplication

/**
 * Created by hubal on 10/21/2017.
 */

@Module()
open class ApplicationModule {

    @Provides
    @PerApplication
    fun provideContext(application: Application) : Context {
        return application
    }

    @Provides
    @PerApplication
    fun provideStirng() : String {
        return "Hello injection"
    }
}