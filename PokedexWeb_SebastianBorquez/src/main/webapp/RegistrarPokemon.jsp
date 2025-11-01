<!DOCTYPE html>
<html>
<head>
    <title>Pokedex - Agregar Pokémon</title>
    <link rel="stylesheet" href="css/estilos.css">
</head>
<body>
    <div class="container">
        <h1>Agregar un nuevo Pokémon</h1>
        <form action="PokemonServlet" method="post">
            <label>Nombre:</label>
            <input type="text" name="nombre" required><br>

            <label>Número:</label>
            <input type="number" name="numero" required><br>

            <label>Tipo:</label>
            <select name="tipo" required>
                <option value="FUEGO">Fuego</option>
            </select><br>

            <label>URL de imagen:</label>
            <input type="text" name="imagen" placeholder="img/pokemon.png" required><br>

            <button type="submit">Agregar Pokémon</button>
        </form>

        <a href="PokemonServlet">Ver lista de Pokémon registrados</a>
    </div>
</body>
</html>
