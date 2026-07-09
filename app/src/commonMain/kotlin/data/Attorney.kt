package com.example.ribeirosoaresadvogados.data

data class Attorney(
    val id: Int,
    val name: String,
    val role: String,
    val expertise: String,
    val bio: String,
    val imageRes: String? = null // Using drawable names if needed
)

val FirmPartners = listOf(
    Attorney(
        id = 1,
        name = "Dr. Ricardo Ribeiro",
        role = "Sócio Sênior",
        expertise = "Especialista em Direito Processual do Trabalho",
        bio = "Com mais de 20 anos de atuação, Dr. Ricardo é referência em dissídios coletivos e negociações de alta complexidade. Sua liderança é pautada pela ética e busca incessante pela justiça social."
    ),
    Attorney(
        id = 2,
        name = "Dra. Letícia Soares",
        role = "Sócia Fundadora",
        expertise = "Especialista em Direito Individual do Trabalho",
        bio = "Especialista em rescisões indiretas e assédio moral, Dra. Letícia coordena o núcleo de atendimento ao trabalhador, garantindo suporte jurídico humanizado e resultados expressivos."
    )
)
