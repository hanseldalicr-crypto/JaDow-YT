# JaDow-YT
Programa Java para descargar y convertir videos publicos de Youtube a archivos .mp3
Este proyecto actúa como un wrapper que automatiza la ejecución de yt-dlp y FFmpeg a través de la clase ProcessBuilder de Java.

## Características
Interfaz interactiva: Solicita continuamente URLs a través de la consola mediante Scanner hasta que el usuario decida salir.
Prevención de saturación: Implementa el parámetro --no-playlist para evitar la descarga accidental de listas de reproducción completas.
Autonombramiento: Los archivos resultantes conservan automáticamente el título original del video de YouTube.
Limpieza automática: Extrae el audio y descarta el archivo de video pesado gracias al parámetro de extracción de yt-dlp.
## Requisitos Previos
Para que este programa funcione correctamente, el sistema operativo debe tener instaladas y configuradas en las variables de entorno (PATH) las siguientes dependencias:

Java Development Kit (JDK): Versión 8 o superior.
yt-dlp: Descargador de línea de comandos.
FFmpeg: Framework multimedia para la conversión a MP3.
Instalación de dependencias en Windows (vía winget)
winget install --id yt-dlp.yt-dlp -e
winget install --id Gyan.FFmpeg -e
## Instalación y Uso
Clona este repositorio:
git clone https://github.com/hanseldalicr-crypto/JaDow-YT.git
Navega al directorio del proyecto:
cd nombre-del-repo
Compila el archivo fuente:
javac YouTubeMp3Downloader.java
Ejecuta el programa:
java YouTubeMp3Downloader
## Configuración
Por defecto, los archivos .mp3 se guardarán en el directorio local definido en el código fuente. Para modificar la ruta de destino, edita la variable rutaDestino dentro del método main:

String rutaDestino = "C:\\Users\\TU_USUARIO\\Music\\%(title)s.%(ext)s";
Asegúrate de mantener %(title)s.%(ext)s al final de la ruta y de usar doble barra invertida (\\) en entornos Windows.

## Descargo de Responsabilidad
Este proyecto tiene fines estrictamente educativos. La descarga de contenido protegido por derechos de autor sin autorización puede violar los Términos de Servicio de YouTube. El autor no se hace responsable del mal uso de esta herramienta.
