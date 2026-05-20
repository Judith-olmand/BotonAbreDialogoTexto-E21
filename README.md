# Captura de Datos mediante Ventanas Secundarias (Ejercicio 21)

Este proyecto implementa una arquitectura multiventana donde una interfaz secundaria actúa como un formulario de entrada de datos, enviando la información capturada al flujo de salida principal.

## 🚀 Funcionalidades
* **Diálogo de Entrada Personalizado:** En lugar de usar diálogos predefinidos, se construye un `Stage` propio con campos de texto (`TextField`) y etiquetas.
* **Flujo de Información Inter-Ventana:** El programa captura el contenido del campo de texto en la ventana secundaria y lo procesa (mostrándolo en consola) mediante un evento de acción.
* **Diseño Estructurado con GridPane:** Utiliza una rejilla dentro de la ventana secundaria para alinear perfectamente la etiqueta "Nombre:" con su cuadro de texto correspondiente.
* **Espaciado y Estética:** Implementa `setHgap` y `setVgap` en el `GridPane` para añadir separación entre los elementos, mejorando la legibilidad.

## 🛠️ Estructura técnica
El código demuestra el control de flujos y layouts en escenarios múltiples:
* **`new Stage()`**: Instanciación de una ventana independiente que posee su propio ciclo de vida y configuración de escena.
* **Composición de Layouts**: Utiliza un `BorderPane` como raíz de la ventana secundaria para situar el formulario arriba (`Top`) y el botón de confirmación abajo (`Bottom`).
* **Manejo de Eventos Encapsulado**: Cada ventana gestiona sus propios eventos de forma independiente, separando la lógica de apertura de la lógica de procesamiento de datos.
* **`System.out.println(nombre.getText())`**: Punto de unión donde la entrada del usuario en la GUI se convierte en datos procesables por la aplicación.