package com.example.ribeirosoaresadvogados.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.ribeirosoaresadvogados.data.PracticeArea
import com.example.ribeirosoaresadvogados.ui.adaptive.AdaptiveListDetailScaffold
import com.example.ribeirosoaresadvogados.ui.components.HeroSection
import com.example.ribeirosoaresadvogados.ui.components.PracticeAreasCatalog
import com.example.ribeirosoaresadvogados.ui.components.TopNavBar
import com.example.ribeirosoaresadvogados.ui.components.TrustIndicators
import com.example.ribeirosoaresadvogados.ui.components.ValuesSection

@Composable
fun HomeScreen(
    onNavigateToPartners: () -> Unit,
    onNavigateToContact: () -> Unit
) {
    var currentArea by remember { mutableStateOf<PracticeArea?>(null) }

    AdaptiveListDetailScaffold(
        onAreaSelected = { area -> currentArea = area },
        currentArea = currentArea,
        onBack = { currentArea = null }
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
