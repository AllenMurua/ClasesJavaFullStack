while(true){
    var opcion = prompt("¿Que deseas hacer?\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");

    switch (opcion) {
        case "1":
            var num1 = prompt("Ingresa el primer numero");
            var num2 = prompt("Ingresa el segundo numero");
            alert("La suma es: " + (parseInt(num1) + parseInt(num2)));
            break;
        case "2":
            var num1 = prompt("Ingresa el primer numero");
            var num2 = prompt("Ingresa el segundo numero");
            alert("La resta es: " + (parseInt(num1) - parseInt(num2)));
            break;
        case "3":
            var num1 = prompt("Ingresa el primer numero");
            var num2 = prompt("Ingresa el segundo numero");
            alert("La multiplicación es: " + (parseInt(num1) * parseInt(num2)));
            break;
        case "4":
            var num1 = prompt("Ingresa el primer numero");
            var num2 = prompt("Ingresa el segundo numero");   
            alert("La división es: " + (parseInt(num1) / parseInt(num2)));
            break;
        case "5":
            break;
    }
}