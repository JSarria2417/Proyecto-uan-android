Documentación de proyecto

John Alexander Casallas Bello  
Juan Sebastian Sarria Rincon  
James Alexander Sarmiento Prieto

Universidad Antonio Nariño  
Construcción de aplicaciones móviles  
Wilson Javier Forero

Fecha: 21/05/2025

[**Idea del proyecto:	3**](#idea-del-proyecto:)

[**Cómo solucionarlo:	4**](#cómo-solucionarlo:)

[**Tecnologías usadas:	5**](#tecnologías-usadas:)

[**Manual de usuario:	5**](#manual-de-usuario:)

# 

# 

# 

# 

# Idea del proyecto: {#idea-del-proyecto:}

Nuestra idea de proyecto es crear una app para afinar guitarras llamada afiguitar, la aplicación utilizará el micrófono del dispositivo para detectar el sonido de las cuerdas de la guitarra y según la frecuencia de sonido analizar si están en la afinación ideal (EADGBE para afinación estándar) luego claramente mostrar si la cuerda está demasiado baja o demasiado alta, también incluir otros tipos de frecuencia de sonido para poder afinar la guitarra en otros tipos de afinación.

# 

# 

# 

# 

# 

# 

# Cómo solucionarlo: {#cómo-solucionarlo:}

Para solucionarlo, se desarrolló la app con el objetivo de mejorar la experiencia de los usuarios los cuales quieren aprender a tocar guitarra pero no saben cómo afinar su guitarra, la app cuenta con las siguientes funcionalidades que facilitan el proceso:

1. Uso del micrófono: Captura el sonido de la guitarra en tiempo real.  
2. Análisis de frecuencia: Detecta la nota tocada y la compara con la afinación correcta.  
3. Indicador visual de afinación: Muestra si la cuerda está afinada, demasiado grave o demasiado aguda.  
4. Afinación estándar y alternativas: Soporte para afinaciones como Drop D, DADGAD, entre otras.

La app esta app está inspirada en:

* GuitarTuna  
* Fender Tune

En la app podrás afinar varios tipos de guitarras y revisar el historial de afinaciones de las mismas. 

# 

# 

# Tecnologías usadas: {#tecnologías-usadas:}

Para el desarrollo de la aplicación se usaron diferentes tecnologías que permitieron la creación del proyecto de manera eficiente, Las tecnologías usadas fueron el motor de AndroidStudio que proporciona un conjunto de herramientas para programar y probar el funcionamiento de la app, cuenta con interfaces gráficas fáciles de entender lo cual mejoró la eficiencia de la creación del código, así como la integración de funcionalidades como el acceso al micrófono del dispositivo para capturar el sonido de las cuerdas de la guitarra.  
El repositorio creado en github fue vital para como sistema de control de versiones, esto permitió mantener un historial ordenado de los cambios del código y facilitar el trabajo en equipo y asegurar un respaldo del avance del desarrollo.

# Manual de usuario: {#manual-de-usuario:}

Para que el usuario pueda usar la aplicación debe cumplir con los siguientes requisitos:

* Un dispositivo móvil con una versión de Android superior a Android 7\.  
* Tener una guitarra lista para afinar.  
* El dispositivo móvil debe tener su sistema de audio en óptimas condiciones.


Dentro de la aplicación el usuario debe seleccionar que tipo de afinación quiere realizar y una vez seleccionado el tipo, la aplicación le mostrará una guitarra virtual con sus cuerdas numeradas con una letra, el usuario deberá darle un click a la cuerda que desea afinar y la aplicación reproducirá un sonido de cómo debe sonar la cuerda seleccionada y si es necesario bajar o subir la afinación de la cuerda.