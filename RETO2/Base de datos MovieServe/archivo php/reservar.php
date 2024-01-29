<?php
// Verificar si se reciben los datos del formulario
if ($_SERVER["REQUEST_METHOD"] == "GET") {
    // Establecer conexión a la base de datos (ajusta los parámetros según tu configuración)
    $servername = "localhost";
    $username = "empleadomovieserve";
    $password = "movieserveAWS67210";
    $dbname = "movieserve";

    $conn = new mysqli($servername, $username, $password, $dbname);

    // Verificar la conexión
    if ($conn->connect_error) {
        die("La conexión a la base de datos falló: " . $conn->connect_error);
    }

    // Obtener valores del formulario
    $telefono = $_GET["Telefono"];
    $nombre = $_GET["Nombre"];
    $apellido = $_GET["Apellido"];
    $dni = $_GET["DNI"];
    $gmail = $_GET["Gmail"];
    $peliculaAVer = $_GET["peliculaAVer"];
    $cantidadAsientos = $_GET["cantidadAsientos"];

    // Asignar automáticamente un id_Pelicula según la opción seleccionada
    $id_Pelicula = 0; // Valor predeterminado si no se selecciona ninguna opción

    switch ($peliculaAVer) {
        case "El regreso de Jaava":
            $id_Pelicula = 1;
            break;
        case "La BakQ perdida":
            $id_Pelicula = 2;
            break;
        case "Las aventuras de Inti: El duende de Garbera":
            $id_Pelicula = 3;
            break;
        case "Tamayo: El escape":
            $id_Pelicula = 4;
            break;
        case "Programación eterna":
            $id_Pelicula = 5;
            break;
        case "El gasto":
            $id_Pelicula = 6;
            break;
        case "Asesinato en la máquina virtual":
            $id_Pelicula = 7;
            break;
        case "El Break":
            $id_Pelicula = 8;
            break;
        case "La ley prohibida":
            $id_Pelicula = 9;
            break;
        case "El arte de la doma clásica":
            $id_Pelicula = 10;
            break;
        case "El Wuekii":
            $id_Pelicula = 11;
            break;
        case "El trén de vuelta":
            $id_Pelicula = 12;
            break;

        default:
            // Si no se encuentra la opción, puedes asignar un valor predeterminado o mostrar un error
            $id_Pelicula = 0;
            break;
    }

    // Generar id_Sala aleatorio entre 1 y 8
    $id_Sala = rand(1, 8);

    // Preparar la consulta SQL para la inserción
    $sql = "INSERT INTO clientes (Telefono, Nombre, Apellido, DNI, Gmail, PeliculaAVer, CantidadAsientos, id_Pelicula, id_Sala) 
            VALUES ('$telefono', '$nombre', '$apellido', '$dni', '$gmail', '$peliculaAVer', '$cantidadAsientos', '$id_Pelicula', '$id_Sala')";

    // Ejecutar la consulta
    if ($conn->query($sql) === TRUE) {
        echo "Registro insertado correctamente";
    } else {
        echo "Error al insertar el registro: " . $conn->error;
    }

    // Cerrar la conexión a la base de datos
    $conn->close();
}
?>