package com.example.ribeirosoaresadvogados.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.rounded.AccountBalance
import androidx.compose.material.icons.rounded.Business
import androidx.compose.material.icons.rounded.ChevronRight
import androidx.compose.material.icons.rounded.FamilyRestroom
import androidx.compose.material.icons.rounded.Gavel
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeroSection(
    modifier: Modifier = Modifier,
    onExploreServices: () -> Unit = {},
    onContactUs: () -> Unit = {}
) {
    val alpha = remember { Animatable(0f) }
    val translateY = remember { Animatable(50f) }

    LaunchedEffect(Unit) {
        alpha.animateTo(1f, animationSpec = tween(1200))
        translateY.animateTo(0f, animationSpec = tween(1000, easing = FastOutSlowInEasing))
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(700.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF0F1419),
                        Color(0xFF050709)
                    )
                )
            )
            .graphicsLayer {
                this.alpha = alpha.value
                this.translationY = translateY.value
            }
    ) {
        // Main Content Row
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 80.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left Column: Text and Buttons
            Column(
                modifier = Modifier.weight(1.2f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "NÓS LUTAMOS. VOCÊ VENCE.",
                    style = MaterialTheme.typography.labelLarge,
                    color = Color(0xFFD4AF37),
                    letterSpacing = 3.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = buildAnnotatedString {
                        append("SOLUÇÕES JURÍDICAS\n")
                        withStyle(style = SpanStyle(color = Color(0xFFD4AF37))) {
                            append("EM QUE VOCÊ CONFIA")
                        }
                    },
                    style = MaterialTheme.typography.displayLarge.copy(
                        fontSize = 72.sp,
                        lineHeight = 80.sp
                    ),
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Oferecemos serviços de excelência com integridade, dedicação e resultados comprovados. Seus direitos são nossa prioridade absoluta.",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White.copy(alpha = 0.7f),
                    modifier = Modifier.width(500.dp),
                    lineHeight = 28.sp
                )

                Spacer(modifier = Modifier.height(48.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = onExploreServices,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFD4AF37),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.height(60.dp),
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text("NOSSOS SERVIÇOS", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(Icons.AutoMirrored.Rounded.ArrowForward, contentDescription = null, modifier = Modifier.size(18.dp))
                    }

                    OutlinedButton(
                        onClick = onContactUs,
                        modifier = Modifier.height(60.dp),
                        border = BorderStroke(1.dp, Color.White.copy(alpha = 0.5f)),
                        shape = RoundedCornerShape(4.dp),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White)
                    ) {
                        Text("CONTATE-NOS", fontWeight = FontWeight.Bold)
                    }
                }
            }

            // Right Column: Practice Areas Card
            Surface(
                modifier = Modifier
                    .weight(0.8f)
                    .padding(start = 60.dp),
                color = Color.White.copy(alpha = 0.05f),
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.1f))
            ) {
                Column(
                    modifier = Modifier.padding(32.dp)
                ) {
                    Text(
                        text = "ÁREAS DE ATUAÇÃO",
                        style = MaterialTheme.typography.labelMedium,
                        color = Color(0xFFD4AF37),
                        letterSpacing = 2.sp,
                        fontWeight = FontWeight.Bold
                    )
                    
                    Spacer(modifier = Modifier.height(24.dp))
                    
                    PracticeAreaItem(Icons.Rounded.Business, "DIREITO DO TRABALHO")
                    PracticeAreaItem(Icons.Rounded.Gavel, "DEFESA CRIMINAL")
                    PracticeAreaItem(Icons.Rounded.FamilyRestroom, "DIREITO DE FAMÍLIA")
                    PracticeAreaItem(Icons.Rounded.Person, "DANOS PESSOAIS")
                    PracticeAreaItem(Icons.Rounded.Home, "DIREITO IMOBILIÁRIO")
                    PracticeAreaItem(Icons.Rounded.AccountBalance, "PLANEJAMENTO SUCESSÓRIO")
                    
                    Spacer(modifier = Modifier.height(24.dp))
                    
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = "VER TODAS AS ÁREAS",
                            style = MaterialTheme.typography.labelLarge,
                            color = Color(0xFFD4AF37),
                            fontWeight = FontWeight.Bold
                        )
                        Icon(
                            Icons.Rounded.ChevronRight,
                            contentDescription = null,
                            tint = Color(0xFFD4AF37),
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun PracticeAreaItem(icon: ImageVector, title: String) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color(0xFFD4AF37),
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = title,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White,
                fontWeight = FontWeight.Medium
            )
        }
        HorizontalDivider(color = Color.White.copy(alpha = 0.1f))
    }
}
