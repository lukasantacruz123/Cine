$(document).ready(function () {
    $.ajax({
        url: '/combos/listar', // asegúrate de que este endpoint sea correcto
        method: 'GET',
        success: function (data) {
            const container = $('#combo-container');
            data.forEach(function (combo) {
                const card = `
                    <div class="combo-card">
                        <img src="${pageContext.request.contextPath}/img/${combo.imagen}" alt="${combo.nombre}">
                        <h4>${combo.nombre}</h4>
                        <p>${combo.descripcion}</p>
                        <div class="combo-price">$ ${combo.precio}</div>
                        <button class="add-btn">Agregar</button>
                    </div>
                `;
                container.append(card);
            });
        },
        error: function (err) {
            console.error("Error cargando combos", err);
        }
    });
});
