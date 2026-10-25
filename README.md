# Kidwear · Del prototipo al código (I)

Proyecto enfocado en la traslación de una pantalla de inicio de sesión diseñada en Figma a una interfaz nativa de Android Studio.

---

## Enlaces y Entregables

* **Prototipo en Figma:** [Ver diseño en Figma (Dev Mode)](https://www.figma.com/design/Vng2lm65JGTlWUGvX2h2jm/T1-%C2%B7-Kidwear-%C2%B7-David-Alonso-Aguilar?node-id=22-259&m=dev)
* **Memoria Técnica Completa:** [`docs/alonso_david_figma_android.pdf`](docs/alonso_david_figma_android.pdf)

---

## Especificaciones Técnicas

* **Lenguaje:** Java
* **Plantilla base:** Empty Views Activity
* **SDK Mínimo:** API 28 (Android 9.0 Pie)
* **Enlace de vistas:** ViewBinding activado (`buildFeatures { viewBinding = true }`)
* **Sistema de diseño:** Material Design 3 con unidades `dp` para medidas estructurales y `sp` para escalas tipográficas
* **Optimización de recursos:**
    * Iconos vectoriales escalables en XML (`VectorDrawable`) en `res/drawable/`
    * Ilustración principal comprimida en formato WebP dentro de `res/drawable-xxhdpi/`
    * Centralización estricta de tokens de diseño en `colors.xml`, `strings.xml`, `styles.xml` y fuentes locales en `res/font/`

---

## Estructura del Repositorio

```text
Kidwear/
├── app/                  # Código fuente Java y recursos del proyecto nativo
├── docs/                 # Memoria técnica oficial en formato PDF
│   └── alonso_david_figma_android.pdf
├── gradle/               # Wrapper y configuración de Gradle
├── .gitignore            # Exclusión de carpetas temporales (build, .gradle, .idea)
└── README.md             # Documentación principal del repositorio
```

---

## Autor

* **Alumno:** David Alonso Aguilar
* **Centro:** MEDAC
* **Módulo:** Desarrollo de Interfaces