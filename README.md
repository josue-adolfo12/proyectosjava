# proyectosjava
# Manual del usuario y técnico - bd negocio Textiles.

El código proporcionado corresponde a una aplicación de Java Swing para la gestión de productos en una base de datos MySQL. A continuación, se proporciona un manual para entender y utilizar este código.

:1. Interfaz de Usuario
La interfaz de usuario consta de varias secciones que permiten realizar diversas operaciones relacionadas con la gestión de productos en una base de datos. Estas secciones incluyen:

1.1 Datos
Código: Un campo de texto para ingresar el código del producto.
Nombre: Un campo de texto para ingresar el nombre del producto.
Precio: Un campo de texto para ingresar el precio unitario del producto.
Cantidad: Un campo de texto para ingresar la cantidad disponible del producto.
Fecha: Un campo de texto para ingresar la fecha de ingreso del producto.

1.2 Operaciones
Agregar: Un botón que permite agregar un nuevo producto a la base de datos.
Modificar: Un botón que permite modificar la información de un producto seleccionado.
Eliminar: Un botón que permite eliminar un producto seleccionado.
Nuevo: Un botón que permite limpiar los campos y empezar una nueva entrada.

1.3 Base de Datos
Tabla: Una tabla que muestra los productos almacenados en la base de datos.
Búsqueda: Un campo de texto que permite buscar productos en la tabla.

1.4 Generar Reporte
Generar reporte: Un botón que permite generar un informe en formato PDF de los productos almacenados el cual se crea en el escritorio llamado Reporte-Textiles y se actualizarán los datos automáticamente al momento de generar otro reporte. 


2. Funcionalidad
El código tiene las siguientes funcionalidades principales:

2.1 Consultar
Al iniciar la aplicación, se carga la información de los productos almacenados en la base de datos y se muestra en la tabla.
2.2 Agregar
Se pueden agregar nuevos productos ingresando la información en los campos de datos y haciendo clic en el botón "Agregar".
Los datos ingresados se validan para asegurarse de que no estén vacíos.
2.3 Modificar
Para modificar un producto existente, seleccione una fila en la tabla y haga clic en el botón "Modificar".
Los datos se actualizarán en la base de datos con la información modificada.
2.4 Eliminar
Para eliminar un producto existente, seleccione una fila en la tabla y haga clic en el botón "Eliminar".
El producto seleccionado se eliminará de la base de datos.
2.5 Búsqueda
Puede buscar productos escribiendo un código en el campo de búsqueda.
La tabla se actualizará automáticamente para mostrar los resultados coincidentes.
2.6 Generar Reporte
Al hacer clic en el botón "Generar reporte", se creará un informe PDF en el escritorio que contiene la información de todos los productos almacenados en la base de datos.

Login 
Guía para utilizar la aplicación de inicio de sesión desarrollada en Java utilizando la biblioteca Swing. Esta aplicación permite a los usuarios ingresar su nombre de usuario y contraseña y, si son correctos, acceder a una interfaz de negocio.

Requisitos del Sistema
Para ejecutar la aplicación de inicio de sesión, asegúrate de que tu sistema cumpla con los siguientes requisitos:

Sistema Operativo: Cualquier sistema operativo compatible con Java.
Java Runtime Environment (JRE): Debe estar instalado en tu sistema para ejecutar aplicaciones Java.

Inicio de Sesión
Después de abrir la aplicación, se mostrará la pantalla de inicio de sesión. Para acceder a la aplicación, sigue estos pasos:

Ingresa tu nombre de usuario en el campo "Usuario".

Ingresa tu contraseña en el campo "Contraseña". La contraseña es sensible a mayúsculas y minúsculas.

Haz clic en el botón "Inicio".

4. Pantalla de Inicio de Sesión
Una vez que ingreses tus credenciales y hagas clic en "Inicio", la aplicación verificará tus datos. Si los datos son correctos, serás redirigido a una interfaz de negocio. De lo contrario, recibirás un mensaje de error indicando que tus credenciales son incorrectas.


3. Conexión a la Base de Datos
El código utiliza la clase ConexionConMySQL.Conexion para establecer una conexión a la base de datos MySQL local. Asegúrese de que la base de datos esté configurada correctamente y de que los detalles de conexión sean precisos en el código.




4. Instrucciones de Uso

Ejecute la aplicación.
Aparecerá el inicio de  sesión en el cual debe llenar los siguientes campos usuario y contraseña si los datos son correctos se ejecutará y le abrirá la tabla de los datos 
Utilice los campos de datos para agregar nuevos productos o seleccione una fila en la tabla para modificar o eliminar productos existentes.
Puede realizar búsquedas escribiendo un código en el campo de búsqueda.
Haga clic en el botón "Generar reporte" para crear un informe PDF de los productos.
Siempre haga clic en el botón "Nuevo" después de realizar una operación para limpiar los campos y preparar una nueva entrada.

5. Consideraciones
Asegúrese de que la base de datos esté configurada correctamente y que los detalles de conexión sean precisos en el código.
Este código utiliza la biblioteca iText para generar informes PDF. Asegúrese de tener la biblioteca iText en su proyecto.
Se recomienda validar y verificar la seguridad de la aplicación antes de utilizarla en un entorno de producción.


