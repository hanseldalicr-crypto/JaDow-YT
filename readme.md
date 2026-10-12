# Java YouTube Audio Extractor

Una herramienta de interfaz de línea de comandos (CLI) desarrollada en Java para descargar y convertir videos de YouTube a formato MP3 de manera interactiva. Este proyecto actúa como un *wrapper* (envoltorio) que automatiza la ejecución de `yt-dlp` y `FFmpeg` a través de la clase `ProcessBuilder` de Java.

## ✨ Características

*   **Interfaz interactiva:** Solicita continuamente URLs a través de la consola mediante `Scanner` hasta que el usuario decida salir.
*   **Prevención de saturación:** Implementa el parámetro `--no-playlist` para evitar la descarga accidental de listas de reproducción completas.
*   **Autonombramiento:** Los archivos resultantes conservan automáticamente el título original del video de YouTube.
*   **Limpieza automática:** Extrae el audio y descarta el archivo de video pesado gracias al parámetro de extracción de `yt-dlp`.

## 🛠️ Requisitos Previos

Para que este programa funcione correctamente, el sistema operativo debe tener instaladas y configuradas en las variables de entorno (`PATH`) las siguientes dependencias:

1.  **[Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/):** Versión 8 o superior.
2.  **[yt-dlp](https://github.com/yt-dlp/yt-dlp):** Descargador de línea de comandos.
3.  **[FFmpeg](https://ffmpeg.org/):** Framework multimedia para la conversión a MP3.

### Instalación de dependencias en Windows (vía winget)
```cmd
winget install --id yt-dlp.yt-dlp -e
winget install --id Gyan.FFmpeg -e
```

## 🚀 Instalación y Uso

1.  Clona este repositorio:
    ```bash
    git clone https://github.com/tu-usuario/nombre-del-repo.git
    ```
2.  Navega al directorio del proyecto:
    ```bash
    cd nombre-del-repo
    ```
3.  Compila el archivo fuente:
    ```bash
    javac YouTubeMp3Downloader.java
    ```
4.  Ejecuta el programa:
    ```bash
    java YouTubeMp3Downloader
    ```

## ⚙️ Configuración

Por defecto, los archivos `.mp3` se guardarán en el directorio local definido en el código fuente. Para modificar la ruta de destino, edita la variable `rutaDestino` dentro del método `main`:

```java
String rutaDestino = "C:\\Users\\TU_USUARIO\\Music\\%(title)s.%(ext)s";
```
*Asegúrate de mantener `%(title)s.%(ext)s` al final de la ruta y de usar doble barra invertida (`\\`) en entornos Windows.*

## ⚠️ Descargo de Responsabilidad

Este proyecto tiene fines estrictamente educativos. La descarga de contenido protegido por derechos de autor sin autorización puede violar los Términos de Servicio de YouTube. El autor no se hace responsable del mal uso de esta herramienta.