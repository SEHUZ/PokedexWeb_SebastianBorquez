<!DOCTYPE html>
<html>
<head>
    <title>Pokédex - Lista</title>
    <link rel="stylesheet" href="css/estilos.css">
</head>
<body>
    <div class="container">
        <h1>Pokémones Registrados</h1>
        <table>
            <tr>
                <th>Número</th>
                <th>Nombre</th>
                <th>Tipo</th>
                <th>Imagen</th>
            </tr>
            <c:forEach var="poke" items="${pokemones}">
                <tr>
                    <td>${poke.numero}</td>
                    <td>${poke.nombre}</td>
                    <td>${poke.tipo}</td>
                    <td><img src="${poke.imagen}" alt="${poke.nombre}" width="80"></td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <a href="index.jsp">Agregar otro Pokémon</a>
    </div>
</body>
</html>
