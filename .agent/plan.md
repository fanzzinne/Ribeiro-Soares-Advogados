# Project Plan

Site de advocacia responsivo e PWA para 'Ribeiro Soares Advogados'. Design luxuoso (escuro/dourado), foco em Direito do Trabalho, idioma Português BR. Baseado na imagem fornecida.

## Project Brief

# Project Brief: Ribeiro Soares Advogados (PWA & Web App)

Este projeto consiste na criação de um Web App Responsivo e PWA (Progressive Web App) para o escritório **Ribeiro Soares Advogados**. O objetivo é transpor a autoridade e o luxo do design clássico jurídico para uma plataforma digital moderna, com foco em Direito do Trabalho, utilizando uma estética de "extremo profissionalismo" com tema escuro e detalhes em dourado.

## Features

* **Página Inicial de Prestígio**: Seção hero impactante com estética *dark & gold*, focada em transmitir confiança e autoridade imediata em Direito do Trabalho.
* **Catálogo Adaptativo de Especialidades**: Lista detalhada de serviços jurídicos (rescisões, horas extras, consultoria) que se adapta perfeitamente a qualquer tamanho de tela.
* **Canal de Atendimento PWA**: Integração direta com WhatsApp e formulários de contato, otimizada para instalação na tela inicial do usuário como um aplicativo.
* **Perfis Jurídicos Elegantes**: Apresentação dos sócios com layout luxuoso, destacando currículos e especialidades com alta fidelidade visual.

## High-Level Technical Stack

* **Linguagem**: Kotlin
* **UI Framework**: **Jetpack Compose** (via Compose Multiplatform) para desenvolvimento de um **Web App Responsivo / PWA**.
* **Navegação**: **Jetpack Navigation 3** (baseada em estado) para garantir fluxos de navegação fluidos e previsíveis.
* **Estratégia Adaptativa**: **Compose Material Adaptive Library** para garantir que o design luxuoso se ajuste dinamicamente de desktops a dispositivos móveis.
* **Concorrência**: Kotlin Coroutines para operações assíncronas e performance otimizada.
* **Estética**: Material Design 3 com sistema de cores customizado (Preto Profundo / Dourado Escovado).

## UI Design Image

Image path = C:/Users/Leonardo/AndroidStudioProjects/RibeiroSoaresAdvogados/input_images/image_0.png

## Implementation Steps
**Total Duration:** 14m 44s

### Task_1_Setup_Theme: Configure the project for Jetpack Compose and implement the luxury Material 3 theme with a 'Preto Profundo' (Deep Black) and 'Dourado Escovado' (Brushed Gold) color scheme, including full Edge-to-Edge support.
- **Status:** COMPLETED
- **Updates:** Configured project for Jetpack Compose, implemented Luxury Material 3 theme (Preto Profundo & Dourado Escovado), enabled Edge-to-Edge, and set up the foundation for a responsive PWA/Web App. Updated dependencies and cleaned up legacy XML code.
- **Acceptance Criteria:**
  - Compose dependencies integrated into build.gradle.kts
  - M3 ColorScheme defined for light/dark modes
  - Theme applied to MainActivity
  - Edge-to-edge enabled and visible in UI

### Task_2_Home_Services: Develop the 'Página Inicial de Prestígio' and the 'Catálogo Adaptativo de Especialidades' using Jetpack Compose, ensuring a responsive layout for different screen sizes.
- **Status:** COMPLETED
- **Updates:** Fixed the crash by refactoring HomeScreen to use LazyColumn and PracticeAreasCatalog to use FlowRow. This resolved the nested scrollable conflict while maintaining responsiveness and the luxury aesthetic. Verified the build is successful and stable.
- **Acceptance Criteria:**
  - Hero section implemented with high-fidelity visuals
  - Services list is responsive and uses Material Adaptive library
  - UI matches the design in C:/Users/Leonardo/AndroidStudioProjects/RibeiroSoaresAdvogados/input_images/image_0.png
- **Duration:** 8m 29s

### Task_3_Profiles_Contact: Implement the 'Perfis Jurídicos' screen and the 'Canal de Atendimento' with WhatsApp integration and contact forms.
- **Status:** COMPLETED
- **Updates:** Implemented 'Perfis Jurídicos' and 'Canal de Atendimento'. Created luxury attorney profiles and a comprehensive contact form with WhatsApp integration. Established state-driven navigation using Jetpack Navigation 3 with smooth transitions. All UI follows the dark/gold theme and is in Portuguese (Brasil).
- **Acceptance Criteria:**
  - Partner profiles displayed with luxury layout
  - WhatsApp redirection functional
  - Contact form UI implemented
  - Navigation between screens is fluid using Navigation 3
- **Duration:** 3m

### Task_4_Assets_Icon: Generate and configure a high-quality adaptive app icon matching the 'Ribeiro Soares Advogados' brand and perform final UI polish.
- **Status:** COMPLETED
- **Updates:** Generated and configured a high-quality adaptive app icon with a golden scale on a black background. Implemented final UI refinements including smooth fade-in animations for the hero section, staggered card entry for services and profiles, and a luxury shimmer effect on typography. Audited all text for Portuguese (Brasil) consistency and checked color contrast.
- **Acceptance Criteria:**
  - Adaptive icon looks professional on home screen
  - Final visual refinements for 'luxury' aesthetic completed
- **Duration:** 3m 15s

### Task_5_Run_Verify: Build the application, run it on an emulator/device, and perform a final stability and requirement verification.
- **Status:** IN_PROGRESS
- **Updates:** The critic agent reported a crash on the Home Screen: 'java.lang.IllegalStateException: Vertically scrollable component was measured with an infinity maximum height constraints'. This is due to nesting a LazyVerticalGrid inside a scrollable Column in 'PracticeAreasCatalog.kt'. Moving back to fix this issue.
- **Acceptance Criteria:**
  - App builds and installs successfully
  - All existing tests pass
  - No crashes during navigation
  - Critic agent confirms alignment with luxury design and user requirements
  - The implemented UI must match the design provided in C:/Users/Leonardo/AndroidStudioProjects/RibeiroSoaresAdvogados/input_images/image_0.png
- **StartTime:** 2026-07-09 17:32:23 BRT

