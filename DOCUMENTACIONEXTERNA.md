#  `Alumnno`
La clase `Alumno` representa la estructura de un estudiante, con información sobre su nombre, apellido, código de alumno, bimestre, calificaciones en varias materias y otros detalles. Esta clase también implementa la interfaz `Serializable` para permitir la serialización de objetos de tipo `Alumno`.

# Atributos
+ Nombre: El nombre del alumno.
+ Apellido: El apellido del alumno.
+ Codigoalumno: Un número entero que representa el código del alumno.
+ Bimestre: Un String que representa el bimestre académico del alumno.
+ Matematicas: Calificación en la asignatura de matemáticas.
+ Comunicacion: Calificación en la asignatura de comunicación.
+ Sociales: Calificación en la asignatura de ciencias sociales.
+ Naturales: Calificación en la asignatura de ciencias naturales.
+ Computacion: Calificación en la asignatura de computación.
+ Promedio: Promedio de las cinco asignaturas.
# Métodos
+ getNombre(): Obtiene el nombre del alumno.
+ setNombre(String nombre): Establece el nombre del alumno.
+ getApellido(): Obtiene el apellido del alumno.
+ setApellido(String apellido): Establece el apellido del alumno.
+ getCodigoalumno(): Obtiene el código del alumno.
+ setCodigoalumno(int codigoalumno): Establece el código del alumno.
+ getBimestre(): Obtiene el bimestre del alumno
+  setBimestre(String bimestre): Establece el bimestre del alumno.
+  getMatematicas(): Obtiene la calificación en matemáticas.
+  setMatematicas(double matematicas): Establece la calificación en matemáticas.
+  getComunicacion(): Obtiene la calificación en comunicación.
+  setComunicacion(double comunicacion): Establece la calificación en comunicación.
+  getSociales(): Obtiene la calificación en ciencias sociales.
+  setSociales(double sociales): Establece la calificación en ciencias sociales.
+  getNaturales(): Obtiene la calificación en ciencias naturales.
+  setNaturales(double naturales): Establece la calificación en ciencias naturales.
+  getComputacion(): Obtiene la calificación en computación.
+  setComputacion(double computacion): Establece la calificación en computación.
+  getPromedio(): Calcula y devuelve el promedio de las asignaturas.
+  getEstadoaprobacion(): Devuelve "Aprobado" si el promedio es mayor a 59, y "Desaprobado" en caso contrario.
+ setPromedio(double readDouble): Calcula y establece el promedio de las asignaturas..
# Constantes
+ LONGITUD_NOMBRE: Longitud máxima del nombre en bytes (30).
+ LONGITUD_APELLIDO: Longitud máxima del apellido en bytes (30).
+ LONGITUD_BIMESTRE: Longitud máxima del bimestre en bytes (10).
+ TAMANIO: Tamaño total en bytes de un registro de Alumno.

#  `Archivo`

La clase `Archivo` proporciona métodos para manejar operaciones básicas de lectura y escritura en un archivo de registros de alumnos utilizando `RandomAccessFile`. Los registros se almacenan en un formato binario que permite el acceso directo a posiciones específicas del archivo.

## Componentes Principales

- **Atributos:**
  - `file`: Instancia de `RandomAccessFile` para manejar el archivo.

## Métodos Principales

- **`abrirArchivo(String nombreArchivo)`**
  - Abre el archivo especificado en modo lectura y escritura (`rw`).

- **`cerrarArchivo()`**
  - Cierra el archivo si está abierto.

- **`obtenerRegistro(int posicion)`**
  - Lee un registro de alumno desde una posición específica.
  - Crea un objeto `Alumno` y llena sus atributos leyendo datos del archivo.

- **`nuevoRegistro(int posicion, Alumno alumno)`**
  - Escribe un nuevo registro de alumno en la posición especificada.
  - Utiliza el objeto `Alumno` para escribir sus atributos en el archivo.

- **`eliminarRegistro(int posicion)`**
  - Elimina un registro en la posición dada.
  - Escribe un registro en blanco para sobrescribir el registro existente.

