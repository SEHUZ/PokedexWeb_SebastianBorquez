<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Pokedex - Registrar Pokemon</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="estilos/registrar.css">
    </head>
    <body>
        <div class="container">
            <h1>POKEDEX</h1>

            <c:if test="${not empty mensaje}">
                <div class="alert alert-danger"> ${mensaje}
                </div>
            </c:if>

            <form action="PokemonServlet" method="post">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" id="nombre" name="nombre" value="${param.nombre}" required>
                </div>

                <div class="form-group">
                    <label for="numero">Numero:</label>
                    <input type="number" id="numero" name="numero" value="${param.numero}" required>
                </div>

                <div class="form-group">
                    <label for="tipo">Tipo:</label>
                    <select id="tipo" name="tipo" required>
                        <c:forEach var="tipoEnum" items="${tipos}">
                            <option value="${tipoEnum}" ${tipoEnum == param.tipo ? 'selected' : ''}>
                                ${tipoEnum}
                            </option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group">
                    <label for="urlImagen">URL de imagen:</label>
                    <input type="text" id="urlImagen" name="urlImagen" placeholder="img/pokemon.png" value="${param.urlImagen}" required>
                </div>

                <button type="submit">Registrar Pokemon</button>
            </form>

            <br>
            <a href="ListaPokemonServlet">Ver lista de Pokemon registrados</a>
        </div>
    </body>
</html>
