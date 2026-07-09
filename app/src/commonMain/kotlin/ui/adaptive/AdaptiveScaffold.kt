package com.example.ribeirosoaresadvogados.ui.adaptive

import androidx.compose.runtime.Composable
import com.example.ribeirosoaresadvogados.data.PracticeArea

@Composable
expect fun AdaptiveListDetailScaffold(
    onAreaSelected: (PracticeArea) -> Unit,
    currentArea: PracticeArea?,
    onBack: () -> Unit
)
