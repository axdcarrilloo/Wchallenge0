# Wchallenge0
 Prueba tecnica para Wolox
 
 Se realizo el almacenamiento de datos en el motor de DB PostgreSQL.
 
 Los end-point a consultar son los siguientes:
 1. Consultar usuario por id - GET - http://localhost:9291/Wchallenge/user/getById/2
 2. Consultar todos los usuarios - GET - http://localhost:9291/Wchallenge/user/getAll
 3. Consultar fotos por id usuario - GET - http://localhost:9291/Wchallenge/user/photosByIdUser/2
 4. Consultar todas las fotos - GET - http://localhost:9291/Wchallenge/photo/getAll
 5. Consultar albunes por Id usuario - GET - http://localhost:9291/Wchallenge/user/albumsByIdUser/2
 6. Consultar todos los albunes - GET - http://localhost:9291/Wchallenge/album/getAll
 7. Consultar albunes compartidos - GET - http://localhost:9291/Wchallenge/sharedAlbum/getAll
 8. Registrar album compartido - POST - http://localhost:9291/Wchallenge/sharedAlbum/register
     Body:
        {
          "userId": 2,
          "albumId": 87,
          "reading": true,
          "writing": true
        }
 9. Actualizar permisos del album compartido - PUT - http://localhost:9291/Wchallenge/sharedAlbum/updatePermissions/2
     Body:
      {
         "reading": true,
        "writing": false
      }
 10. Consultar usuarios por permiso en album - POST - http://localhost:9291/Wchallenge/sharedAlbum/sharedAlbumPermissions/1
     Body:
          {
             "reading": true,
             "writing": true
          }
          
 11. Consultar todos los comentarios - GET - http://localhost:9291/Wchallenge/comment/getAll
 12. Consultar comentario por nombre - GET - http://localhost:9291/Wchallenge/comment/commentByName/id labore ex et quam laborum
          
          
 
 
 NOTA: Tener en cuenta que el proyecto carga dos albunes compartidos por defecto, para facilitar sus desarrollos y validaciones
 