- **`escribirCadena(String cadena, int longitud)`**
  - Escribe una cadena en el archivo, rellenando con espacios si es necesario para alcanzar la longitud especificada.

- **`leerCadena(int longitud)`**
  - Lee una cadena de longitud específica desde el archivo.
  - Convierte los caracteres leídos en una cadena y elimina espacios en blanco.

- **`buscarPosicionPorCodigo(int codigo)`**
  - Busca la posición de un registro en el archivo basado en el código del alumno.
  - Recorre todos los registros para encontrar el que coincida con el código dado.

- **`obtenerTodosLosRegistros()`**
  - Obtiene todos los registros de alumnos del archivo.
  - Lee registros desde el inicio del archivo hasta el final y los agrega a una lista.

## Notas Adicionales

- **Formato de Registro:** Se asume que cada registro de `Alumno` tiene un tamaño fijo (`Alumno.getTAMANIO()`). Los registros se leen y escriben en posiciones específicas basadas en este tamaño.
- **Manejo de Excepciones:** El código maneja excepciones de entrada y salida (`IOException`) y valida posiciones con `IllegalArgumentException`.
- **Método `buscarPosicionPorCodigo`:** Este método recorre todos los registros para encontrar la posición del código, lo que puede ser optimizado si el archivo es grande.

Asegúrate de que la clase `Alumno` esté correctamente implementada para que los métodos de la clase `Archivo` funcionen como se espera.



#  `InterfazLogin`

## Descripción

La clase `InterfazLogin` extiende `JFrame` y proporciona una interfaz gráfica de usuario (GUI) para el inicio de sesión en un sistema de calificaciones.

## Componentes Principales

- **`JTextField jTextUsuario`**: Campo para ingresar el nombre de usuario.
- **`JPasswordField jTextContrasena`**: Campo para ingresar la contraseña.
- **`JButton jiniciosesion`**: Botón para iniciar sesión.
- **`JButton jSalir`**: Botón para salir de la aplicación.
- **`JLabel jContraseña`** y **`JLabel jUsuario1`**: Etiquetas para los campos de usuario y contraseña.
- **`JPanel jPanel1`**: Panel principal que contiene los componentes de la interfaz.

## Métodos Clave

- **`initComponents()`**: Configura y organiza los componentes de la interfaz gráfica.
- **`jTextUsuarioActionPerformed(ActionEvent evt)`**: Método vacío para manejar eventos de acción en el campo de texto de usuario.
- **`jiniciosesionActionPerformed(ActionEvent evt)`**: Valida el nombre de usuario y la contraseña. Si son correctos, muestra la interfaz de control de calificaciones.
- **`jSalirActionPerformed(ActionEvent evt)`**: Sale de la aplicación.

## Funcionalidad de Inicio de Sesión

- La contraseña y el usuario se establecen como "admin".
- Si el usuario y la contraseña ingresados coinciden, se abre una nueva ventana (`JFrame`) con la interfaz de control de calificaciones (`InterfazaccionAlumno`).
- Si las credenciales son incorrectas, se muestra un mensaje de error.

## Ejecución

- **`main(String[] args)`**: Configura el aspecto de la interfaz y muestra la ventana de inicio de sesión.
#  `InterfazRegistroCalificaciones`

## Descripción

La clase `InterfazRegistroCalificaciones` extiende `JFrame` y proporciona una interfaz gráfica para registrar calificaciones de estudiantes.

## Componentes Principales

- **Campos de Texto (`JTextField`)**:
  - `jTextnombre`: Campo para el nombre del estudiante.
  - `jTextapellido`: Campo para el apellido del estudiante.
  - `jTextcodigo`: Campo para el código del estudiante.
  - `jTextmatematicas`: Campo para la nota de matemáticas.
  - `jTextcomunicacion`: Campo para la nota de comunicación.
  - `jTextsociales`: Campo para la nota de ciencias sociales.
  - `jTextnaturales`: Campo para la nota de ciencias naturales.
  - `jTextcomputacion`: Campo para la nota de computación.

- **Botones (`JButton`)**:
  - `jButtonguardar`: Guarda las calificaciones ingresadas.
  - `jButtonlimpiar`: Limpia los campos de texto.
  - `jButtonregresar`: Regresa a la interfaz de acciones del alumno.
  - `jButtonsalir`: Cierra la aplicación.

