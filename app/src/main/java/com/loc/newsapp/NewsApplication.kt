package com.loc.newsapp

import android.app.Application
import com.loc.newsapp.domain.manager.LocalUserManager
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.flow.Flow

@HiltAndroidApp
class NewsApplication:Application(){

}