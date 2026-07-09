package com.example.ribeirosoaresadvogados.ui.adaptive

import androidx.compose.runtime.Composable
import com.example.ribeirosoaresadvogados.data.PracticeArea
import com.example.ribeirosoaresadvogados.ui.HomeContent
import com.example.ribeirosoaresadvogados.ui.components.PracticeAreaDetail

@Composable
actual fun AdaptiveListDetailScaffold(
    onAreaSelected: (PracticeArea) -> Unit,
    currentArea: PracticeArea?,
    onBack: () -> Unit
) {
    if (currentArea == null) {
        HomeContent(
            onAreaSelected = onAreaSelected,
            onExploreServices = {},
            onContactUs = {},
            onMenuClick = {}
        )
    } else {
        PracticeAreaDetail(
            area = currentArea,
            onBack = onBack
        )
    }
}
