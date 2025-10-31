<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/estilos.css">
        <title>Registrar Pokemon</title>
    </head>
    <body>
        <div class="container">
            <h1>Mi Pokédex</h1>
            <form action="PokemonServlet" method="POST" class="pokedex-form">
                <h2>Registrar Nuevo Pokemon</h2>
                
                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre" required>
                
                <label for="numero">Número:</label>
                <input type="number" id="numero" name="numero" required>
                
                <label for="tipo">Tipo:</label>
                <input type="text" id="tipo" name="tipo" required>
                
                <label for="urlImagen">URL de la Imagen:</label>
                <input type="url" id="urlImagen" name="urlImagen" required>
                
                <button type="submit">Agregar Pokemon</button>
            </form>
        </div>
    </body>
</html>
