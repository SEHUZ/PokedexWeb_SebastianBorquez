<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Pokedex - Lista</title>
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>
        <div class="container">
            <h1>Pokemones Registrados</h1>

            <c:choose>
                <c:when test="${not empty pokemones}">
                    <table>
                        <thead>
                            <tr>
                                <th>Número</th>
                                <th>Nombre</th>
                                <th>Tipo</th>
                                <th>Imagen</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="poke" items="${pokemones}">
                                <tr>
                                    <td>
                                        ${poke.numero}
                                    </td>
                                    <td>
                                        ${poke.nombre}
                                    </td>
                                    <td>
                                        ${poke.tipo}
                                    </td>
                                    <td>
                                        <img src="${poke.imagen}" alt="${poke.nombre}" width="80">
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </c:when>
                <c:otherwise>
                    <p>No hay Pokémon registrados todavía.</p>
                </c:otherwise>
            </c:choose>

            <br>
            <a href="PokemonServlet">Agregar nuevo Pokémon</a>
        </div>
    </body>
</html>
