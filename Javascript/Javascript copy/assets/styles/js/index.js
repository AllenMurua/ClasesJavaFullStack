
var message = document.getElementById("message");

message.textContent = "Comparación de Números";
document.getElementById('numberForm').addEventListener('submit', function(event) {
    event.preventDefault();

    var numero1 = parseFloat(document.getElementById('numero1').value);
    var numero2 = parseFloat(document.getElementById('numero2').value);
    
    var resultElement = document.getElementById('result');

    if (isNaN(numero1) || isNaN(numero2)) {
        resultElement.textContent = "Por favor, ingrese números válidos.";
    } else if (numero1 > numero2) {
        resultElement.textContent = `El número ${numero1} es mayor que ${numero2}`;
    } else if (numero1 < numero2) {
        resultElement.textContent = `El número ${numero2} es mayor que ${numero1}`;
    } else {
        resultElement.textContent = "Ambos números son iguales";
    }
});

const clientes=[
    {
        id: 1,  
        nombre: "Eva",
        apellidos: "Perez",
        email: "eva@mentel",
        password: "eva123",
        saldo: 2000000
    },
    {
        id: 2,
        nombre: "Juan",
        apellidos: "Lopez", 
        email: "juan@mentel",
        password: "juan123",
        saldo: 1000000
    },
    {
        id: 3,
        nombre: "Pedro",
        apellidos: "Gonzalez",
        email: "pedro@mentel",
        password: "pedro123",
        saldo: 3000000
    }
]