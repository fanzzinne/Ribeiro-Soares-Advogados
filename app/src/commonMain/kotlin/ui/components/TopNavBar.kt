package com.example.ribeirosoaresadvogados.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBalance
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopNavBar(
    onContactClick: () -> Unit = {}
) {
    Surface(
        color = Color.Black.copy(alpha = 0.4f),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 80.dp, vertical = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Logo
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Rounded.AccountBalance,
                    contentDescription = null,
                    tint = Color(0xFFD4AF37),
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "RIBEIRO SOARES",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 2.sp
                    )
                    Text(
                        text = "ADVOGADOS",
                        style = MaterialTheme.typography.labelSmall,
                        color = Color(0xFFD4AF37),
                        letterSpacing = 2.sp
                    )
                }
            }

            // Navigation Links (Visible on desktop/large screens)
            Row(
                horizontalArrangement = Arrangement.spacedBy(24.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                NavLink("INÍCIO", active = true)
                NavLink("O ESCRITÓRIO")
                NavLink("ESPECIALIDADES")
                NavLink("SÓCIOS")
                NavLink("CONTATO")
            }

            // CTA Button
            OutlinedButton(
                onClick = onContactClick,
                border = BorderStroke(1.dp, Color(0xFFD4AF37)),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFFD4AF37)),
                shape = MaterialTheme.shapes.extraSmall
            ) {
                Text(
                    "CONSULTA GRATUITA",
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun NavLink(text: String, active: Boolean = false) {
    Text(
        text = text,
        style = MaterialTheme.typography.labelLarge,
        color = if (active) Color(0xFFD4AF37) else Color.White,
        fontWeight = if (active) FontWeight.Bold else FontWeight.Normal,
        letterSpacing = 1.sp
    )
}
