package com.example.ribeirosoaresadvogados.ui.adaptive

import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.example.ribeirosoaresadvogados.data.PracticeArea
import com.example.ribeirosoaresadvogados.ui.HomeContent
import com.example.ribeirosoaresadvogados.ui.components.PracticeAreaDetail
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
actual fun AdaptiveListDetailScaffold(
    onAreaSelected: (PracticeArea) -> Unit,
    currentArea: PracticeArea?,
    onBack: () -> Unit
) {
    val navigator = rememberListDetailPaneScaffoldNavigator<PracticeArea>()
    val scope = rememberCoroutineScope()

    ListDetailPaneScaffold(
        directive = navigator.scaffoldDirective,
        value = navigator.scaffoldValue,
        listPane = {
            HomeContent(
                onAreaSelected = { area ->
                    scope.launch {
                        navigator.navigateTo(ListDetailPaneScaffoldRole.Detail, area)
                    }
                },
                onExploreServices = {},
                onContactUs = {}, // Pass these from App or use navigation
                onMenuClick = {}
            )
        },
        detailPane = {
            navigator.currentDestination?.contentKey?.let { area ->
                PracticeAreaDetail(
                    area = area,
                    onBack = { 
                        scope.launch {
                            navigator.navigateBack()
                        }
                    }
                )
            }
        }
    )
}
