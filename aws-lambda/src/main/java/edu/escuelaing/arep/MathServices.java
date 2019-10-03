package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import static spark.Spark.*;

import spark.Request;
import spark.Response;

public class MathServices {

    /**
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        //setPort(4567);
        port(getPort());
        get("/inputdata", (req, res) -> introducirDatos(req, res));
        get("/results", (req, res) -> operaciones(req, res));
    }

    private static String introducirDatos(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>CUADRADO DE UN NUMERO</h2>"
                + "<h3>Escriba el numero que desea elevar al cuadrado</h3>"
                + "<form action=\"/results\">"
                + "  Numero:<br>"
                + "  <input type=\"text\" name=\"numero\" value=\"\" required>"
                + "  </br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "</body>"
                + "</html>";

        return pageContent;
    }

    private static String operaciones(Request req, Response res) throws MalformedURLException, IOException {
        String pageContent;
        pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>El resultado es:</h2>"
                + "<h4style=\"color:red;\">" + "CUADRADO: ";
        BufferedReader leeUrl = new BufferedReader(new InputStreamReader(System.in));
        URL url = new URL("https://487w3xcmwj.execute-api.us-east-1.amazonaws.com/Beta?value=" + req.queryParams("numero"));
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                pageContent += inputLine;
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        pageContent += "</h4>";
        return pageContent;
    }

    public static double[] leer(String leida[]) {
        int size = leida.length;
        double[] lista = new double[size];

        for (int i = 0; i < size; i++) {
            lista[i] = Double.parseDouble(leida[i]);
        }

        return lista;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
    public static Integer square(Integer i) {
    	return i*i;
    }
}
