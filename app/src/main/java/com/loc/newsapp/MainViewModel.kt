package com.loc.newsapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.loc.newsapp.domain.usecases.AppEntryUseCases
import com.loc.newsapp.presentation.onboarding.nvgraph.Route
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val appEntryUseCases: AppEntryUseCases
) :ViewModel() {
     var splashCondition by mutableStateOf(true)
         private set

    var startDestination by mutableStateOf(Route.AppStartNavigation.route)
        private set

    init {
        appEntryUseCases.readAppEntry().onEach {shouldStartFromHomeScreen ->
            if (shouldStartFromHomeScreen){
                startDestination = Route.AppStartNavigation.route
            }else{
                startDestination = Route.AppStartNavigation.route
            }
            delay(300)
            splashCondition = false

        }
    }
}