import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class YouTubeMp3Downloader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rutaDestino = "C:\\Users\\hanse\\OneDrive\\Escritorio\\Musica\\%(title)s.%(ext)s";

        System.out.println("Los archivos se guardarán en: " + rutaDestino);
        System.out.println("Escribe 'salir' para cerrar el programa.\n");

        while (true) {
            System.out.print("Enlace de video: ");
            String videoUrl = scanner.nextLine().trim();

            // exit
            if (videoUrl.equalsIgnoreCase("salir")) {
                System.out.println("¡Nos vemos!");
                break;
            }

            // not null
            if (videoUrl.isEmpty()) {
                System.out.println("Por favor ingresa un enlace válido.\n");
                continue;
            }

            System.out.println("Procesando...");
            descargarMp3(videoUrl, rutaDestino);
            System.out.println("--------------------------------------------------");
        }

        scanner.close();
    }

    public static void descargarMp3(String url, String rutaDestino) {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "yt-dlp",
                    "-x",
                    "--audio-format", "mp3",
                    "-o", rutaDestino,
                    url
            );

            builder.redirectErrorStream(true);
            Process process = builder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("\nCompletado");
            } else {
                System.out.println("\nerror. Código: " + exitCode);
            }

        } catch (Exception e) {
            System.err.println("Error en la ejecución: " + e.getMessage());
        }
    }
}