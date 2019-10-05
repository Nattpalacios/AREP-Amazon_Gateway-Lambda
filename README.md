# AREP-Amazon_Gateway-Lambda

1. En Services abrimos IAM y una vez dentro vamos a la pestaña Roles y damos clic en Create role.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/1.png)

2. Seleccionamos Lambda y damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/2.png)

3. Buscamos LambdaFullAccess y lo seleccionamos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/3.png)

4. Le damos un nombre al rol y lo creamos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/4.png)

5. Una vez creado debe aparecernos dentro de los roles.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/5.png)

6. Ahora, en Services, vamos a Lambda y entramos a la pestaña Functions y damos clic en Create function.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/6.png)

7. Decimos el nombre de nuestra función, nos aseguramos de que sea Java 8. En permissions indicamos que vamos a usar un rol que existe y buscamos el rol que creamos anteriormente.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/7.png)

8. Ahora vamos a subir el .jar. Guardamos los cambios y creamos nuestro Test.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/8.png)

9. Creamos el test, guardamos los cambios.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/9.png)

10. Probamos que nuestro test haya quedado bien.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/10.png)

11. En Services buscamos API Gateway y damos clic en Get Started.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/11.png)

12. Le damos nombre a nuestra API y la creamos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/12.png)

13. Creamos un método GET.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/13.png)

14. En la sección URL Query String Parameters agregamos una variable.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/14.png)

15. Vamos a la pestaña Integration Request y en la sección URL Query String Parameters mapeamos la variable que agregamos anteriormente.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/15.png)

16. Bajamos y en la sección Mapping Templates escogemos la segunda opción, agregamos application/json y abajo escribimos $input.params("value") para indicar que entrará un parámetro.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/16.png)

17. En el botón Actions damos clic en Deploy API y escogemos la opción New stage.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/17.png)

18. Una vez desplegada, en la parte superior nos aparece la URL con la que podemos acceder.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/18.png)

19.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/19.png)

20.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/20.png)

21.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/21.png)

22.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/22.png)

23.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/23.png)

24.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/24.png)

![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/25.png)

![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/26.png)

![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/27.png)

![](https://raw.githubusercontent.com/Nattpalacios/AREP-Amazon_Gateway-Lambda/master/imagenes/28.png)
