# 🌐 Conversor de Moneda

[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![API](https://img.shields.io/badge/API-ExchangeRate-blue.svg)](https://www.exchangerate-api.com/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](https://opensource.org/licenses/MIT)

Un conversor de monedas en tiempo real desarrollado en Java que utiliza la API de ExchangeRate para obtener las tasas de cambio más actualizadas. Permite realizar conversiones entre diferentes divisas con una interfaz de línea de comandos fácil de usar.

## 📋 Características

- Conversiones predefinidas entre monedas populares:
  - USD ↔ ARS (Dólar - Peso Argentino)
  - USD ↔ BRL (Dólar - Real Brasileño)
  - USD ↔ COP (Dólar - Peso Colombiano)
- Opción para convertir entre cualquier par de divisas usando códigos ISO
- Tasas de cambio en tiempo real
- Interfaz de línea de comandos intuitiva
- Manejo de errores y validación de entrada

## 🛠️ Tecnologías Utilizadas

- Java 17
- GSON para manejo de JSON
- HttpClient para peticiones HTTP
- ExchangeRate API v6

## 📥 Requisitos Previos

- Java JDK 17 o superior
- Conexión a Internet (para obtener las tasas de cambio en tiempo real)
- Maven (para gestión de dependencias)

## ⚙️ Instalación

1. Clona el repositorio:
```bash
git clone https://github.com/maurotrillos/Conversor-de-moneda.git
```

2. Navega al directorio del proyecto:
```bash
cd Conversor-de-moneda
```

3. Compila el proyecto:
```bash
mvn clean install
```

## 🚀 Uso

1. Ejecuta la aplicación:
```bash
java -jar target/conversor-de-moneda.jar
```

2. Selecciona una opción del menú:
   - Opciones 1-6: Conversiones predefinidas
   - Opción 7: Conversión personalizada
   - Opción 8: Salir

3. Sigue las instrucciones en pantalla para ingresar la cantidad a convertir.

### 💡 Ejemplo de Uso

```plaintext
1) Dólar =>> Peso Argentino.
2) Peso Argentino =>> Dólar.
3) Dólar =>> Real Brasileño.
4) Real Brasileño =>> Dólar.
5) Dólar =>> Peso Colombiano.
6) Peso Colombiano. =>> Dólar.
7) Divisa Distinta.
8) Salir.

Seleccione una opción: 1
Digite la cantidad en Dólar: 100
```

## 🏗️ Estructura del Proyecto

```
src/
├── main/
│   └── java/
│       └── com/
│           └── maurotrillos/
│               └── conversordemoneda/
│                   ├── clientconversor/
│                   │   └── Conversor.java
│                   ├── modelos/
│                   │   └── Moneda.java
│                   └── main/
│                       └── Main.java
```

## 🤝 Contribución

Las contribuciones son bienvenidas. Para contribuir:

1. Haz un Fork del proyecto
2. Crea una nueva rama (`git checkout -b feature/AmazingFeature`)
3. Haz commit de tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Haz Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## 📝 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

## 👤 Autor

- Mauro Trillos
- GitHub: [@maurotrillos](https://github.com/maurotrillos)

## 🙏 Agradecimientos

- [ExchangeRate API](https://www.exchangerate-api.com/) por proporcionar las tasas de cambio en tiempo real
