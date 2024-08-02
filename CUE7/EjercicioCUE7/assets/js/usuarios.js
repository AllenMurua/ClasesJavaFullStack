function usuarios(nombre, password, rol) {
    this.nombre = nombre;
    this.password = password;
    this.rol = rol;
}

var usuario1 = ["Adrian", "1234", "admin" ];
var usuario2 = ["Carlos", "1234", "user" ];
var usuario3 = ["Maria", "1234", "user" ];
function crearUsuario() {
    var nombre = document.getElementById("nombre").value;
    var password = document.getElementById("password").value;
    var rol = document.getElementById("rol").value;
    var usuario = new usuarios (nombre, password, rol);
    console.log (usuario);
}   

