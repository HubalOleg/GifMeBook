package com.personal.hubal.gifmebook.ui.injection.component

import com.personal.hubal.gifmebook.ui.auth.AuthActivity
import com.personal.hubal.gifmebook.ui.injection.module.AuthActivityModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by hubal on 10/21/2017.
 */

@Subcomponent(modules = arrayOf(AuthActivityModule::class))
interface AuthActivitySubComponent : AndroidInjector<AuthActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<AuthActivity>()
}