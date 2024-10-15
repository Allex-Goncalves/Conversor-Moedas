# Currency Converter Application

This is a Java-based terminal application that allows users to convert currencies in real-time and visualize historical exchange rate data. The application uses the [ExchangeRate-API](https://www.exchangerate-api.com/) to fetch current exchange rates and display a graph with the historical exchange rates.

## Features

- **Real-Time Currency Conversion**: Convert currencies like USD, EUR, BRL, ARS, and COP.
- **User-Friendly Terminal Menu**: Navigate through an intuitive terminal menu for selecting currency pairs.
- **Historical Data Visualization**: Display a line graph with the historical exchange rates for the last year.
- **Object-Oriented Design**: The application follows object-oriented design principles with a modular structure.
- **Extensible Architecture**: Easily extend the application to add new currency pairs or conversion features.

## Technologies Used

- **Java 21**: Core language used for development.
- **Maven**: Build and dependency management tool.
- **Gson**: Used for parsing JSON responses from the API.
- **ExchangeRate-API**: API used to retrieve real-time exchange rates and historical data.

## Project Structure

- ┌── ConversorMoedas/
- │├── src/
- ││├── main/ 
- │││ ├── java/
- │││ │ ├── github.com.allex_goncalves/ 
- │││ │ │ ├── Main.java <span style="color:yellow;"># Main entry point</span>
- │││ │ │ ├── Menu.java <span style="color:yellow;"># Handles the menu logic</span>
- │││ │ │ ├── ApiIntegration.java <span style="color:yellow;"># Handles API requests</span> 
- │││ │ │ ├── DollarConverter.java <span style="color:yellow;"># Handles USD conversions</span> 
- │││ │ │ ├── EuroConverter.java <span style="color:yellow;"># Handles EUR conversions</span>
- │││ │ └── resources/
- │└── test/
- ├── .gitgnore <span style="color:yellow;"># File to ignore files and directories in Git</span>
- ├── pom.xml <span style="color:yellow;"># Maven project configuration</span>
- └── README.md <span style="color:yellow;"># Project documentation</span>


## Installation and Setup

1. **Clone the repository**:
    ```bash
    git clone https://github.com/Allex-Goncalves/Conversor-Moedas.git
    cd ConversorMoedas
    ```

2. **Install Maven Dependencies**:
   Ensure you have Maven installed. If not, download it from [Maven Installation Guide](https://maven.apache.org/install.html). Run the following command to install project dependencies:
    ```bash
    mvn clean install
    ```

3. **Get Your API Key**:
    - Visit [ExchangeRate-API](https://www.exchangerate-api.com/) and register for a free API key.
    - Open `ApiIntegration.java` and replace `YOUR_API_KEY` with your actual API key.

4. **Run the Application**:
   After setting up everything, you can run the application using the following command:
    ```bash
    mvn exec:java -Dexec.mainClass="github.com.allex_goncalves.Main"
    ```

## Usage

1. **Main Menu**:
    - The application will display the main menu where you can select currencies for conversion (e.g., USD, EUR).

2. **Currency Conversion**:
    - Once a currency is selected, enter the amount to be converted, and the application will fetch real-time exchange rates using the ExchangeRate-API.


## Example Usage

1. On the terminal, select the currency you want to convert (e.g., `Dollar $`).
2. Choose the conversion type (e.g., `Dollar $ => Real R$`).
3. Enter the amount you wish to convert, and the result will be displayed.

## Dependencies

- **Java 21**: Ensure Java 21 is installed on your machine.
- **Maven**: For project building and dependency management.
- **Gson**: For parsing JSON data from the API.

Add the following Maven dependencies in your `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
</dependencies>
```


