# **Conversor de Monedas** - Proyecto en Java

### Creado por: Jaime Rossi Serrano

---

## **Descripción del Proyecto**

Este proyecto es un conversor de monedas desarrollado en Java que consume datos en tiempo real de una API de tasas de cambio. Permite a los usuarios convertir valores entre monedas de interés, aplicando tasas actuales y mostrando los resultados de manera interactiva en la consola.

---

## **Características Principales**

- **Consumo de API**: Conexión a una API de tasas de cambio mediante `HttpClient`, `HttpRequest` y `HttpResponse`.
- **Análisis JSON**: Uso de la biblioteca Gson para parsear y manejar datos JSON obtenidos de la API.
- **Filtro de Monedas**: Posibilidad de seleccionar monedas específicas para la conversión.
- **Conversión de Monedas**: Calcula valores convertidos entre monedas con base en tasas de cambio actuales.
- **Interacción con el Usuario**: Implementación de un menú en consola que permite al usuario seleccionar opciones y realizar conversiones.
- **Pruebas con Postman**: Posibilidad de probar el endpoint de la API directamente en Postman para validar la funcionalidad.

---

## **Requisitos Previos**

1. **JDK 17** preferiblemente para no tener problemas.
2. Una herramienta IDE como **IntelliJ IDEA**, **Eclipse**, o cualquier otro entorno compatible con Java.
3. Conexión a Internet para consumir la API de tasas de cambio.
4. **Postman** (opcional) para realizar pruebas directas con la API.
5. Gson 2.11.0 o similares  jar necesario para que funcione el programa de todas formas dejo el usado  en esta aplicacion en el Git


---

## **Configuración del Proyecto**

### **1. Clave de API**

Este proyecto requiere una clave de API para acceder a los datos de la API de tasas de cambio. Sigue estos pasos para obtenerla:

1. Regístrate en la API de tasas de cambio que prefieras (por ejemplo, Exchange Rates API).
2. Genera tu clave de API desde el panel de usuario.
3. Copia la clave y agrégala en tu código fuente donde se realiza la solicitud HTTP.

Ejemplo:

```java
String apiKey = "TU_CLAVE_DE_API";
```

### **2. Agregar Dependencias**

Este proyecto utiliza la biblioteca Gson para manejar datos JSON. Agrega la dependencia al archivo `pom.xml` si usas Maven:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10</version>
</dependency>
```

Si utilizas otro sistema de compilación, sigue los pasos equivalentes para agregar Gson.

### **3. Estructura del Proyecto**

El proyecto está estructurado en las siguientes clases principales:

- **ConversorMonedas.java**: Contiene el método principal y la lógica del menú de interacción.
- **ApiClient.java**: Gestiona la conexión con la API de tasas de cambio utilizando `HttpClient`.
- **Moneda.java**: Clase que representa una moneda y su tasa de cambio.
- **JsonParser.java**: Clase para analizar y filtrar los datos JSON.

---

## **Ejecución del Proyecto**

1. Abre el proyecto en tu IDE favorito.
2. Asegúrate de que las dependencias estén instaladas correctamente.
3. Ejecuta la clase principal `ConversorMonedas.java`.
4. Sigue las instrucciones del menú interactivo para:
   - Seleccionar monedas de origen y destino.
   - Ingresar el valor a convertir.
   - Ver el resultado de la conversión.

---

## **Pruebas con Postman**

Aunque el programa interactúa directamente con la API y muestra los resultados en consola, también puedes realizar pruebas de la API en Postman:

1. Abre Postman y crea una nueva solicitud.
2. Configura el método HTTP como **GET**.
3. Ingresa la URL del endpoint, incluyendo tu clave de API:
   ```
   https://v6.exchangerate-api.com/v6/TU_CLAVE_DE_API/latest/USD
   ```
4. Haz clic en "Send" para enviar la solicitud.
5. Revisa la respuesta en formato JSON y verifica las tasas de cambio disponibles.

Ejemplo de respuesta JSON:

```json
{
  "base_code": "USD",
  "conversion_rates": {
    "EUR": 0.85,
    "JPY": 110.53,
    "GBP": 0.75
  }
}
```

---

## **Flujo de Trabajo**

1. **Conexión a la API**: El programa utiliza `HttpClient` para realizar solicitudes al endpoint de tasas de cambio.
2. **Análisis de Respuesta**: Los datos JSON devueltos por la API se parsean con Gson para extraer las tasas de cambio.
3. **Interacción con el Usuario**: A través de un menú interactivo en consola, el usuario puede seleccionar monedas, ingresar un valor y realizar conversiones.
4. **Cálculo de Conversión**: El programa calcula el valor convertido usando las tasas de cambio actuales y muestra el resultado en consola.

---

## **Autor**

**Jaime Rossi Serrano**

