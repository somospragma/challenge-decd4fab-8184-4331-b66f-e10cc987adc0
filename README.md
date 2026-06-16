# Implementación de pruebas unitarias y de comportamiento en una aplicación de gestión de tareas

Una aplicación de gestión de tareas necesita ser robusta y confiable. Para ello, se requiere implementar pruebas unitarias y de comportamiento que garanticen la correcta funcionalidad de la aplicación. El objetivo es asegurar que cada componente de la aplicación funcione como se espera y que el sistema en su conjunto cumpla con los requisitos del negocio.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | TDD y BDD |
| **Nivel** | junior-l2 |
| **Tipo** | mixed |
| **Tiempo estimado** | 4-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración del dominio y definición de requisitos

**Objetivo:** Entender el dominio de la gestión de tareas y definir los requisitos funcionales y no funcionales.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica las entidades principales del dominio (tareas, usuarios, proyectos).
- Define las reglas de negocio que deben ser cubiertas por las pruebas (por ejemplo, una tarea debe tener un título, una descripción y una fecha de vencimiento).

**Entregable:** Documento que describe el dominio y los requisitos funcionales y no funcionales.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en los diferentes estados que puede tener una tarea (pendiente, en progreso, completada).
- Considera los diferentes roles de usuario y cómo afectan a las tareas.

</details>

### Fase 2: Implementación de pruebas unitarias

**Objetivo:** Crear pruebas unitarias para validar la funcionalidad de los componentes individuales de la aplicación.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Selecciona una funcionalidad clave de la aplicación (por ejemplo, la creación de una tarea) y escribe una prueba unitaria para ella.
- Asegúrate de que la prueba cubra los diferentes casos de éxito y error.

**Entregable:** Pruebas unitarias que validan la funcionalidad de los componentes individuales.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en los diferentes escenarios de éxito y error para cada funcionalidad.
- Considera cómo estructurar tus pruebas para que sean claras y mantenibles.

</details>

### Fase 3: Implementación de pruebas de comportamiento

**Objetivo:** Crear pruebas de comportamiento que validen la interacción entre los componentes de la aplicación.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Selecciona un flujo de usuario clave (por ejemplo, la creación y asignación de una tarea) y escribe una prueba de comportamiento para él.
- Asegúrate de que la prueba cubra los diferentes escenarios de interacción entre los componentes.

**Entregable:** Pruebas de comportamiento que validan la interacción entre los componentes de la aplicación.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en los diferentes flujos de usuario que deben ser cubiertos por las pruebas.
- Considera cómo estructurar tus pruebas de comportamiento para que sean comprensibles y útiles para los stakeholders no técnicos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una prueba unitaria y para qué sirve en el contexto de la gestión de tareas?
- **paraQueSirve**: ¿Para qué sirven las pruebas de comportamiento en la gestión de tareas?
- **comoSeUsa**: ¿Cómo se usan las pruebas unitarias para validar la funcionalidad de los componentes individuales?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar pruebas unitarias y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de pruebas de comportamiento en la gestión de tareas?

## Criterios de Evaluacion

- Definición clara del dominio y los requisitos funcionales y no funcionales.
- Pruebas unitarias que validan la funcionalidad de los componentes individuales.
- Pruebas de comportamiento que validan la interacción entre los componentes de la aplicación.
- Estructura clara y mantenible de las pruebas.
- Cobertura de casos de éxito y error en las pruebas.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
