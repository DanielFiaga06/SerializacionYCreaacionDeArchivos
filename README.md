# SerializacionYCreacionDeArchivos

El programa crea tres tipos de objetos: una persona, un estudiante y un profesor, todos ellos implementando una interfaz llamada Deberes. Cada objeto guarda su información en un archivo de texto llamado personas.txt.

Paso 1: Se crea la interfaz Deberes
Define un contrato que toda clase que implemente esta interfaz debe cumplir, es decir: debe tener un método llamado guardarEnArchivoTxt.

Paso 2: Se crea la clase persona.java implementando Deberes}
Guarda datos personales como nombre, edad y dirección.
Implementa Serializable para que pueda guardarse en archivos binarios (si se desea).
Implementa Deberes y por eso tiene que escribir su información en un .txt.

Paso 3: Se crea la clase Estudiante
Hereda de Persona.
Añade un nuevo atributo carrera.
Reutiliza todo lo de la clase Persona, y también puede escribir en el .txt.

Paso 4: Se crea la clase Profesor
Similar al Estudiante, pero con un atributo materia.
También hereda guardarEnArchivoTxt.

Paso 5: Se crea la clase Deberes con un método main()
Crea una persona, un estudiante y un profesor.
Guarda sus datos en el archivo personas.txt.
Usa polimorfismo gracias a la interfaz Deberes.

¿Qué se guarda en personas.txt?

Persona{nombre='Laura Gómez', edad=28, direccion='Calle 1'}
Estudiante{nombre='Carlos Ruiz', edad=20, direccion='Carrera 9', carrera='Ingeniería'}
Profesor{nombre='Ana Torres', edad=40, direccion='Avenida 45', materia='Matemáticas'}

Este archivo .txt se guarda en mi onedrive, en la carpeta de documentos y en una carpeta llamada deberes el cual es el nombre del proyecto


![run exitoso](https://github.com/user-attachments/assets/6b8c2b44-b433-48f3-b685-98c348851e66)


![onedrive](https://github.com/user-attachments/assets/eaf57cf8-6954-41d1-9028-a99343f6c91b)

![documentos](https://github.com/user-attachments/assets/5db2e2fb-4464-4e79-8a77-2c1d3811beee)

![carpeta deberes](https://github.com/user-attachments/assets/494fd1c1-9cfc-48a6-970f-fa3cba4d024f)

![txt](https://github.com/user-attachments/assets/e2f0cedd-ec1d-450d-8afe-31479a011874)






