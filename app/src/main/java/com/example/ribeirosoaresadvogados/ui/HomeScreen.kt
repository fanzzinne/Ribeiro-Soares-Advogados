package com.example.ribeirosoaresadvogados.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.example.ribeirosoaresadvogados.data.PracticeArea
import com.example.ribeirosoaresadvogados.ui.components.HeroSection
import com.example.ribeirosoaresadvogados.ui.components.PracticeAreaDetail
import com.example.ribeirosoaresadvogados.ui.components.PracticeAreasCatalog
import com.example.ribeirosoaresadvogados.ui.components.TopNavBar
import com.example.ribeirosoaresadvogados.ui.components.TrustIndicators
import com.example.ribeirosoaresadvogados.ui.components.ValuesSection
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun HomeScreen(
    onNavigateToPartners: () -> Unit,
    onNavigateToContact: () -> Unit
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
                onExploreServices = { /* Scroll to catalog if needed */ },
                onContactUs = onNavigateToContact,
                onMenuClick = onNavigateToPartners
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

@Composable
fun HomeContent(
    onAreaSelected: (PracticeArea) -> Unit,
    onExploreServices: () -> Unit,
    onContactUs: () -> Unit,
    onMenuClick: () -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { 
            TopNavBar(
                onMenuClick = onMenuClick,
                onContactClick = onContactUs
            ) 
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            item {
                HeroSection(
                    onExploreServices = onExploreServices,
                    onContactUs = onContactUs
                )
            }
            
            item {
                TrustIndicators()
            }
            
            item {
                ValuesSection()
            }
            
            item {
                PracticeAreasCatalog(
                    onAreaSelected = onAreaSelected
                )
            }
        }
    }
}
