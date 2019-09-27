package edu.escuelaing.arep;

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
                + "  Columna 1:<br>"
                + "  <input type=\"text\" name=\"columna1\" value=\"\" required"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "</body>"
                + "</html>";
        
        return pageContent;
    }
	
	private static String operaciones(Request req, Response res) {
        String pageContent;
        String[] c1 = req.queryParams("columna1").split(" ");
        double[] columna1 = leer(c1);
        
        URL pag = ("https://dnjydh351e.execute-api.us-east-1.amazonaws.com/Beta?value=" + columna1[0]);
        BufferedReader leeUrl = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Escriba la url");
		//String urll = leeUrl.readLine();
		//URL url = new URL(urll);
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(pag.openStream()))) {
			String inputLine = null;
			while ((inputLine = reader.readLine()) != null) {
				p.println(inputLine);
			}
		} catch (IOException x) {
			System.err.println(x);
		}
        
        
        
        
        
        /*pageContent
        = "<!DOCTYPE html>"
        + "<html>"
        + "<body>"
        + "<h2>Los resultados son:</h2>"
        + "<h3 style=\"color:red;\">Columna 1:</h3>"
        + "<h4>"+"CUADRADO:"+"  "+String.format("%.2f", cuadrado)+"</h4>";
        
        return pageContent;*/
		return null;
	}
	
	
	
	
    
    public static Integer square(Integer i){
        return i*i;
    }
}
