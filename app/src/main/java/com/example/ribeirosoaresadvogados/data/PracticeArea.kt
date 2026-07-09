package com.example.ribeirosoaresadvogados.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBalance
import androidx.compose.material.icons.rounded.Assignment
import androidx.compose.material.icons.rounded.Gavel
import androidx.compose.material.icons.rounded.Handshake
import androidx.compose.material.icons.rounded.Healing
import androidx.compose.material.icons.rounded.Security
import androidx.compose.ui.graphics.vector.ImageVector

data class PracticeArea(
    val id: Int,
    val title: String,
    val description: String,
    val icon: ImageVector,
    val details: String
)

val LaborLawPracticeAreas = listOf(
    PracticeArea(
        id = 1,
        title = "Rescisão de Contrato",
        description = "Análise e cobrança de verbas rescisórias.",
        icon = Icons.Rounded.Assignment,
        details = "Acompanhamento completo em processos de demissão sem justa causa, pedido de demissão e rescisão indireta. Garantimos que FGTS, multa de 40%, férias e 13º salário sejam pagos corretamente."
    ),
    PracticeArea(
        id = 2,
        title = "Horas Extras",
        description = "Receba o pagamento justo pelo seu tempo.",
        icon = Icons.Rounded.Gavel,
        details = "Cálculo minucioso de jornadas excedentes, intervalos não gozados e adicional noturno. Defesa técnica para comprovação de jornada através de provas documentais e testemunhais."
    ),
    PracticeArea(
        id = 3,
        title = "Acidente de Trabalho",
        description = "Indenizações por danos físicos e morais.",
        icon = Icons.Rounded.Healing,
        details = "Ação judicial para reparação de danos decorrentes de acidentes no ambiente de trabalho ou doenças ocupacionais (LER/DORT). Buscamos estabilidade, pensão vitalícia e ressarcimento de gastos médicos."
    ),
    PracticeArea(
        id = 4,
        title = "Assédio Moral",
        description = "Proteção à sua dignidade no trabalho.",
        icon = Icons.Rounded.Security,
        details = "Combate a condutas abusivas, humilhações e perseguições no ambiente profissional. Buscamos a reparação por danos morais e, se necessário, o reconhecimento da rescisão indireta."
    ),
    PracticeArea(
        id = 5,
        title = "FGTS e Multas",
        description = "Regularização de depósitos e multas.",
        icon = Icons.Rounded.AccountBalance,
        details = "Cobrança de depósitos de FGTS não realizados pela empresa e aplicação das multas previstas na CLT por atrasos no pagamento das verbas rescisórias."
    ),
    PracticeArea(
        id = 6,
        title = "Reconhecimento de Vínculo",
        description = "Direitos para quem trabalha sem registro.",
        icon = Icons.Rounded.Handshake,
        details = "Ação para reconhecimento da relação de emprego para trabalhadores informais, autônomos ou 'pejotizados' que cumprem os requisitos de subordinação, habitualidade e onerosidade."
    )
)