- **ComboBox (`JComboBox`)**:
  - `jCombobimestre`: Permite seleccionar el bimestre.

- **Etiquetas (`JLabel`)**:
  - Para identificar los campos de texto y el combo box.

## Métodos Clave

- **`initComponents()`**: Inicializa y organiza los componentes de la interfaz gráfica.

- **`limpiarespacios()`**: Limpia todos los campos de texto en la interfaz.

- **`jButtonlimpiarActionPerformed(ActionEvent evt)`**: Llama a `limpiarespacios()` para limpiar los campos de texto.

- **`jButtonguardarActionPerformed(ActionEvent evt)`**:
  - Obtiene los valores de los campos de texto.
  - Convierte los valores de texto a `double` y valida que estén en el rango de 0 a 100.
  - Crea un objeto `Alumno` con los datos ingresados.
  - Usa la clase `Archivo` para guardar o actualizar el registro en un archivo.

- **`jButtonregresarActionPerformed(ActionEvent evt)`**: Abre la interfaz de acción del alumno (`InterfazaccionAlumno`) y cierra la ventana actual.

- **`jButtonsalirActionPerformed(ActionEvent evt)`**: Cierra la aplicación.

- **`jCombobimestreActionPerformed(ActionEvent evt)`**: Método vacío para manejar eventos de acción en el combo box del bimestre.

- **`main(String args[])`**: Configura y muestra la ventana de la interfaz de registro de calificaciones.

# `InterfazaccionAlumno`

El código define una clase `InterfazaccionAlumno` que extiende `javax.swing.JPanel` y proporciona una interfaz gráfica para la gestión de registros de alumnos en un sistema de calificaciones. Utiliza Swing para crear la interfaz de usuario.

## Componentes Principales

- **Botones:**
  - `jRegistrar`: Botón para registrar un nuevo alumno.
  - `jEliminar`: Botón para eliminar un registro de alumno.
  - `jMostrar`: Botón para mostrar todos los registros de alumnos.
  - `jButtonsalir`: Botón para salir de la aplicación.

- **Campo de Texto:**
  - `jTextCodigo`: Campo para ingresar el código del alumno para eliminar o mostrar detalles.

- **Tabla:**
  - `jTable1`: Tabla para mostrar los registros de alumnos.

- **Paneles y Contenedores:**
  - `jScrollPane1`: Contiene la tabla `jTable1` para permitir el desplazamiento.
  - `jLayeredPane1`: Contenedor adicional para la interfaz gráfica.
  - `jDialog1`: Diálogo para mostrar detalles del alumno.

- **Etiquetas y Diálogos:**
  - `jCodigo`: Etiqueta para el campo de texto de código.
  - `jLabel2`: Etiqueta adicional en el diseño.

## Métodos Principales

- **`jMostrarActionPerformed`**
  - Abre el archivo de registros de alumnos (`alumnos.txt`).
  - Carga todos los registros en una lista.
  - Llena la tabla `jTable1` con los datos de los alumnos.
  - Agrega un `MouseListener` para manejar los clics en la tabla y mostrar detalles del alumno seleccionado.

- **`mostrarDetallesAlumno`**
  - Abre el archivo de registros de alumnos.
  - Busca el registro del alumno basado en el código proporcionado.
  - Muestra los detalles del alumno en un diálogo con una tabla que presenta las calificaciones por bimestre.

- **`jRegistrarActionPerformed`**
  - Abre una nueva ventana (`InterfazRegistroCalificaciones`) para registrar un nuevo alumno.

- **`jEliminarActionPerformed`**
  - Lee el código del alumno desde el campo de texto.
  - Busca y elimina el registro del alumno en el archivo.
  - Muestra un mensaje de éxito o error basado en el resultado de la operación.

- **`jTextCodigoActionPerformed`**
  - Maneja el evento cuando se realiza una acción en el campo de texto (actualmente no tiene implementación).

- **`jButtonsalirActionPerformed`**
  - Cierra la aplicación.


      


