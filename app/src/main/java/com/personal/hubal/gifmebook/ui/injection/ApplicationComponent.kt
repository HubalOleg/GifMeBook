package com.personal.hubal.gifmebook.ui.injection

import android.app.Application
import com.personal.hubal.gifmebook.ui.GifMeBookApplication
import com.personal.hubal.gifmebook.ui.injection.module.BindingModule
import com.personal.hubal.gifmebook.ui.injection.module.ApplicationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import org.buffer.android.boilerplate.ui.injection.scopes.PerApplication

/**
 * Created by hubal on 10/21/2017.
 */

@PerApplication
@Component(modules = arrayOf(BindingModule::class, ApplicationModule::class,
        AndroidSupportInjectionModule::class))
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: Application): Builder
        fun build(): ApplicationComponent
    }

    fun inject(app: GifMeBookApplication)
}